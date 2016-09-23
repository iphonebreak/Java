/**
 		<메소드 만들기>
 		메소드를 만들 때에는 반환형, 이름, 매개변수 개수만 정하면 됩니다!
 		다음의 형태를 갖는 메소드를 구현하여 main()에서 사용 후 출력
 		 		
 		1. 정수 1개를 건네어주면 1~수 사이의 무작위값 1개를 반환하는 메소드
 		2. 1부터 100 사이의 무작위값 1개를 반환하는 메소드
 		3. 숫자 한개를 입력받아서 반환하는 메소드
 		4. 수 2개를 건네어 주면 합계를 구해서 반환하는 메소드
 		5. 문장 1개를 건네주면 해당 내용을 화면에 출력하는 메소드
 		6. 메소드 호출시 Hello JAVA!를 화면에 출력하는 메소드
 		7. 전달받은 수의 세제곱을 화면에 출력하는 메소드
 		8. 전달받은 수의 절대값을 계산하여 화면에 출력하는 메소드
 		
 */
import java.util.*;
public class Quiz_01 {
	public static void main(String[] ar){
		int a = random1();
		System.out.println("a = " + a);
		int b = random2(5);
		System.out.println("b = " + b);
		int c = input();
		System.out.println("c = " + c);
		float d = total(3.14f, 1.23f);
		System.out.println("d = " + d);
		
		output1("문장");
		output2();
		sejegop(5);
		abs(-200);
	}
//	1. 정수 1개를 건네어주면 1~수 사이의 무작위값 1개를 반환하는 메소드
	public static int random2(int a){
		int b = (int)(Math.random()*a)+1;
		return b;
	}
//	2. 1부터 100 사이의 무작위값 1개를 반환하는 메소드
	public static int random1(){
		int a = (int)(Math.random()*100)+1;
		return a;
	}
//	3. 숫자 한개를 입력받아서 반환하는 메소드
	public static int input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("수 : ");
		int su = sc.nextInt();
		return su;
	}
//	4. 수 2개를 건네어 주면 합계를 구해서 반환하는 메소드
	public static float total(float a, float b){
		return a+b;
	}
//	5. 문장 1개를 건네주면 해당 내용을 화면에 출력하는 메소드
	public static void output1(String msg){
		System.out.println(msg);
	}
//	6. 메소드 호출시 Hello JAVA!를 화면에 출력하는 메소드
	public static void output2(){
		System.out.println("Hello JAVA!");
	}
//	7. 전달받은 수의 세제곱을 화면에 출력하는 메소드
	public static void sejegop(int a){
		System.out.println(a*a*a);
	}
//	8. 전달받은 수의 절대값을 계산하여 화면에 출력하는 메소드
	public static void abs(int su){
		if(su<0) su *= -1;
		System.out.println("절대값 : " + su);
	}
}























