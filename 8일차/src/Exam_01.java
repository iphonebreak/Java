//���ȣ�� �ǽ� : Factorial ��� ���α׷�
//1. ���=fac(5) -> n!=fac(n)
//2. ��Ģ : 5! = 5X4!	-> n!=nX(n-1)!
//3. ���� : 1! =1
import java.util.*;
public class Exam_01 {
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("�� : ");
		int su =sc.nextInt();
		
		System.out.println(su+"�� ���丮�� ���� "+fac(5)+"�Դϴ�.");
	}
	
	public static int fac(int n)
	{
		System.out.println("n="+n);
		//���ᰪ ����
		if(n==1) return 1; //���� ��Ģ�� �����ϰ� ���ᰪ ��ȯ
		
		//��Ģ����
		return n*fac(n-1);
	}
}
