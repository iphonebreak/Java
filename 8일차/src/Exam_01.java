//재귀호출 실습 : Factorial 계산 프로그램
//1. 약속=fac(5) -> n!=fac(n)
//2. 규칙 : 5! = 5X4!	-> n!=nX(n-1)!
//3. 종료 : 1! =1
import java.util.*;
public class Exam_01 {
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("수 : ");
		int su =sc.nextInt();
		
		System.out.println(su+"의 팩토리얼 값은 "+fac(5)+"입니다.");
	}
	
	public static int fac(int n)
	{
		System.out.println("n="+n);
		//종료값 설정
		if(n==1) return 1; //원래 규칙을 무시하고 종료값 반환
		
		//규칙구현
		return n*fac(n-1);
	}
}
