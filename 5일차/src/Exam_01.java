/**
 			<�޷� �����>
 			���� �Է¹޾� �ش��ϴ� ���� ��¥�� ����ϴ� ���α׷�
 			(��Ģ)
 			1,3,5,7,8,10,12���� 31�ϱ���
 			4,6,9,11���� 30�ϱ���
 			2���� 28�ϱ����� �ִ�
 			�����ϴ� ������ ����� �ʿ䰡 ������ ������ ���� �������� �����
 			<���ȭ��>
 			Ȯ���ϰ� ���� �� : 5
 			��		��		ȭ		��		��		��		��
 			1		2		3		4		5		6		7
 			8		9		10		11		12		13		14
 			15		16		17		18		19		20		21
 			22		23		24		25		26		27		28
 			29		30		31
 */

import java.util.*;
public class Quiz_06 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� : ");
		int month = sc.nextInt();
		int day =0;
		
		//��¥ ���
		switch(month){
		case 1:case 3:case 5:case 7:case 8:case 10: case 12:
			day = 31;	break;
		case 4:case 6:case 9:case 11:
			day = 30; break;
		case 2:
			day = 28; break;
		}
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i=1; i<=day; ++i){
			System.out.print(i+"\t");
			if(i%7==0) System.out.println();
		}
	}
}

