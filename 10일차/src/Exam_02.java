//���� ���� ���α׷�
class bank{
	private String name;//������
	private int money;//���ݾ�
	public static float rate;//��������
	//static 1. rate��� �׸��� ���α׷� ���۽� �޸𸮿� ��ϵȴ�.
	//         2. ��� rate��� �׸��� �� ���� �����Ѵ�.
	
	public bank(String name, int money, float rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	public void info()
	{
		System.out.printf("�̸� : %s, ���� : %d�� , ����: %.1f%%\n",name, money,rate*100); 
	}
	
}

public class Exam_02 {
	public static void main(String[] ar){
		//���� ����
		
		bank b1= new bank("���缮", 10000,0.05f);
	
		//2�ð��� 
		bank b2= new  bank("��ȣ��",10000,0.02f);
		b1.rate=0.02f;
		
		//2�ð���
		bank b3= new bank("�ŵ���",10000,0.04f);
		b1.rate=0.04f;
		b2.rate=0.04f;
		
		//��������
		b1.info();
		b2.info();
		
		
		
		
		
		
	}
}
