/**
		Mobile�̶�� Ŭ������ ����� ������ ���� �����ϼ���
		1. �� Ŭ�������� �̸�, ����, ��Ż縦 ������ �� �ִ� ������ �ֽ��ϴ�.
		2. ��� ���� ������ ������ ��ȣ�� ���� ������ �����մϴ�.
		3. �̸��� ��� ���� 1ȸ ���� �� ������ �� �����ϴ�.
		4. ���ݰ� ��Ż�� ���÷� ������ �����մϴ�.
		5. ������ 10���� �̻��� ��츸 ������ �����մϴ�.
		6. ��� �׸��� ���� Ȯ���� �����մϴ�.
		7. ������ ������ �Է��� ���� �����մϴ�(Scanner)
		
		Ŭ���� ������ ��ģ �� ��ü�� ����� ������ �����͸� ���� �� ����ϼ���
		�̸� : ������5		��Ż� : SKT 		���� : 30000
		�̸� : G3				��Ż� : LGT		���� : 100000
		�̸� : ������6		��Ż� : KT		���� : 250000
 */
import java.util.*;
class mobile
{
	private String name;  //���� 1ȸ ����, ���÷� Ȯ��
	private String telecom;	
	private int	price;      //���÷� ���� , 10���� �̸� ���� �Ұ�
		
	public String getTelecom() {
		return telecom;
	}

	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void getprice(int price)
	{
		if(price<100000)
		{
			System.out.println("������ 10���� �̻��� ��츸 ������ �����մϴ�.");
		}
		
	}
	
	public mobile(String name,String telecom){
		this.name=name;
		this.telecom=telecom;
		this.getprice(price);
	}
	public moblie(String name,String telecom, int price)
	{
		this(name);
		setPrice(price);
		this.telecom = telecom;
	}
}

public class Quiz_03 {
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner (System.in);
		
		//�������� �迭 3ĭ(Mobile)
				mobile phone[] = new mobile[3];
				
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				
				System.out.print("���� : ");
				int price = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("��Ż� : ");
				String telecom = sc.nextLine();
				phone[0] = new mobile(name, price, telecom);
				
				for(int i=0; i<phone.length; ++i){
					System.out.println("�̸� : " + phone[i].getName() +", ���� : " +
							phone[i].getPrice()+", ��Ż� : " + phone[i].getTelecom());
				}
			}
		}