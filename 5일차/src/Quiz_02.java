import java.util.*;
public class Quiz_02 {
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("�� �Է� (0����):");
			int a=sc.nextInt();
			if(a>0)
			{
				System.out.println(a/60+"�ð�"+a%60+"��" );
			}
			
			else if(a==0)
			{
				System.exit(0); //���α׷� ��������
			}
			
			else
			{
				System.out.println("������ �Է� ");
			}
		}
	}
}
