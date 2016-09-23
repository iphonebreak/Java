import java.util.*;
public class Quiz_02 {
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.print("분 입력 (0종료):");
			int a=sc.nextInt();
			if(a>0)
			{
				System.out.println(a/60+"시간"+a%60+"분" );
			}
			
			else if(a==0)
			{
				System.exit(0); //프로그램 정상종료
			}
			
			else
			{
				System.out.println("음수를 입력 ");
			}
		}
	}
}
