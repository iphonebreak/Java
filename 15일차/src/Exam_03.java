//강제 예외 : 내가 만드는 예외 클래스
import java.util.*;
class MoneyException extends Exception {
	private int money;
	
	public MoneyException(int money){
		this.money = money;
	}
	//Exception의 getMessage() 오버라이드
	public String getMessage(){
		return money+"원 ?니가 무슨 자선사업가냐?";
	}
}
public class Exam_03 {
	public static void main(String [] ar){
		Scanner sc = new Scanner (System.in);
		
		try{
		System.out.println("얼마 갖고싶니? : ");
		int money = sc.nextInt();
		
		if(money <=0){	//강제로 내가 만든 에외를 발생 시키겠습니다.
			throw new MoneyException(money);
		}
		System.out.println(money+"원이 생겼습니다.");
		}catch(Exception e){
			System.err.println(e.getMessage());	//예외 원인 출력
		}
	}
}
