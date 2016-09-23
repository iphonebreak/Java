//점수 입력받는 프로그램
import java.util.*;
public class Exam_05 {
	public static void main(String [] ar)
	{
		Scanner sc= new Scanner (System.in);
		int score;
		do //실행 내용
		{
			System.out.print("점수 : ");
			score =sc.nextInt();
			
		}
		while(score<0 || score> 100);
		
		System.out.println("입력하신 점수 :"+ score);
	}
}
