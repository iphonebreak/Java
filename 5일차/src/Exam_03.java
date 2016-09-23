import java.util.Scanner;

//while
public class Exam_03 {
	public static void main(String[] ar)
	{
		Scanner sc= new Scanner (System.in);
		
		int total =0;
		int count = 0;
		
		//수 입력: 여러번
		while(true)
		{
			//수 입력: 여러번
			System.out.print("수 : ");
			int su= sc.nextInt();
			
			//수 비교 (음수 ,0, 양수)
			if(su>0)
			{
				total += su;//누적합계계산
				count ++;//누적횟수 계산
			}
			
			else
			{
				System.out.println("지금까지의 합계 : "+total);
				System.out.println("지금까지의 평균 : "+(double)total/count);
			
			
			//종료하는 방법3가지
			
			//while문 탈출
			break; //if제외한 {}탈출 : while문
			
			//main()을 실행종료
			//System.exit(0);
			//0은 정상 종료 , 나머지는 비정상 종료
			}
		}
	}
}
