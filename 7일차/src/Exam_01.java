//�迭�� �ߺ�����
import java.util.*;
public class Exam_01 {
	public static void main(String []ar)
	{
		Scanner sc=new Scanner (System.in);
		
		//��ȯ�� ���� ���ڸ� �Է� �޴´�.
		System.out.println("���? : ");
		int size=sc.nextInt();
		
		//size��ŭ ����� ����(x,y)
		//int monster[][] =  new int[��ĥ �迭 ����][�����迭�� ũ��];
		int[][] monster = new int [2][size];
		//monster[0][size] - X��ǥ �迭
		//monster[1][size] - y��ǥ �迭
		
		
		for(int i=0; i<size; ++i)
		{
			monster[i]= (int)(Math.random()*101);//0~100
			monster[i]= (int)(Math.random()*101);//0~100
			
			//�����ڿ� �ߺ��˻� 
			//�񱳴�� - ���� : ��ó�� ���� , ���� : �� �չ� ����, ����: 1
			for(int j=0; j<i; ++j)
			{
				if(monster[i]==monster[j] && monster[i]==monster[j]//��ǥ�� ���ٸ�
						System.out.println("�ߺ�!");
				i--; break;
			}
		}
		
		//�ݺ����� �̿��� ���
		for (int i=0; i<size; ++i)
		{
			System.out.printf("%d��° ���� : %d,%d�� ��ȯ!\n ",i+1,monster[0][i],monster[1][i]);
			
		}
		
	}
}
