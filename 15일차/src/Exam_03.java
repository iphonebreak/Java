//���� ���� : ���� ����� ���� Ŭ����
import java.util.*;
class MoneyException extends Exception {
	private int money;
	
	public MoneyException(int money){
		this.money = money;
	}
	//Exception�� getMessage() �������̵�
	public String getMessage(){
		return money+"�� ?�ϰ� ���� �ڼ��������?";
	}
}
public class Exam_03 {
	public static void main(String [] ar){
		Scanner sc = new Scanner (System.in);
		
		try{
		System.out.println("�� ����ʹ�? : ");
		int money = sc.nextInt();
		
		if(money <=0){	//������ ���� ���� ���ܸ� �߻� ��Ű�ڽ��ϴ�.
			throw new MoneyException(money);
		}
		System.out.println(money+"���� ������ϴ�.");
		}catch(Exception e){
			System.err.println(e.getMessage());	//���� ���� ���
		}
	}
}
