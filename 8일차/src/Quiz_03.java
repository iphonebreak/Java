/**
 * 		���� : ������ ����� ���� �� �ֵ��� �����Ͻñ� �ٶ��ϴ�.
 * 		��, �������� ������ �ݵ�� �Ű����� �ִ� �����ڸ� �̿��Ͻñ� �ٶ��ϴ�.
 * 												(�⺻�����ڸ� �̿����� ���ʽÿ�)
 * 		<��� ���>
 * 		JAVA ���ӿ� ���� �� ȯ���մϴ�~!
 * 		ĳ���͸� �����ϼž� ������ ������ �� �ֽ��ϴ�.
 * 		���̵� �Է��ϼ��� : �̿������о�
 * 		�������� �Է��ϼ��� : ����
 * 		
 * 		========ĳ���Ͱ� �����Ǿ����ϴ�========
 * 		���̵� : �̿������о�
 * 		��   �� : ����
 * 		��   �� : 1
 * 		��	  �� : ������
 * 		==============================
 */
import java.util.*;
class game
{
	String ID;
	String job;
	int level;
	String rank;
	
	//this: ���� �� , ���� ��ü�� ��
	game (String ID, String job)
	{
	this.ID=ID;
	this.job=j;
	level =1;
	rank="������";
	}
	
	void info(){
		System.out.println("���̵� : " + ID);
		System.out.println("��   �� : " + job);
		System.out.println("��   �� : " + level);
		System.out.println("��   �� : " + rank);
	
}

public class Quiz_03 {
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("JAVA ���ӿ� ���Ű� ȯ���մϴ�.");
		System.out.println("ĳ���͸� �����ϼž� ������ �����Ҽ� �ֽ��ϴ�.");
		
		System.out.print("���̵� �Է��ϼ��� : ");
		String ID=sc.nextLine();
		
		System.out.println("�������� �Է��ϼ��� : ");
		String job=sc.nextLine();
		
		game cha =new game(ID,job);
		
		cha.info();
	}
}
