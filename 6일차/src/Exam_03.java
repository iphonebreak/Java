//�迭�� �ߺ�����
import java.util.*;
public class Exam_03 {
	public static void main(String []ar)
	{
		Scanner sc=new Scanner (System.in);
		
		//��ȯ�� ���� ���ڸ� �Է� �޴´�.
		System.out.println("���? : ");
		int size=sc.nextInt();
		
		//size��ŭ ����� ����(x,y)
		int x[] = new int [size];
		int y[] = new int [size];
		
		for(int i=0; i<size; ++i)
		{
			x[i]= (int)(Math.random()*101);//0~100
			y[i]= (int)(Math.random()*101);//0~100
			
			//�����ڿ� �ߺ��˻� 
			//�񱳴�� - ���� : ��ó�� ���� , ���� : �� �չ� ����, ����: 1
			for(int j=0; j<i; ++j)
			{
				if(x[i]==x[j] && y[i]==y[j]//��ǥ�� ���ٸ�
						System.out.println("�ߺ�!");
				i--; break;
			}
		}
		
		//�ݺ����� �̿��� ���
		for (int i=0; i<size; ++i)
		{
			System.out.printf("%d��° ���� : %d,%d�� ��ȯ!\n ",i,x[i],y[i]);
			
		}
		
	}
}
