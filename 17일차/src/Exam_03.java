//우리가 사용할 기본형태 - 상속이용
import java.awt.*;

class MyFrame_03 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	private Label lb = new Label("제목 : ", Label.RIGHT);
	
	private Button bt = new Button("등록");
	
	//TextField : 한 줄짜리 입력공간
	private TextField tf = new TextField();
		
	//TextArea : 여러 줄짜리 입력공간
	private TextArea ta = new TextArea();
	
	private Panel panel = new Panel();
	
	public void init(){
		//화면 구성 요소 배치
				this.setLayout(new BorderLayout());
				this.add(panel, BorderLayout.NORTH);
				panel.setLayout(new BorderLayout());
				panel.add(lb, BorderLayout.WEST);
				panel.add(bt, BorderLayout.EAST);
				panel.add(tf, BorderLayout.CENTER);
				this.add(ta, BorderLayout.CENTER);
			
	}
	public MyFrame_03(String title){
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

public class Exam_03 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_03 mf = new MyFrame_03("AWT 실습!");
	}
}

