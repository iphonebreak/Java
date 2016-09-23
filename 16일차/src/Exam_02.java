//멀티 스레드 : 여러개의 흐름을 만들어 동시에 다중작업을 하겠다.
import javax.swing.JOptionPane;

//멀티 스레드 클래스
class Printer implements Runnable{
	public void run(){
		//2.5초에 한번씩 #######를 출력
		while(true){
			System.out.println("#########");
		
			try{
				Thread.sleep(2500);
			}
		
		
		}
	}
}
class Timer extends Thread{
	
	//가상의 메인 역할을 해줄 메소드를 고친다. (오버라이드)
	public void run(){
		int time=0;
		while(true){
			System.out.println("time= "+(++time));
		try{
			Thread.sleep(1000);  //Thread클래스에 있는 스레드 일시정지 메소드
		}catch(InterruptedException e){}
		}
}
}
public class Exam_02 {
	public static void main(String[] ar){
		System.out.println("메인 시작");
		
		//미리 만들어 놓은 가상 메인 구동
		Printer pr= new Printer();
		
		//Thread의 도움을 받는다.
		Thread th = new Thread(); //Runnable의 객체
		
		//main()과 노예계약을 맺는다.
		Timer tm = new Timer();
		tm.setDaemon(true);
		tm.start();		
		
		Timer ta=new Timer();
		//tm.run();	단일 스레드
		ta.start();
		
		String msg = JOptionPane.showInputDialog("입력 : ");
		System.out.println(msg);
		
		System.out.println("메인 끝");
	}
}
