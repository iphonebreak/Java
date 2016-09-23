//JColorChooser : 색상환
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame_06 extends JFrame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	private Container con;
	
	public void init(){
		//화면 구성 요소 배치
		con = this.getContentPane();
	}
	public void start(){
		//이벤트 등록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //종료상태값
	}
	
	public MyFrame_06(String title){
		super(title);//제목 설정
		this.init();
		this.start();
		super.setSize(400, 300);//크기 설정
		//화면 중앙에 배치
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);//위치 설정
		super.setResizable(false);//크기 변경 불가
		super.setVisible(true);//보여주도록 설정		
		
		//색상 선택창 띄우기
		Color color = JColorChooser.showDialog(this, "색 골라봐~", Color.RED);  //(부모, "제목", 초기색상)
		//System.out.println(color);
		if(color!=null){
			con.setBackground(color);
		}
	}
}
public class Exam_06 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_06 mf = new MyFrame_06("AWT 실습!");
	}
}