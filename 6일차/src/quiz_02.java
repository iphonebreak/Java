//배열의 중복제거
import java.util.*;
public class quiz_02{
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
			
		}
		/*
		 * <문제>
		 * 몬스터를 뽑긴 뽑았든데 좌표가 너무 어수선해서 정렬 하고 싶어요
		 * x좌표가 낮은 몬스터 부터 오름차순 으로 정렬되어 뽑히도록
		 * select-sort 방식을 사용하여 정렬하세요
		 * (주의사항) x좌표만 바꾸면 y좌표는 정렬이 안됩니다.
		 */
		
		//반복문을 이용한 출력
		for(int i=0; i<=x[i]-1; ++i)
		{
			for(int j=i+1; j<x[i]; ++j)
			{
				if(x[i]>x[j])
				{
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
			
		}
		
		for (int i=0; i<size; ++i)
		{
			System.out.printf("%d번째 몬스터 : %d,%d에 소환!\n ",i,x[i],y[i]);
			
		}
		
		
		
	}
}
