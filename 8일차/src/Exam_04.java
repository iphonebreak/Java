
class Marine
{
	String name;
	int age;
	String job;
	int year;
	
	Marine()
	{
		job="����";
		year =2;
	}
	
	Marine (String name)
	{
		//�� �⺻ ������ ȣ��
		this();
		this.name=name;
		
	}
	
	Marine(String name, int age){
		this(name);
		this.age = age;
	}
	
	void info()
	{
		System.out.println("�̸�: "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+ job);
		System.out.println("�����Ⱓ : "+year);
	}
}
public class Exam_04 {
	public static void main(String [] ar){
		
	//���� 3�� ����
	Marine m1 = new Marine();
	Marine m2 = new Marine("�͹̳����� ");
	Marine m3 = new Marine("��罺 ������",50);
	
	m1.info();
	m2.info();
	m3.info();
	
	}
}
