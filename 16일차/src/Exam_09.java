
import java.awt.*;
class MyFrame_09 extends Frame{
	//창에 배치하고 싶은 구성요소(컴포넌트)들을 생성
	
	//GridLayout : 표의 형식과 유사한 레이아웃 (줄, 칸)
	private GridLayout gl= new GridLayout(3,2);	//(줄, 칸, x간격)
	
	private Button bt1 =new Button("버튼1");
	private Button bt2 =new Button("버튼2");
	private Button bt3 =new Button("버튼3");
	private Button bt4 =new Button("버튼4");
	private Button bt5 =new Button("버튼5");
	private Button bt6 =new Button("버튼6");
	
	public MyFrame_09(String title){
		super(title);	//제목설정
		
		this.setLayout(gl);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		
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
public class Exam_09 {
	public static void main(String[] ar){
		MyFrame_09 mf=new MyFrame_09("AWT 실습!");
	}
}
