//KeyEvent : 키보드의 입력 시 발생되는 이벤트
//KeyListener(I), KeyAdapter(C)
import java.awt.*;
import java.awt.event.*;
class MyFrame_02 extends Frame implements KeyListener{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	private TextArea ta = new TextArea();
	
	public void init(){
		//화면 구성 요소 배치
		this.add(ta);//BorderLayout.CENTER에 추가(기본값)
		ta.setFont(new Font("", Font.PLAIN, 15));
	}
	public void start(){
		//이벤트 등록
		
		//TextArea에 KeyEvent를 설정하여 내가 처리하겠습니다.
		ta.addKeyListener(this);
	}
	public MyFrame_02(String title){
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
	public void keyTyped(KeyEvent e) {
//		System.out.println("타이핑");
		System.out.println(e.getKeyChar());
		switch(e.getKeyChar()){
		case 'x' : System.exit(0);
		}
	}
	public void keyPressed(KeyEvent e) {
		System.out.println("누름");
	}
	public void keyReleased(KeyEvent e) {
		System.out.println("뗌");
	}
}

public class Exam_02 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_02 mf = new MyFrame_02("AWT 실습!");
	}
}

