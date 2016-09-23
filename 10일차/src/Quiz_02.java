/**
		<다음의 클래스를 이용한 결과를 main에 출력해 보세요>
		Math 클래스에서 다음을 이용
		1. PI
		2. ceil()
		3. abs()
		
		Integer 클래스에서 다음을 이용
		4. parseInt() - 매개변수 1개짜리
		5. MAX_VALUE
		6. MIN_VALUE
		
		String 클래스에서 다음을 이용
		7. equals()
 */

public class Quiz_02 {
	public static void main(String[] ar){
		System.out.println(Math.PI);
		
		double a = Math.ceil(5.1);//올림
		System.out.println(a);
		
		int b = Math.abs(5);
		int c = Math.abs(-5);
		System.out.println(b);
		System.out.println(c);
		
		int d=Integer.parseInt("10"); //String->int
		System.out.println(d);
		
		System.out.println("int의 최대값: "+Integer.MAX_VALUE);
		System.out.println("int의 최소값 : "+Integer.MIN_VALUE);
		

		String str = "안녕하세요";
		String str1 = new String("안녕하세요");
		boolean bool = str.equals(str1);
		System.out.println(bool);
		System.out.println(str==str1);
	
	}
}





