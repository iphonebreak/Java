import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class MyFrame_01 extends JFrame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	private Container con;
	private Button bt = new Button();
	private Button bt2= new Button("시작");
	private Button bt3= new Button("다시");
	private Button bt4= new Button("종료");
	
	private Panel panel = new Panel();
	private Panel panel2 = new Panel();
		
	
	public void init(){
		//화면 구성 요소 배치
		con = this.getContentPane();
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		bt();
		panel.setLayout(new GridLayout(9,9));
		
		this.add(panel2, BorderLayout.SOUTH);
		this.setLayout(new FlowLayout());
		this.add(panel2, FlowLayout.LEFT);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
						
	}
	

	public void bt(){
		for(int i=1; i<81; i++){
			bt=new Button();
			panel.add(bt);
		}
	}
	public void start(){
		//이벤트 등록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //종료상태값
	}
	
	public MyFrame_01(String title){
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
	
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_01 mf = new MyFrame_01("AWT 실습!");
	}
}