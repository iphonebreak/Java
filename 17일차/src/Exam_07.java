import java.awt.*;

class MyFrame_07 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	private Label lb = new Label("당신의 혈액형은? ",Label.CENTER);
	
	//Choice : 누르면 펼쳐지는 선택형창 
	private Choice ch = new Choice();
	
	public void init(){
		//화면 구성 요소 배치
		this.setLayout(new GridLayout(2,1));
		this.add(lb);
		ch.add("A형");
		ch.add("B형");
		ch.add("AB형");
		ch.add("O형");
		this.add(ch);
	}
	public MyFrame_07(String title){
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

public class Exam_07 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_07 mf = new MyFrame_07("AWT 실습!");
	}
}

