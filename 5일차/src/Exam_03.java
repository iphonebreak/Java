import java.util.Scanner;

//while
public class Exam_03 {
	public static void main(String[] ar)
	{
		Scanner sc= new Scanner (System.in);
		
		int total =0;
		int count = 0;
		
		//�� �Է�: ������
		while(true)
		{
			//�� �Է�: ������
			System.out.print("�� : ");
			int su= sc.nextInt();
			
			//�� �� (���� ,0, ���)
			if(su>0)
			{
				total += su;//�����հ���
				count ++;//����Ƚ�� ���
			}
			
			else
			{
				System.out.println("���ݱ����� �հ� : "+total);
				System.out.println("���ݱ����� ��� : "+(double)total/count);
			
			
			//�����ϴ� ���3����
			
			//while�� Ż��
			break; //if������ {}Ż�� : while��
			
			//main()�� ��������
			//System.exit(0);
			//0�� ���� ���� , �������� ������ ����
			}
		}
	}
}
