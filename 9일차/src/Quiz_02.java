/**	접근제한자(public, private) 문제
 		Computer라는 클래스를 만들어서 다음의 정보를 설정하세요
 		구성요소는 이름, 제조사, 가격
 		 - 이름 : 최초 1회 설정 후 변경 불가, 확인 가능
 		 - 제조사 : 최초 1회 설정 후 변경 불가, 확인 가능
 		 - 가격 : 수시로 설정 가능, 단 10만원 미만은 설정 불가
 		 
 		1번객체 : (이름) 아티브탭 , (제조사) 삼성 , (가격) 99900
 		2번객체 : (이름) Gram , 	   (제조사) LG   , (가격) 130000
 		3번객체 : (이름) 맥북air   , (제조사) 애플 , (가격) 300000
 		
 		설정 후 모든 정보 출력
 */

import java.util.*;
class Computer{
	private String name;//이름 : 최초 1회 설정 후 변경 불가, 확인 가능
	private String company;//제조사 : 최초 1회 설정 후 변경 불가, 확인 가능
	private int price;//가격 : 수시로 설정 가능, 단 10만원 미만은 설정 불가, 확인 가능
	
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
			System.out.println("그가격엔 안팔아~");
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
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("제조사 : ");
			String company = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			com[i] = new Computer(name, company, price);
		}
		
		for(int i=0; i<com.length; ++i){
			System.out.printf("이름 : %s, 제조사 : %s, 가격 : %d\n",
			com[i].getName(), com[i].getCompany(), com[i].getPrice());
		}
		
//		Computer c1 = new Computer("아티브탭", "삼성", 99900);
//		Computer c2 = new Computer("Gram", "LG", 130000);
//		Computer c3 = new Computer("맥북air", "애플", 300000);
//		
//		System.out.printf("이름 : %s, 제조사 : %s, 가격 : %d\n",
//								c1.getName(), c1.getCompany(), c1.getPrice());
//		System.out.printf("이름 : %s, 제조사 : %s, 가격 : %d\n",
//				c2.getName(), c2.getCompany(), c2.getPrice());
//		System.out.printf("이름 : %s, 제조사 : %s, 가격 : %d\n",
//				c3.getName(), c3.getCompany(), c3.getPrice());
	}
}



