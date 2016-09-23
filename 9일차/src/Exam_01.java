//접근제한자 (커피자판기)

class coffeeMachine{ //커피자판기 클래스
	private int coffee;
	private int sugar;
	private int prima;
	private int milk;
	private int cup;
	private int money;
	
	//제어문, 반복문, 출력 등은 메소드 내부에만 사용가능
	
	//허락해주는 행동을 메소드로 정의 (public)
	//허락할수 있는 행동은 2가지 (설정, 확인)
	
	//커피와 컵은 설정 가능하도록 허락해주겠다.(Setter 메소드 생성)
	public void setcoffee(int coffee){
		if(coffee<0)
		{
			System.out.println("장난하냐?");
			
		}
		this.coffee=coffee;
	}
	
	public void setCup(int cup) {
		if(cup<0){
			System.out.println("장난함");
		}
		this.cup = cup;
	}

	//확인하는 용도의 메소드 생성(getter 메소드)
	public int getcup()
	{
		return cup;
	}

	//정보 확인 메소드
	public void info()
	{
		System.out.println("커피가루 : "+coffee);
		System.out.println("설탕 : "+sugar);
		System.out.println("프림 : "+prima);
		System.out.println("우유 : "+milk);
		System.out.println("컵 : "+cup);
		System.out.println("돈 : "+money);
	}
}
public class Exam_01 {
	public  static void main(String [] ar)
	{
		coffeeMachine mac=new coffeeMachine();
		
		//허락된 행동들
		mac.setcoffee(-500);					//1. 커피를 추가
		mac.setCup(50);						//2. 컵을 추가
		int c= mac.getcup();					//3. 컵 개수 확인
		System.out.println("컵은 "+c+"개");
		mac.info();								//4. 모든 정보 출력
//		mac.coffee=-500;
//		mac.sugar=-30;
//		mac.milk=20000;
//		mac.cup=-200;
//		mac.prima=-5000;
//		mac.money=-39900;
		
		mac.info();
	}
}
