//method(메소드)
//-메소드는 class 내부에 만들어진다.
//-메소드는 다른 메소드와 분리된 공간에 만들어야 한다.
//-main()도 하나의 메소드 이다.

public class Exam_02 {
	public static void main(String [] ar){
		System.out.println("메인 시작");
		//메소드를 사용하기 위한 호출(메소드 호출)
		//이름(요구하는 데이터)
		func1(); 
		func2(10);
		func3("문장",3.14);
		int a=func4();   //func4()를 수행한 결과가 int이므로 int형 변수에 저장
		
		double b = func5(3.141592);
		System.out.println(b);
		
		System.out.println("메인 종료");
		
	}
	//메소드 만들기
	//public static 반환형 메소드명(매개변수) {}
	
	//1. 매개변수 : x, 반환형 : x
	public static void func1(){
		System.out.println("func1 실행");
	}
	
	//2. 매개변수 : O, 반환형 : X (void)
	public static void func2(int a){
		System.out.println("func2 실행 :"+a);
	}
	
	//3. 매개변수 : 여러개 (String 1개 , double 1개), 반환형 : X(void)
	public static void func3(String str, double b){
		System.out.println("func3 실행"+str+","+b);
	}
	
	//4. 매개변수 : X, 반환형 : int(무조건 1개)
	public static int func4(){
		return 30;  //func4()를 종료시키면서 30을 반환하겠다.
		
		//return의 의미
		//1. 메소드를 종료시킨다. return 이후에 코드를 적으면 오류
		//2. 나를 호출한 곳에 결과값을 돌려주겠다.  return 값;
	}
	
	//5. 매개변수 : double 1개,  반환형: double
	public static double func5(double a){
		return a*a; //a의 제곱을 돌려준다.
	}
	
}
