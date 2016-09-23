//클래스의 구성요소

class Toy
{ //멤버 변수 (필드) : 만들어질 객체 (물건)의 정보를 보관하는 역할
	String name; //이름
	int price;		// 가격
	
	//멤버 메소드
	void move()
	{
		System.out.println(name+"이동합니다.");
	}
	
	void info()
	{
		System.out.println("내 이름은 "+name);
		System.out.println("내 가격은 "+price);
	}
	
	//생성자 : 물건을 만들어주는 기계 (프린터)
	Toy()
	{
		//매개변수가 없는 생성자 : 기본 생성자
		//1. 클래스명과 반드시 동일한 이름을 가져야 한다.
		//2. 하나도 없으면 객체 생성이 불가하다.
		//	-  하나도 없는 경우 jvm이 기본 생성자를 1개 만들어준다.
		//3. 객체 생성시 데이터를 초기화 한다.
		name = "뽀로로";
		price =15000;
		//4. 반환형이 없다. (객체를 찍어내는 , 만드는 용도로만 사용)
		//5. 오버로딩이 가능하다.
	}
	
	Toy(String n)
	{
		name=n;
		//이름을 전달 받는 생성자
	}
	
	Toy(int p)
	{
		//가격을 전달 받는 생성자
		price=p;
	}
	
	Toy (String n, int p)
	{
		//이름과 가격을 전달받는 생성자
	}
}
public class Exam_03 {
	public static void main(String [] ar)
	{
		Toy t1 = new Toy();
		Toy t2 = new Toy("또봇");
		Toy t3 = new Toy(30000);
		Toy t4 = new Toy("꼬마버스 타요",25000);
		
		t1.info();
		t2.info();
		t3.info();
		t4.info();
		
		//생성된 장난감 들의 정보 설정
		t1.name="뽀로로";
		t1.price=15000;
		t2.name="또봇";
		t2.price=25000;
		
		//생성된 장난감들의 기능 사용
		t1.move();
		t2.move();
		
		t1.info();
		t2.info();
		
	}
}
