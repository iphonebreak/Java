import java.awt.*;

class MyFrame_01 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	//버튼 3개
	private Button bt1 = new Button("버튼1");
	private Button bt2 = new Button("버튼2");
	private Button bt3 = new Button("버튼3");
	
	//Panel : Frame을 대신하여 레이아웃 설정 및 컴포넌트를 배치하는 투명한 공간
	private Panel panel = new Panel();
	private Panel panel2 = new Panel();
	
	public void init(){
		//레이아웃 설정 및 컴포넌트 배치
		this.setLayout(new BorderLayout());//1회용 레이아웃 객체로 설정
		this.add(panel, BorderLayout.SOUTH);
		panel.setBackground(Color.YELLOW);		
		panel.setLayout(new GridLayout(1, 2));
		panel.add(bt1);
		panel.add(panel2);
		
		panel2.setLayout(new GridLayout(2,1));
		panel2.add(bt2);
		panel2.add(bt3);
	}
	
	public MyFrame_01(String title){
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

public class Exam_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_01 mf = new MyFrame_01("AWT 실습!");
	}
}

