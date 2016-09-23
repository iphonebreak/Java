import java.awt.*;

class MyFrame_05 extends Frame{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	
	//FileDialog : 파일열기 , 저장 창
	private FileDialog fdlg = new FileDialog(this, "메롱", FileDialog.LOAD);
	
	public void init(){
		//화면 구성 요소 배치
	}
	public MyFrame_05(String title){
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
		
		fdlg.setVisible(true);
	}
}

public class Exam_05 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_05 mf = new MyFrame_05("AWT 실습!");
	}
}

