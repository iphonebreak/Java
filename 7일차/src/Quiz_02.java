/**	<����>	����Ʈ ������ ���� ���α׷�
 		�ۼ��ؾ� �� �޼ҵ� : 
 		input() - ������ȣ�� �Է¹޴� �޼ҵ�
 		check() - ��ϵ� �������� �˻��ϴ� �޼ҵ�, ������ ������ȣ�� ��
 		execute() - ��ϵ� �����̸� ���, ��ϵ��� ���� �����̸� 
 						��� �Ұ���� �޼����� ����ϴ� �޼ҵ�
 		�ݵ�� ���� 3�� �޼ҵ带 �̿��Ͽ� ó���ϼ���
 		�̿� ���� Ȥ�� ����� �����Դϴ�.
	(����) ���ڿ��� �񱳴� ==�� ���� �ʰ� equals��� �޼ҵ带 �̿��մϴ�.
	(��) 	String str = "hi";
			String str2 = "hi";
 			System.out.println(str.equals(str2)); -> true
 	<��� ���>
 	���� ��ȣ �Է� : 42�� 8282
 	��ϵ� �����Դϴ�. ����ϼŵ� �����ϴ�.	
 	���� ��ȣ �Է� : 13�� 7979
 	��ϵ��� ���� �����Դϴ�... ���ư�����.
 */
import java.util.*;
public class Quiz_02 {
	public static void main(String [] ar)
	{
		System.out.println("������ȣ �Է�: ");
		String num = input();
		boolean bool=check(num);
	    execute(bool);
	}
	
	public static String input()
	{
		Scanner sc=new Scanner (System.in);
		String num=sc.nextLine();
		return num;
	}
	
	public static boolean check(String num)
	{
		if(num.equals("42�� 8282")) return true;
		else return false;
	}
	
	public static void execute(boolean bool)
	{
		if(bool)		System.out.println("��ϵ� �����Դϴ�. ����ϼ���");
		else 			System.out.println("��ϵ��� ���� �����Դϴ�.");
	}
}
