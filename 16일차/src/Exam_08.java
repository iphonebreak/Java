//우리가 사용할 기본형태 - 상속이용
import java.awt.*;
class MyFrame_08 extends Frame{
	//창에 배치하고 싶은 구성요소(컴포넌트)들을 생성
	
	//FlowLayout : 같은 자리에 컴포넌트를 계속 떨어뜨려 퍼지게 하는 레이아웃
	private FlowLayout fl= new FlowLayout(FlowLayout.LEFT);	//(정렬 상태값)
	
	private Button bt1 =new Button("버튼1");
	private Button bt2 =new Button("버튼2");
	private Button bt3 =new Button("버튼3");
	
	public MyFrame_08(String title){
		super(title);	//제목설정
		
		this.setLayout(fl);
		
		//컴포넌트 배치
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		
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
public class Exam_08 {
	public static void main(String[] ar){
		MyFrame_08 mf=new MyFrame_08("AWT 실습!");
	}
}

