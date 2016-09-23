//배열의 중복제거
import java.util.*;
public class Exam_03 {
	public static void main(String []ar)
	{
		Scanner sc=new Scanner (System.in);
		
		//소환할 몬스터 숫자를 입력 받는다.
		System.out.println("몇마리? : ");
		int size=sc.nextInt();
		
		//size만큼 저장소 생성(x,y)
		int x[] = new int [size];
		int y[] = new int [size];
		
		for(int i=0; i<size; ++i)
		{
			x[i]= (int)(Math.random()*101);//0~100
			y[i]= (int)(Math.random()*101);//0~100
			
			//뽑은뒤에 중복검사 
			//비교대상 - 시작 : 맨처음 몬스터 , 종료 : 내 앞방 까지, 증가: 1
			for(int j=0; j<i; ++j)
			{
				if(x[i]==x[j] && y[i]==y[j]//좌표가 같다면
						System.out.println("중복!");
				i--; break;
			}
		}
		
		//반복문을 이용한 출력
		for (int i=0; i<size; ++i)
		{
			System.out.printf("%d번째 몬스터 : %d,%d에 소환!\n ",i,x[i],y[i]);
			
		}
		
	}
}
