/**
		Mobile이라는 클래스를 만들어 다음과 같이 설정하세요
		1. 이 클래스에는 이름, 가격, 통신사를 저장할 수 있는 공간이 있습니다.
		2. 모든 저장 공간은 데이터 보호를 위해 접근을 차단합니다.
		3. 이름의 경우 최초 1회 설정 후 변경할 수 없습니다.
		4. 가격과 통신사는 수시로 변경이 가능합니다.
		5. 가격은 10만원 이상일 경우만 설정이 가능합니다.
		6. 모든 항목의 값은 확인이 가능합니다.
		7. 데이터 설정은 입력을 통해 진행합니다(Scanner)
		
		클래스 설정을 마친 후 객체를 만들어 다음의 데이터를 저장 후 출력하세요
		이름 : 갤럭시5		통신사 : SKT 		가격 : 30000
		이름 : G3				통신사 : LGT		가격 : 100000
		이름 : 아이폰6		통신사 : KT		가격 : 250000
 */
import java.util.*;
class mobile
{
	private String name;  //최초 1회 설정, 수시로 확인
	private String telecom;	
	private int	price;      //수시로 설정 , 10만원 미만 설정 불가
		
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
			System.out.println("가격은 10만원 이상일 경우만 설정이 가능합니다.");
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
		
		//공간생성 배열 3칸(Mobile)
				mobile phone[] = new mobile[3];
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("가격 : ");
				int price = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("통신사 : ");
				String telecom = sc.nextLine();
				phone[0] = new mobile(name, price, telecom);
				
				for(int i=0; i<phone.length; ++i){
					System.out.println("이름 : " + phone[i].getName() +", 가격 : " +
							phone[i].getPrice()+", 통신사 : " + phone[i].getTelecom());
				}
			}
		}