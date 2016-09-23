import java.util.*;
public class Quiz_01 {
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 :");
		System.out.println("2의 10승은"+multiple(2,10)+"입니다.");
	}
	
	public static int multiple(int a, int b)
	{
		System.out.println("a="+a+", b="+b);
		if(b==1) return a;
				
		return a* multiple(a,b-1); //a^(b-1)
	}

}
