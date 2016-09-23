import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame_05 extends JFrame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	private Container con;
	
	private JButton bt1 = new JButton("버튼1");
	private JButton bt2 = new JButton("버튼2");
	
	//ImageIcon : 버튼에 올릴 이미지 아이콘
	private ImageIcon image = new ImageIcon("icon1.png");
	
	public void init(){
		//화면 구성 요소 배치
		con = this.getContentPane();
		con.setLayout(new GridLayout(1,2));
		con.add(bt1);
		con.add(bt2);
	}
	public void start(){
		//이벤트 등록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //종료상태값
	}
	
	public MyFrame_05(String title){
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
		
		try{
			Thread.sleep(2000);
			
		}catch(Exception e){}
		bt1.setIcon(image); 	//JButton에 ImageIcon 적용시키기
	}
}
public class Exam_05 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_05 mf = new MyFrame_05("AWT 실습!");
	}
}