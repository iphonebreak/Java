/**
		<����>
		����, ����, ���� ������ �Է¹޾� ������ ����� ���ϴ� ���α׷�
		(������ �߻��ϴ� ����)InputMismatchException, ArimaticException
		(�߰��Ǵ� ����) ScoreException(0~100�� �̿��� ������ ��� �߻�)
		
		<��� ȭ��>
		������ �Է��ϼ��� : -50
			-> ���� -50��? �װ� ���� ������� �����ִ°̴ϱ�?
			-> ���� 900��? �װ� ���� ������� �����ִ°̴ϱ�?
			-> ���� -100��? �װ� ���� ������� �����ִ°̴ϱ�? 
 		����ó���� Exception ���� �Ͻð�, e.getMessage()�� ���� ������ ���� ���
 */
import java.util.*;
class ScoreException extends Exception{
	private String subject;
	private int score;
	
	public ScoreException(String subject, int score){
		this.subject = subject;
		this.score = score;
	}
	
	@Override
	public String getMessage() {
		String msg=subject +" "+score+"��? �װ� ������� �����ݴϱ�?";
		
	}
}
public class Quiz_02 {
	public static void main(String[] ar){
		Scanner sc= new Scanner (System.in);
		
		try{
		System.out.println("���� ���� : ");
		int korean = sc.nextInt();
		if(korean<0 || kor>100) throw new ScoreException ("����", kor);
		
		System.out.println("���� ���� : ");
		int math = sc.nextInt();
		if(math<0 || math>100) throw new ScoreException ("����", math);
		
		System.out.println("���� ���� : ");
		int english =sc.nextInt();
		if(engllish<0 || english>100) throw new ScoreException ("����", english);
		
		int sum=korean+math+english;
		double avg=korean+math+english/3.0;
		
		System.out.println("���� : "+sum);
		System.out.println("��� : "+avg);
		
		}
		
		catch(Exception e){
			System.err.println(e.getMessage()); 
		}
			
		
	}
}

/*
 * import java.util.*;

class ScoreException extends Exception{
	private String subject;
	private int score;
	
	public ScoreException(String subject, int score){
		this.subject = subject;
		this.score = score;
	}
	
	@Override
	public String getMessage() {
		String msg = subject+" "+score+"��? �װ� ���� ������� �����ִ� �̴ϱ�?";
		return msg;
	}
}

public class Quiz_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("���� : ");
			int kor = sc.nextInt();
			if(kor<0||kor>100)
				throw new Exception("���� "+kor+"��? �װ� ���� ������� �����ִ� �̴ϱ�?");
				//throw new ScoreException("����", kor);
			
			System.out.print("���� : ");
			int eng = sc.nextInt();
			if(eng<0||eng>100) 
				throw new ScoreException("����", eng);
			
			System.out.print("���� : ");
			int math = sc.nextInt();
			if(math<0||math>100) 
				throw new ScoreException("����", math);
			
			int total = kor+eng+math;
			double avg = total / 3.0;
			
			System.out.println("���� : " + total + ", ��� : " + avg);
		}catch(Exception e){
			System.err.println(e.getMessage());
		}finally{//���� �߻� ���ο� ������� ������ ����Ǵ� ����
			System.out.println("������ Ȳ�κ�");
		}
	}
}

*/










