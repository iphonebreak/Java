/**
		Clock�̶�� Ŭ������ ����� ������ ������ �����ϼ���
		
		<main������>
		main������ 0���� 5���� 2�ʿ� �ѹ��� ����ϵ��� �ݺ������� �ۼ�
		
		<Clock������>
		Clock�� run()������ ���� �ð��� ������ �������� ���ѹݺ� ���
		2015�� 1�� 26�� ���� 2�� 2�� 9��
		
		- main�� ����Ǹ� �ð赵 ���� ����� �� �ֵ��� ���α׷��� �ϼ���
 */
import java.util.*;
import java.text.*;
class Clock extends Thread{
	public void run(){
		while(true){
			Date date = new Date();
			SimpleDateFormat sdf = 
				new SimpleDateFormat("y�� M�� d�� a h�� m�� s��");
			System.out.println(sdf.format(date));
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
public class Quiz_01 {
	public static void main(String[] ar){
		//Clock�� ��Ƽ ������� ����
		Clock clock = new Clock();
		clock.setDaemon(true);
		clock.start();
		
		//main������ 0���� 5���� 2�ʿ� �ѹ��� ����ϵ��� �ݺ������� �ۼ�
		for(int i=0; i<=5; ++i){
			System.out.println("i = " + i);
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}
}











