//���������� (Ŀ�����Ǳ�)

class coffeeMachine{ //Ŀ�����Ǳ� Ŭ����
	private int coffee;
	private int sugar;
	private int prima;
	private int milk;
	private int cup;
	private int money;
	
	//���, �ݺ���, ��� ���� �޼ҵ� ���ο��� ��밡��
	
	//������ִ� �ൿ�� �޼ҵ�� ���� (public)
	//����Ҽ� �ִ� �ൿ�� 2���� (����, Ȯ��)
	
	//Ŀ�ǿ� ���� ���� �����ϵ��� ������ְڴ�.(Setter �޼ҵ� ����)
	public void setcoffee(int coffee){
		if(coffee<0)
		{
			System.out.println("�峭�ϳ�?");
			
		}
		this.coffee=coffee;
	}
	
	public void setCup(int cup) {
		if(cup<0){
			System.out.println("�峭��");
		}
		this.cup = cup;
	}

	//Ȯ���ϴ� �뵵�� �޼ҵ� ����(getter �޼ҵ�)
	public int getcup()
	{
		return cup;
	}

	//���� Ȯ�� �޼ҵ�
	public void info()
	{
		System.out.println("Ŀ�ǰ��� : "+coffee);
		System.out.println("���� : "+sugar);
		System.out.println("���� : "+prima);
		System.out.println("���� : "+milk);
		System.out.println("�� : "+cup);
		System.out.println("�� : "+money);
	}
}
public class Exam_01 {
	public  static void main(String [] ar)
	{
		coffeeMachine mac=new coffeeMachine();
		
		//����� �ൿ��
		mac.setcoffee(-500);					//1. Ŀ�Ǹ� �߰�
		mac.setCup(50);						//2. ���� �߰�
		int c= mac.getcup();					//3. �� ���� Ȯ��
		System.out.println("���� "+c+"��");
		mac.info();								//4. ��� ���� ���
//		mac.coffee=-500;
//		mac.sugar=-30;
//		mac.milk=20000;
//		mac.cup=-200;
//		mac.prima=-5000;
//		mac.money=-39900;
		
		mac.info();
	}
}
