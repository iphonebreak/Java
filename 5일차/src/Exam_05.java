//���� �Է¹޴� ���α׷�
import java.util.*;
public class Exam_05 {
	public static void main(String [] ar)
	{
		Scanner sc= new Scanner (System.in);
		int score;
		do //���� ����
		{
			System.out.print("���� : ");
			score =sc.nextInt();
			
		}
		while(score<0 || score> 100);
		
		System.out.println("�Է��Ͻ� ���� :"+ score);
	}
}
