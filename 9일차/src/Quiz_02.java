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
public class Quiz_02 {
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
			com[i] = new Computer(name, company, price);
		}
		
		for(int i=0; i<com.length; ++i){
			System.out.printf("�̸� : %s, ������ : %s, ���� : %d\n",
			com[i].getName(), com[i].getCompany(), com[i].getPrice());
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



