//Frame 만들어 보기
//- 객체 생성
//- 상속
import java.awt.*;
public class Exam_04 {
	public static void main(String [] ar){
		Frame f1= new Frame();				//1번창
		Frame f2= new Frame("하하하");	//2번창 - 제목설정
		
		//크기 (size)설정
		//f1.setSize(300, 200);	//(폭, 높이)
		f2.setSize(400, 300);
		
		//위치 (location)
//		f2.setLocation(300, 200);
		
		//화면의 중심계산
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();	//화면의 크기계산
//		System.out.println(screen);
		int xpos =	(int)(screen.getWidth()/2 - f2.getWidth()/2);	//x시작점
		int ypos = (int)(screen.getHeight()/2 - f2.getHeight()/2);//y시작점
		f2.setLocation(xpos, ypos);
		
		//크기변경 여부 설정
		f2.setResizable(false);
		
		//가시 여부 설정 : 기본값으로 안보여주도록 설정
		//f1.setVisible(true);
		f2.setVisible(true);
	}


}
