//��Ƽ ������ : �������� �帧�� ����� ���ÿ� �����۾��� �ϰڴ�.
import javax.swing.JOptionPane;

//��Ƽ ������ Ŭ����
class Printer implements Runnable{
	public void run(){
		//2.5�ʿ� �ѹ��� #######�� ���
		while(true){
			System.out.println("#########");
		
			try{
				Thread.sleep(2500);
			}
		
		
		}
	}
}
class Timer extends Thread{
	
	//������ ���� ������ ���� �޼ҵ带 ��ģ��. (�������̵�)
	public void run(){
		int time=0;
		while(true){
			System.out.println("time= "+(++time));
		try{
			Thread.sleep(1000);  //ThreadŬ������ �ִ� ������ �Ͻ����� �޼ҵ�
		}catch(InterruptedException e){}
		}
}
}
public class Exam_02 {
	public static void main(String[] ar){
		System.out.println("���� ����");
		
		//�̸� ����� ���� ���� ���� ����
		Printer pr= new Printer();
		
		//Thread�� ������ �޴´�.
		Thread th = new Thread(); //Runnable�� ��ü
		
		//main()�� �뿹����� �δ´�.
		Timer tm = new Timer();
		tm.setDaemon(true);
		tm.start();		
		
		Timer ta=new Timer();
		//tm.run();	���� ������
		ta.start();
		
		String msg = JOptionPane.showInputDialog("�Է� : ");
		System.out.println(msg);
		
		System.out.println("���� ��");
	}
}
