import java.awt.*;
import java.awt.event.*;
class MyFrame_001 extends Frame implements ActionListener{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	private Button bt1 = new Button("왼쪽");
	private Button bt2 = new Button("가운데");
	private Button bt3 = new Button("오른쪽");
	
	private String msg = "버튼을 누르세요!";
	private Label lb = new Label(msg, Label.CENTER);
	
	private Panel panel = new Panel();
	
	public void init(){
		//화면 구성 요소 배치
		this.setLayout(new GridLayout(2,1));
		this.add(panel);
		panel.setLayout(new GridLayout(1,3));
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		this.add(lb);
	}
	public void start(){
		//이벤트 등록
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
	}
	public MyFrame_001(String title){
		super(title);//제목 설정
		this.init();
		this.start();//이벤트 설정 메소드
		super.setSize(400, 300);//크기 설정
		//화면 중앙에 배치
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);//위치 설정
		super.setResizable(false);//크기 변경 불가
		super.setVisible(true);//보여주도록 설정		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();//표시글자
		if(cmd.equals("왼쪽")) lb.setText("왼쪽 버튼 눌렀어요~");
		else if(cmd.equals("가운데")) lb.setText("가운데 버튼 눌렀어요~");
		else if(cmd.equals("오른쪽")) lb.setText("오른쪽 버튼 눌렀어요~");
		
//		멀티 스레드
		Thread th = new Thread(){
			public void run() {
				try{
					Thread.sleep(2000);//2초
				}catch(Exception err){}
				lb.setText(msg);//초기값
			}
		};
		th.start();
		
//		단일 스레드
//		try{
//			Thread.sleep(2000);//2초
//		}catch(Exception err){}
//		lb.setText(msg);//초기값
	}
}

public class Quiz_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_001 mf = new MyFrame_001("AWT 실습!");
	}
}

