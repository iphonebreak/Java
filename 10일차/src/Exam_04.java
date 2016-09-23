//final : 마지막
//변수에 붙으면 : 값설정이 마지막 (최초 1회 설정이후의 변경은 불가
//메소드 : 메소드 수정이 마지막
//클래스 : 상속이 마지막
class A04{
	//상수 : public static final -내가 이름 붙이는수 변하지 않은 수
	public static final double PI=3.141592;
	
	public static double random(){
		return  Math.random();
	}
}

public class Exam_04 {
	public static void main(String[] ar)
	{
		//반지름이 5인 원의 넓이를 구하고 싶다면?
		A04.PI=3.0;
		System.out.println(5*5*A04.PI);
		System.out.println(5*5*Math.PI);
		
		System.out.println(A04.random());
		System.out.println(Math.random());
	}
}
