//�迭�� �ߺ�����
import java.util.*;
public class quiz_02{
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
			
		}
		/*
		 * <����>
		 * ���͸� �̱� �̾ҵ絥 ��ǥ�� �ʹ� ������ؼ� ���� �ϰ� �;��
		 * x��ǥ�� ���� ���� ���� �������� ���� ���ĵǾ� ��������
		 * select-sort ����� ����Ͽ� �����ϼ���
		 * (���ǻ���) x��ǥ�� �ٲٸ� y��ǥ�� ������ �ȵ˴ϴ�.
		 */
		
		//�ݺ����� �̿��� ���
		for(int i=0; i<=x[i]-1; ++i)
		{
			for(int j=i+1; j<x[i]; ++j)
			{
				if(x[i]>x[j])
				{
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
			
		}
		
		for (int i=0; i<size; ++i)
		{
			System.out.printf("%d��° ���� : %d,%d�� ��ȯ!\n ",i,x[i],y[i]);
			
		}
		
		
		
	}
}
