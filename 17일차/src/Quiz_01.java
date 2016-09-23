import java.awt.*;

class MyFrame_001 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	private Label lb = new Label("전화기 예제", Label.CENTER);
	
	//버튼 12개
	private Button[] bt = new Button[12];//아직 버튼 안만들어졌다.
	//제목 배열
	private String[] str = 
			new String[]{"1","2","3","4","5","6","7","8","9","*","0","#"};
	
	private Panel panel = new Panel();
	
	//Font : 글자와 관리하는 클래스
	private Font font = new Font("",Font.BOLD, 30);	//("글꼴", 형태 , 크기);
	
	//Color : 색상을 관리하는 클래스
	private Color color = new Color (124,235,149);     //(R, G, B)
	
	//Cursor : 커서를 관리하는 클래스
	private Cursor cursor = new Cursor(Cursor.SW_RESIZE_CURSOR); //(커서 모양값)
	
	public void init(){
		//화면 구성 요소 배치
		this.setLayout(new BorderLayout());
		this.add(lb, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 3));
		
		//Frame의 배경색 지정
		this.setBackground(color);
		
		//lb에 글꼴 Font를 적용
		lb.setFont(font);
		lb.setForeground(Color.darkGray);
		lb.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		//panel에 버튼 12개 추가
		for(int i=0; i<bt.length; ++i){
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("",Font.ITALIC, 25));
			bt[i].setBackground(Color.cyan);
			panel.add(bt[i]);
		}
	}
	public MyFrame_001(String title){
		super(title);//제목 설정
		this.init();
		super.setSize(400, 300);//크기 설정
		//화면 중앙에 배치
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);//위치 설정
		super.setResizable(false);//크기 변경 불가
		super.setVisible(true);//보여주도록 설정		
	}
}

public class Quiz_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_001 mf = new MyFrame_001("AWT 실습!");
	}
}

