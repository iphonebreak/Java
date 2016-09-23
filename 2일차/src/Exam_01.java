
public class Exam_01 {

	public static void main(String[] args) {
		//정수형 자료형
		byte a=10; //byte를 저장할수 있는 a라는 공간을 만들어 10 저장!
		//a=128; 범위를 초과해서 안들어간다.
		a=127;
		a++; //a의 값을 1증가시켜라 (128?)
		System.out.println(a); //a= -128
		
		//문자를 보관하는 자료형 : char
		char b=65;
		char c='A';
		System.out.println(b);
		System.out.println(c);
		char d='ㅁ';
		System.out.println(d);
		
		//정수형 자료형의 대빵 : int
		//모든 정수형 자료형의 계산 결과가 int로 나온다.
		//char e= b+c;
		int e=b+c;
		System.out.println(e);
		
		//대빵도 아닌 주제에 int보다 큰 범위를 표현하는 long
		long f=1000L; //반드시 int와 구별해줘야 한다.
		System.out.println(f);
		
		//실수형 자료형
		float g=3.141592f; //float임을 반드시 표시해줘야 한다.
		double h=3.141592;
		
		//문자열 자료형 -string
		String name ="황인빈";
		name = "java 7시 수업";
		System.out.println(name);		
		
		
	}

}
