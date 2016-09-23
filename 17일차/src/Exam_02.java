
import java.awt.*;

class MyFrame_02 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	private Label lb= new Label("좋아하는 연예인은?",Label.CENTER);
	private Label lb2= new Label("당신의 연령대는? ",Label.CENTER);
	
	//Checkbox : check 가 가능한 상자형 컴포넌트
	private Checkbox cb1 = new Checkbox("김정화");
	private Checkbox cb2 = new Checkbox("한지민");
	private Checkbox cb3 = new Checkbox("아이유");
	
	private CheckboxGroup cg = new CheckboxGroup();	//("표시 글귀", 그룹명, 선택여부)
	
	private Checkbox cb4 = new Checkbox("10대", cg, false);
	private Checkbox cb5 = new Checkbox("20대", cg, true);
	private Checkbox cb6 = new Checkbox("30대", cg, false);
			
	private Panel panel =new Panel();
	private Panel panel2 =new Panel();
	
	public void init(){
		//화면 구성 요소 배치
		this.setLayout(new GridLayout(4,1));
		this.add(lb);
		this.add(panel);
		panel.setLayout(new GridLayout(1,3));
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
	
		this.add(lb2);
		this.add(panel2);
		panel2.setLayout(new GridLayout(1,3));
		panel2.add(cb4);
		panel2.add(cb5);
		panel2.add(cb6);
	}
	public MyFrame_02(String title){
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

public class Exam_02 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_02 mf = new MyFrame_02("AWT 실습!");
	}
}

