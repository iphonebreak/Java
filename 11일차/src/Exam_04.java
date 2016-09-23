/**	����������(public, private) ����
 		Computer��� Ŭ������ ���� ������ ������ �����ϼ���
 		������Ҵ� �̸�, ������, ����
 		 - �̸� : ���� 1ȸ ���� �� ���� �Ұ�, Ȯ�� ����
 		 - ������ : ���� 1ȸ ���� �� ���� �Ұ�, Ȯ�� ����
 		 - ���� : ���÷� ���� ����, �� 10���� �̸��� ���� �Ұ�
 		 
 		1����ü : (�̸�) ��Ƽ���� , (������) �Ｚ , (����) 99900
 		2����ü : (�̸�) Gram , 	   (������) LG   , (����) 130000
 		3����ü : (�̸�) �ƺ�air   , (������) ���� , (����) 300000
 		
 		���� �� ��� ���� ���
 */
import java.util.*;
class Computer{
	private String name;//�̸� : ���� 1ȸ ���� �� ���� �Ұ�, Ȯ�� ����
	private String company;//������ : ���� 1ȸ ���� �� ���� �Ұ�, Ȯ�� ����
	private int price;//���� : ���÷� ���� ����, �� 10���� �̸��� ���� �Ұ�, Ȯ�� ����
	
	public Computer(String name, String company){
		this.name = name;
		this.company = company;
	}
	
	public Computer(String name, String company, int price){
		this(name, company);
		setPrice(price);
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<100000){
			System.out.println("�װ��ݿ� ���Ⱦ�~");
			return;
		}
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
}
//�߰��Ǵ� ������ �����ϱ� ���� �ڽ� Ŭ���� ����
class Computer2 extends Computer{
	//name, company,price,get~~~,set~~~~�� ������ ����
	
	private String as;//AS�Ⱓ�̶�� �׸��� �߰�, ����, ���� ����

	public Computer2 (String name, String company, int price, String as){
		super(name, company, price); //�θ��� ������ ȣ��
		this.setAs(as);
	}
	
	
	public String getAs() {
		return as;
	}

	public void setAs(String as) {
		this.as = as;
	}
	
	
}

public class Exam_04 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		Computer com[] = new Computer[3];
		
		for(int i=0; i<com.length; ++i){
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("������ : ");
			String company = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.println("AS�Ⱓ : ");
			String as= sc.nextLine();
			com[i] = new Computer2(name, company, price,as);
		}
		
		for(int i=0; i<com.length; ++i){
			System.out.printf("�̸� : %s, ������ : %s, ���� : %d, AS : %s\n",
			com[i].getName(), com[i].getCompany(), com[i].getPrice(),
			com[i].getAs());
		}
		}
		
//		Computer c1 = new Computer("��Ƽ����", "�Ｚ", 99900);
//		Computer c2 = new Computer("Gram", "LG", 130000);
//		Computer c3 = new Computer("�ƺ�air", "����", 300000);
//		
//		System.out.printf("�̸� : %s, ������ : %s, ���� : %d\n",
//								c1.getName(), c1.getCompany(), c1.getPrice());
//		System.out.printf("�̸� : %s, ������ : %s, ���� : %d\n",
//				c2.getName(), c2.getCompany(), c2.getPrice());
//		System.out.printf("�̸� : %s, ������ : %s, ���� : %d\n",
//				c3.getName(), c3.getCompany(), c3.getPrice());
	}
}

















