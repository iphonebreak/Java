/**	상속 문제
 		우리는 9일차 3번 문제에서 Mobile이라는 클래스를 사용했었습니다.
 		하지만 관리 항목의 변경이 필요해졌고, 
 		고민 끝에 기존에 사용하던 이름, 가격, 통신사 외에 
 		할인, 결합상품 이라는 항목을 추가하기로 하였습니다.
		String sale : 할인, 설정 가능, 확인 가능
		String pack : 결합상품, 설정 가능, 확인 가능

 		프로그램을 처음부터 새로 만들지 말고 기존의 내용을 활용하여
 		해당하는 정보를 설정하고 출력해보세요
 		<정보>
이름 : 갤럭시5	
	통신사 : SKT 	가격 : 30000		할인 : 없음		결합상품 : 인터넷
	
이름 : G3			
	통신사 : LGT	가격 : 100000	할인 : 제휴카드 신청시		결합상품 : TV
	
이름 : 아이폰6	
	통신사 : KT	가격 : 250000	할인 : 제휴카드 신청시		결합상품 : 없음
 		
 */

import java.util.*;
class Mobile{
	private String name;//이름 - 최초1회 설정, 수시로 확인
	private int price;//가격 - 수시로 설정, 수시로 확인, 10만원 미만 설정 불가
	private String telecom;//통신사 - 수시로 설정, 수시로 확인
	
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
			System.out.println("그가격엔 안팔아~!");
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
	//추가될 항목 : sale, pack
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
		
		//공간생성 배열 3칸(Mobile)
		Mobile phone[] = new Mobile[3];
		
		for(int i=0; i<phone.length; ++i){
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("통신사 : ");
			String telecom = sc.nextLine();
			
			System.out.println("할인 : ");
			String sale=sc.nextLine();
			
			System.out.println("결합상품 : ");
			String pack=sc.nextLine();
			phone[i] = new Mobile(name, price, telecom,sale,pack);
		}
		
		for(int i=0; i<phone.length; ++i){
			System.out.println("이름 : " + phone[i].getName() +", 가격 : " +
					phone[i].getPrice()+", 통신사 : " + phone[i].getTelecom()+"할인 : "+phone[i].getSale()+"결합상품 : "+phone[i].getpack());
		}
	}
}
