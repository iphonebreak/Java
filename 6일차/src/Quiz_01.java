/**
		<���� ���� ���α׷�>
		������ ����� ���� �� �ֵ��� �Է��� �޾� �����ϼ���
		==============���===============
		�ο��� �Է� : 2
		1��° �̸� : ȫ�浿				(����) ���� ����ϴ� ���
		1��° ���� : 100					�� ��� = 1 + ������ ������ ���� �����
		1��° ���� : 80
		1��° ���� : 70
		2��° �̸� : �庸��
		2��° ���� : 80
		2��° ���� : 90
		2��° ���� : 20
		�̸�		����		����		����		����		����
		ȫ�浿	100		80			70			250		1
		�庸��	80			90			20			190		2
		
 */
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Quiz_01 {
	public static void main(String []ar)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("�ο��� �Է�: ");
		int size=sc.nextInt();
		sc.nextLine();
		
		String name[]=new String[size];
		int korean[]=new int[size];
		int english[]=new int[size];
		int math[]=new int[size];
		int total[]=new int[size];
		int rank[]=new int[size];
		
		
		for(int i=0; i<size; i++)
		{
			System.out.println(i+1+"��° �̸�");
			name[i]=sc.nextLine();
			System.out.println(i+1+"��° ����");
			korean[i]=sc.nextInt();
			System.out.println(i+1+"��° ����");
			english[i]=sc.nextInt();
			System.out.println(i+1+"��° ����");
			math[i]=sc.nextInt();
			
			total[i]=korean[i]+english[i]+math[i];
		}
		//���� ����ϴ� �κ�
		//�ٱ���(���� ,��, i) - 0���� ���� (size-1)�� ����� 
		for(int i=0; i<size; ++i){//0 - 0, 1, 2, ..., size-1����
			//i���濡 �ش��ϴ� ����� ������ ���
			for(int j=0; j<size; ++j){
				if(total[i] < total[j]){//������ ������ ���� ����� �߰��ϸ�
					rank[i]++;//������� +1�Ѵ�.
				}
			}
		}
			System.out.println("=========��� =============");
			System.out.println("�ο���"+size);

			System.out.println("�̸�\t����\t����\t����\t����\t����");
			
			for(int i=0; i<size; ++i)
			{
				System.out.print(name[i]+"\t");
				System.out.print(korean[i]+"\t");
				System.out.print(english[i]+"\t");
				System.out.print(math[i]+"\t");
				System.out.print(total[i]+"\t");
				System.out.print(rank[i]+"\n");
			}
			
			
		
	}

}
