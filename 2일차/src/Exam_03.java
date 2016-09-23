
public class Exam_03 {
	public static void main(String[] ar){
//논리 부정연산자
		boolean a=false;
		System.out.println(a);
		System.out.println(!a);
		
	//비트 부정 연산자
		int c= 3;
		System.out.println(~c);
		System.out.println(~c);
		System.out.println(~c+1);
		
	//증감연산자
		int d=10;
		System.out.println(d++);	//나중에 1증가 : 출력->증가: 10
		System.out.println(++d);	//먼저 1 증가 : 증가-> 출력 : 12
		System.out.println(--d);		//먼저 1감소 -> 출력 :11
		System.out.println(d--);		//나중에 1감소 : 출력 -> 감소 : 11
		
	//산술 연산자 : /와 %만  주의 하면 된다.
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3);
		System.out.println(10.0/3.0);
		
		System.out.println(10%3);
		System.out.println(10%3.0);
		System.out.println(10.0%3);
		System.out.println(10.0%3.0);
		
		//%연산자의 활용
		System.out.println(100%2); //나머지 0이므로 2의 배수 : 짝수
		System.out.println(101%2); //나머지 1이므로 2의 배수 
		
		//shift 연산자
		System.out.println(7<<2); //28
		System.out.println(7>>2); //1
		
		//비트 연산자 -숫자
		System.out.println (7&4);	//4
		System.out.println (7|4);	//7
		System.out.println (7^4);	//3
		
		//비트 연산자  - 논리 : 이때만큼은 0을 거짓, 1을 참이라고 생각해도 좋다.
		System.out.println(true&false); //& : 둘다 참이면 참
		System.out.println(true|false); //| : 둘다 거짓이면 거짓
		System.out.println(true^false); //^: 둘이 다르면 참
		
		//연결 연산자
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//삼항연산자 : (조건)? 참인경우 : 거짓인경우 
		int lotto = 1;
		String action =(lotto==1)?"일때려친다.":"열심히 일하세요";
		System.out.println("내가 해야할행동 : "+action);
	
		//배정대입연산자
		byte a1=10;
		byte a2 = 5;
		//a1을 a2 만큼 증가시키겠다.
		//a1= (byte)(a1+a2);
		a1+=a2;
	
	
	
	}
}