//MouseEvent : 마우스의 입력 시 발생하는 이벤트
//처리 클래스 : MouseListener(I), MouseAdapter(C)
import java.awt.*;
import java.awt.event.*;
class EventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e) {
//		System.out.println("클릭");
//		System.out.println(e.getButton()); //무슨 버튼 눌렀냐?
//		System.out.println(e.getClickCount()); //몇번 눌렀냐?
		if(e.getClickCount()==2){
			System.out.println("더블 클릭 하셨네요");
		}
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("누름");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("뗌");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("진입");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("탈출");
	}
}
class MyFrame_01 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	private Button bt = new Button("버튼");
	
	public void init(){
		//화면 구성 요소 배치
		this.setLayout(new BorderLayout());
		this.add(bt, BorderLayout.SOUTH);
	}
	public void start(){
		//이벤트 등록
		//bt에 MouseEvent를 설정하여 남이 처리
		EventHandler event = new EventHandler();
		bt.addMouseListener(event);
	}
	public MyFrame_01(String title){
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
}

public class Exam_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_01 mf = new MyFrame_01("AWT 실습!");
	}
}


