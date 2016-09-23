import java.awt.*;
import java.awt.event.*;
class MyFrame_00 extends Frame implements ActionListener{
	//추가하고 싶은 구성요소(컴포넌트) 생성
	private MenuBar mb = new MenuBar();
	private Menu edit = new Menu("편집");
	private Menu view = new Menu("보기");
	
	private MenuItem copy = new MenuItem("복사");
	private MenuItem paste = new MenuItem("붙여넣기");
	private MenuItem exit = new MenuItem("종료");
	
	private CheckboxMenuItem view1 = new CheckboxMenuItem("일반용");
	private CheckboxMenuItem view2 = new CheckboxMenuItem("공학용");
	
	private TextField tf = new TextField();
	
	private Button bt[] = new Button[16];
	private String str[] = new String[]{"7","8","9","+","4","5","6","-","1","2","3","*","0","=","%","/"
	};
	
	private Panel panel = new Panel();
	
	private String buffer;
	
	public void menu(){
		this.setMenuBar(mb);
		mb.add(edit);
		edit.add(copy);
		edit.add(paste);
		edit.addSeparator();//구분선
		edit.add(exit);
		
		mb.add(view);
		view.add(view1);
		view.add(view2);
	}
	
	public void init(){
		this.setLayout(new BorderLayout());
		this.add(tf, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4,4));
		for(int i=0; i<bt.length; ++i){
			bt[i] = new Button(str[i]);
			panel.add(bt[i]);
		}
	}
	
	public void start(){
		//앞으로의 이벤트 설정을 담당할 메소드
		
		//X를 누르면 창을 닫게 하겠다.(WindowEvent)
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			});
		//이벤트 설정 방법
		//지정대상.add이벤트종류(처리객체);
		
		//exit라는 메뉴를 선택하면 내가 처리하겠다.(종료)
		exit.addActionListener(this);//1+2+3단계
		copy.addActionListener(this);
		
		//반복문으로 bt배열을 한번에 이벤트 설정
		// -> bt[0]~bt[15]까지 ActionEvent 설정 후 내가 처리
		for(int i=0; i<bt.length; ++i)
			bt[i].addActionListener(this);
	}
	
	public MyFrame_00(String title){
		super(title);

		this.menu();
		this.init();	
		this.start();//이벤트 설정용 메소드

		super.setSize(400,300);//크기 설정
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2-super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2-super.getHeight()/2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ActionEvent가 발생하면 무조건 이 메소드가 실행된다.
		//System.out.println(e);
		//e에서 정보 뽑기
		//System.out.println(e.getSource());
		//System.out.println(e.getActionCommand());
		if(e.getSource()==exit){
			System.exit(0);
		}else if(e.getSource()==copy){
			System.out.println("복사하기 선택!");
		}
		
		//bt배열에 대한 이벤트 일괄처리
		for(int i=0; i<bt.length; ++i){
			if(e.getSource()==bt[i]){//i번 버튼을 누르면
				//해당 글자를 tf에 출력해 주겠다.
				String imsi = tf.getText();
				String text = bt[i].getLabel();
				tf.setText(imsi+text);
				return;
			}
		}
	}
}

public class Quiz_02{
	public static void main(String[] ar){
		MyFrame_00 mf = new MyFrame_00("AWT 예제");
	}
}








