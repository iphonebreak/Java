
import java.awt.*;
class MyFrame_07 extends Frame{
	//창에 배치하고 싶은 구성요소(컴포넌트)들을 생성
	
	//button : 누르면 들어가는 컴포넌트
	private Button bt1= new Button ("버튼1");
	private Button bt2= new Button ("버튼2");
	
	
	public MyFrame_07(String title){
		super(title);	//제목설정
		
		//버튼 2개를 frame에 추가
		this.add(bt1);
		this.add(bt2);
		
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
public class Exam_07 {
	public static void main(String[] ar){
		MyFrame_07 mf=new MyFrame_07("AWT 실습!");
	}
}
