import java.awt.*;

class MyFrame_06 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	//MenuBar : 메뉴를 설정할수 있는공간
	private MenuBar bar = new MenuBar();
	
	//Menu : 하위 메뉴를 거느리고 있는 메뉴
	private Menu file = new Menu("파일");
	private Menu edit = new Menu("편집");
	
	private Menu color = new Menu("색상선택");
		
	//MenuItem : 하위 메뉴를 가지고 있지 않는 메뉴
	private MenuItem fnew = new MenuItem("새파일");
	private MenuItem fopen = new MenuItem("파일열기");
	private MenuItem fsave = new MenuItem("파일저장");
	private MenuItem fexit = new MenuItem("종료");;
	
	//CheckboxMenuItem : check가 가능한 MenuItem
	private CheckboxMenuItem red = new CheckboxMenuItem("빨강");
	private CheckboxMenuItem blue = new CheckboxMenuItem("파랑");
	private CheckboxMenuItem yellow = new CheckboxMenuItem("노랑");
	
	
	public void menu(){
		//메뉴와 관련된 설정
				this.setMenuBar(bar);
				bar.add(file);
				file.add(fnew);
				
				file.addSeparator();//구분선 추가
				
				file.add(fopen); file.add(fsave);	
				
				file.addSeparator();
				
				file.add(fexit);
				bar.add(edit);
				edit.add(color);
				color.add(red);
				color.add(blue);
				color.add(yellow);
	}
	
	public void init(){
		//화면 구성 요소 배치
	}
	public MyFrame_06(String title){
		super(title);//제목 설정
		this.menu();
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

public class Exam_06 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_06 mf = new MyFrame_06("AWT 실습!");
	}
}

