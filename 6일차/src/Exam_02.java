//����� ������ �Է¹޾� �����ϰ� ����ϴ� ���α׷�(�̸�, ����)
import java.util.*;
public class Exam_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		//�̸��� �ڷ��� -> String
		//������ �ڷ��� -> int
		
		//����ڿ��� �迭�� ũ�⸦ �Է��ϵ��� �Ͽ� �ش� ũ�⸸ŭ ���� ����!!!
		System.out.print("�ο��� �Է� : ");
		int size = sc.nextInt();
		sc.nextLine();//����ó��
		
		//�̸� ����� �迭 sizeĭ
		String[] name = new String[size];//size���� �̸� ����
		int[] age = new int[size];//size���� ���� ����
		
		//�Է¹ޱ� : �ݺ���
		//0������� (size-1)������� ��ĭ�� �̵��ϸ� �Է¹ޱ�
		for(int i=0; i<size; ++i){
			System.out.print(i+1+"��° ����� �̸� : ");
			name[i] = sc.nextLine();
			System.out.print(i+1+"��° ����� ���� : ");
			age[i] = sc.nextInt();
			sc.nextLine();//����ó��
		}
		
		for(int i=0; i<name.length; ++i)
			System.out.println(name[i]+"���� ���̴� " + age[i]+"��");
		
		System.out.println("size = " + size);
		System.out.println("name�迭 ���� : " + name.length);
		System.out.println("age�迭 ���� : " + age.length);
	}
}




