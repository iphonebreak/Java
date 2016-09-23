
import java.awt.*;
class MyFrame_10 extends Frame{
	//창에 배치하고 싶은 구성요소(컴포넌트)들을 생성
	
	//BorderLayout : 중심에 무게를 둔 레이아웃
	private BorderLayout bl = new BorderLayout(); 	//(x간격, y간격)
	private Button bt1 =new Button("버튼1");
	private Button bt2 =new Button("버튼2");
	private Button bt3 =new Button("버튼3");
	private Button bt4 =new Button("버튼4");
	private Button bt5 =new Button("버튼5");
		
	public MyFrame_10(String title){
		super(title);	//제목설정
		
		this.setLayout(bl);
		//this.setLayout(new BorderLayout());
		
		this.add("Center",bt1);	//("방향", 컴포넌트)
		this.add(bt2, BorderLayout.NORTH);
		this.add(bt3, BorderLayout.WEST);
		this.add(bt4, BorderLayout.EAST);
		this.add(bt5, BorderLayout.SOUTH);
		
		super.setSize(400,300);//크기설정
		// 위치 설정
		Dimension screen= Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getHeight()/2-super.getHeight()/2);
		int ypos=(int)(screen.getWidth()/2-super.getWidth()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		//크기변경 설정
		//설정마치고 보여주기
	}
}
public class Exam_10 {
	public static void main(String[] ar){
		MyFrame_10 mf=new MyFrame_10("AWT 실습!");
	}
}
