//Ŭ���� - ����ü ����

//Ŭ������ Ŭ���� �ٱ� �κп� �ۼ��� �� �ִ�.

//����� ���� �ڷ��� : fish
class fish //�ؾ Ʋ
{
	//Ŭ���� ���� : Ŭ���� ��ü�� ������ ��ġ�� ���� (����ʵ�)
	String name; //����
	int pat; //��
	int cream; //ũ��
	int price; //����
}
public class Exam_02 {
	public static void main(String []ar)
	{
		//�ؾ 1�� ����
		fish f1 = new fish();
		
		//F1�� ���� ����
		f1.name="���� ó�� ���� �ؾ";
		f1.pat=10; //10������
		f1.cream=5; //5��
		f1.price=10; //10��
		
		//f1�� ���� ���
		System.out.println("�̸� : "+f1.name);
		System.out.println("��: "+f1.pat);
		System.out.println("ũ�� : "+f1.cream);
		System.out.println("���� : "+f1.price);
		
		//�ؾ �Ѱ� �� ����
		fish f2=new fish();
		
		f2.name="�ι�° ���� �ؾ";
		f2.pat=5;
		f2.cream=2;
		f2.price=100;
		
		System.out.println("�̸� : "+f2.name);
		System.out.println("��: "+f2.pat);
		System.out.println("ũ�� : "+f2.cream);
		System.out.println("���� : "+f2.price);
		
		fish f3=f2;
		System.out.println("�̸� : "+f3.name);
		System.out.println("��: "+f3.pat);
		System.out.println("ũ�� : "+f3.cream);
		System.out.println("���� : "+f3.price);
		
	}
}
