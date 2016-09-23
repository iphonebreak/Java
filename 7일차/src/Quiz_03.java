/**	<내가 만들어보는 출력 명령(오버로딩 사용)>
 		
	System.out.println()의 경우 
	숫자, 문자열, 배열, 객체 등등 모든 것들이 출력 가능합니다.
	output() 이라는 메소드를 만들어서 System.out.println()을 흉내내 봅시다.
 	output()을 통해서 char, int, double, String형태의 데이터를 출력
 	(참고) 기본자료형을 String으로 변환하는 명령어 : String.valueOf(값)
 	String str = String.valueOf(12345); */
public class Quiz_04 {
	public static void main(String[] ar){
		output('A');
		output(30);
		output(3.141592);
		output("안녕하세요");
	}
	public static void output(char a){
		String str = String.valueOf(a);
		output(str);
	}
	public static void output(int a){
		String str = String.valueOf(a);
		output(str);
	}
	public static void output(double a){
		String str = String.valueOf(a);
		output(str);
	}
	public static void output(String a){
		System.out.println(a);
	}
}


