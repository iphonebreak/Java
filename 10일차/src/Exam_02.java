//예금 관리 프로그램
class bank{
	private String name;//예금주
	private int money;//예금액
	public static float rate;//적용이율
	//static 1. rate라는 항목은 프로그램 시작시 메모리에 등록된다.
	//         2. 모든 rate라는 항목은 한 곳을 참조한다.
	
	public bank(String name, int money, float rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	public void info()
	{
		System.out.printf("이름 : %s, 예금 : %d원 , 이율: %.1f%%\n",name, money,rate*100); 
	}
	
}

public class Exam_02 {
	public static void main(String[] ar){
		//영업 시작
		
		bank b1= new bank("유재석", 10000,0.05f);
	
		//2시간뒤 
		bank b2= new  bank("강호동",10000,0.02f);
		b1.rate=0.02f;
		
		//2시간뒤
		bank b3= new bank("신동엽",10000,0.04f);
		b1.rate=0.04f;
		b2.rate=0.04f;
		
		//영업종료
		b1.info();
		b2.info();
		
		
		
		
		
		
	}
}
