import javax.swing.JOptionPane;

//단일 스레드 : 기존의 방식 (1개의 프로그램 흐름)
public class Exam_01 {
	public static void main(String[] ar){
		String msg = JOptionPane.showInputDialog("입력 : ");
		System.out.println(msg);
		
		//1투너 무한대 까지의 1초간격으로 출력
		int time=0;
		while(true){
			System.out.println("time= "+(++time));
		try{
			Thread.sleep(1000);  //Thread클래스에 있는 스레드 일시정지 메소드
		}catch(InterruptedException e){}
		}
	
	}
}
