/**
		Clock이라는 클래스를 만들어 다음의 내용을 구현하세요
		
		<main스레드>
		main에서는 0부터 5까지 2초에 한번씩 출력하도록 반복문으로 작성
		
		<Clock스레드>
		Clock의 run()에서는 현재 시간을 다음의 형식으로 무한반복 출력
		2015년 1월 26일 오후 2시 2분 9초
		
		- main이 종료되면 시계도 같이 종료될 수 있도록 프로그래밍 하세요
 */
import java.util.*;
import java.text.*;
class Clock extends Thread{
	public void run(){
		while(true){
			Date date = new Date();
			SimpleDateFormat sdf = 
				new SimpleDateFormat("y년 M월 d일 a h시 m분 s초");
			System.out.println(sdf.format(date));
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
public class Quiz_01 {
	public static void main(String[] ar){
		//Clock을 멀티 스레드로 구동
		Clock clock = new Clock();
		clock.setDaemon(true);
		clock.start();
		
		//main에서는 0부터 5까지 2초에 한번씩 출력하도록 반복문으로 작성
		for(int i=0; i<=5; ++i){
			System.out.println("i = " + i);
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}
}











