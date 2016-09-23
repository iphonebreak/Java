import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class MyFrame_05 extends Frame implements Runnable{
	//창에 배치하고 싶은 구성요소(컴포넌트)들을 이곳에 생성
	
	//Label : 글자나 그림을 보관하는 투명한 공간
	private Label lb = new Label("내가 만든 라벨!", Label.CENTER);//("표시글자", 정렬값);
	
	public MyFrame_05(String title){
		super(title);//제목 설정
		
		//구성요소(컴포넌트) Frame에 추가 : add()
		this.add(lb);//lb를 this에 추가
		//lb.setBackground(Color.YELLOW);
		
		super.setSize(400, 300);//크기 설정
		//위치 설정
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);//크기변경 설정
		super.setVisible(true);//설정 마치고 보여주기
		
		//멀티스레드 구동
//		this.start();
		Thread th = new Thread(this);
		th.setDaemon(true);
		th.start();
	}

	@Override
	public void run() {
		while(true){
			Date date = new Date();
			SimpleDateFormat sdf = 
				new SimpleDateFormat("y년 M월 d일 a h시 m분 s초");
			//System.out.println(sdf.format(date));
			//lb에 글자 표시
			lb.setText(sdf.format(date));
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
public class Exam_06 {
	public static void main(String[] ar){
		MyFrame_05 mf = new MyFrame_05("AWT 실습!");//Frame의 객체 생성
	}
}










