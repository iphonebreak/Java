import javax.swing.JOptionPane;

//���� ������ : ������ ��� (1���� ���α׷� �帧)
public class Exam_01 {
	public static void main(String[] ar){
		String msg = JOptionPane.showInputDialog("�Է� : ");
		System.out.println(msg);
		
		//1���� ���Ѵ� ������ 1�ʰ������� ���
		int time=0;
		while(true){
			System.out.println("time= "+(++time));
		try{
			Thread.sleep(1000);  //ThreadŬ������ �ִ� ������ �Ͻ����� �޼ҵ�
		}catch(InterruptedException e){}
		}
	
	}
}
