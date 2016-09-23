import java.util.*;
public class Quiz_02 {
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("수열의 자리 : ");
		int a=sc.nextInt();
		System.out.println(a+"번째 자리 숫자는"+pibo(a)+"입니다.");
		
		for(int i=1; i<=5; ++i)
		{
			System.out.print(pibo(i)+"\t");
		}
	}
	
	public static int pibo(int a)
	{
		if(a<=2) return 1;
		return pibo(a-2)+pibo(a-1);
	}
}
