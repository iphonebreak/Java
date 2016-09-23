//WindowEvent : 창을 제어하려고 하면 발생하는 이벤트
//WindowListener(I), WindowAdapter(C)
import java.awt.*;
import java.awt.event.*;
class MyFrame_03 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	public void init(){
		//화면 구성 요소 배치
	}
	public void start(){
		//이벤트 등록
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.out.println("X 누름!");
			}
			public void windowOpened(WindowEvent e) {
				System.out.println("창 열림!");
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("창 닫힘!");
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("활성화!");
			}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("최소화에서 벗어남!");
			}
		});
	}
	public MyFrame_03(String title){
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

public class Exam_03 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_03 mf = new MyFrame_03("AWT 실습!");
	}
}

