//Ŭ������ �������

class Toy
{ //��� ���� (�ʵ�) : ������� ��ü (����)�� ������ �����ϴ� ����
	String name; //�̸�
	int price;		// ����
	
	//��� �޼ҵ�
	void move()
	{
		System.out.println(name+"�̵��մϴ�.");
	}
	
	void info()
	{
		System.out.println("�� �̸��� "+name);
		System.out.println("�� ������ "+price);
	}
	
	//������ : ������ ������ִ� ��� (������)
	Toy()
	{
		//�Ű������� ���� ������ : �⺻ ������
		//1. Ŭ������� �ݵ�� ������ �̸��� ������ �Ѵ�.
		//2. �ϳ��� ������ ��ü ������ �Ұ��ϴ�.
		//	-  �ϳ��� ���� ��� jvm�� �⺻ �����ڸ� 1�� ������ش�.
		//3. ��ü ������ �����͸� �ʱ�ȭ �Ѵ�.
		name = "�Ƿη�";
		price =15000;
		//4. ��ȯ���� ����. (��ü�� ���� , ����� �뵵�θ� ���)
		//5. �����ε��� �����ϴ�.
	}
	
	Toy(String n)
	{
		name=n;
		//�̸��� ���� �޴� ������
	}
	
	Toy(int p)
	{
		//������ ���� �޴� ������
		price=p;
	}
	
	Toy (String n, int p)
	{
		//�̸��� ������ ���޹޴� ������
	}
}
public class Exam_03 {
	public static void main(String [] ar)
	{
		Toy t1 = new Toy();
		Toy t2 = new Toy("�Ǻ�");
		Toy t3 = new Toy(30000);
		Toy t4 = new Toy("�������� Ÿ��",25000);
		
		t1.info();
		t2.info();
		t3.info();
		t4.info();
		
		//������ �峭�� ���� ���� ����
		t1.name="�Ƿη�";
		t1.price=15000;
		t2.name="�Ǻ�";
		t2.price=25000;
		
		//������ �峭������ ��� ���
		t1.move();
		t2.move();
		
		t1.info();
		t2.info();
		
	}
}
