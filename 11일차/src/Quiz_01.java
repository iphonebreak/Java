/**	��� ����
 		�츮�� 9���� 3�� �������� Mobile�̶�� Ŭ������ ����߾����ϴ�.
 		������ ���� �׸��� ������ �ʿ�������, 
 		��� ���� ������ ����ϴ� �̸�, ����, ��Ż� �ܿ� 
 		����, ���ջ�ǰ �̶�� �׸��� �߰��ϱ�� �Ͽ����ϴ�.
		String sale : ����, ���� ����, Ȯ�� ����
		String pack : ���ջ�ǰ, ���� ����, Ȯ�� ����

 		���α׷��� ó������ ���� ������ ���� ������ ������ Ȱ���Ͽ�
 		�ش��ϴ� ������ �����ϰ� ����غ�����
 		<����>
�̸� : ������5	
	��Ż� : SKT 	���� : 30000		���� : ����		���ջ�ǰ : ���ͳ�
	
�̸� : G3			
	��Ż� : LGT	���� : 100000	���� : ����ī�� ��û��		���ջ�ǰ : TV
	
�̸� : ������6	
	��Ż� : KT	���� : 250000	���� : ����ī�� ��û��		���ջ�ǰ : ����
 		
 */

import java.util.*;
class Mobile{
	private String name;//�̸� - ����1ȸ ����, ���÷� Ȯ��
	private int price;//���� - ���÷� ����, ���÷� Ȯ��, 10���� �̸� ���� �Ұ�
	private String telecom;//��Ż� - ���÷� ����, ���÷� Ȯ��
	
	public Mobile(String name){
		this.name = name;
	}
	public Mobile(String name, int price, String telecom, String sale, String pack){
		this(name);
		setPrice(price);
		this.telecom = telecom;
		this.sale=sale;
		this.pack=pack;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price<100000){
			System.out.println("�װ��ݿ� ���Ⱦ�~!");
			return;
		}
		this.price = price;
	}
	public String getTelecom() {
		return telecom;
	}
	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	public String getName() {
		return name;
	}
}

class Mobile2 extends Mobile{
	//�߰��� �׸� : sale, pack
	private String sale;
	private String pack;
	
	public Mobile2(String name, int price, String company, 
															String sale, String pack){
		super(name, price, company);
		setSale(sale);
		setPack(pack);
	}

	public String getSale() {
		return sale;
	}

	public void setSale(String sale) {
		this.sale = sale;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}
	
}


public class Quiz_01 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		//�������� �迭 3ĭ(Mobile)
		Mobile phone[] = new Mobile[3];
		
		for(int i=0; i<phone.length; ++i){
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("��Ż� : ");
			String telecom = sc.nextLine();
			
			System.out.println("���� : ");
			String sale=sc.nextLine();
			
			System.out.println("���ջ�ǰ : ");
			String pack=sc.nextLine();
			phone[i] = new Mobile(name, price, telecom,sale,pack);
		}
		
		for(int i=0; i<phone.length; ++i){
			System.out.println("�̸� : " + phone[i].getName() +", ���� : " +
					phone[i].getPrice()+", ��Ż� : " + phone[i].getTelecom()+"���� : "+phone[i].getSale()+"���ջ�ǰ : "+phone[i].getpack());
		}
	}
}
