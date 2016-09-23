/**
		<성적 관리 프로그램>
		다음의 결과가 나올 수 있도록 입력을 받아 진행하세요
		==============결과===============
		인원수 입력 : 2
		1번째 이름 : 홍길동				(참고) 순위 계산하는 방법
		1번째 국어 : 100					내 등수 = 1 + 나보다 점수가 높은 사람수
		1번째 영어 : 80
		1번째 수학 : 70
		2번째 이름 : 장보고
		2번째 국어 : 80
		2번째 영어 : 90
		2번째 수학 : 20
		이름		국어		영어		수학		총점		순위
		홍길동	100		80			70			250		1
		장보고	80			90			20			190		2
		
 */
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Quiz_01 {
	public static void main(String []ar)
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("인원수 입력: ");
		int size=sc.nextInt();
		sc.nextLine();
		
		String name[]=new String[size];
		int korean[]=new int[size];
		int english[]=new int[size];
		int math[]=new int[size];
		int total[]=new int[size];
		int rank[]=new int[size];
		
		
		for(int i=0; i<size; i++)
		{
			System.out.println(i+1+"번째 이름");
			name[i]=sc.nextLine();
			System.out.println(i+1+"번째 국어");
			korean[i]=sc.nextInt();
			System.out.println(i+1+"번째 영어");
			english[i]=sc.nextInt();
			System.out.println(i+1+"번째 수학");
			math[i]=sc.nextInt();
			
			total[i]=korean[i]+english[i]+math[i];
		}
		//순위 계산하는 부분
		//바깥쪽(기준 ,나, i) - 0번방 부터 (size-1)번 방까지 
		for(int i=0; i<size; ++i){//0 - 0, 1, 2, ..., size-1번방
			//i번방에 해당하는 사람의 순위를 계산
			for(int j=0; j<size; ++j){
				if(total[i] < total[j]){//나보다 점수가 높은 사람을 발견하면
					rank[i]++;//내등수를 +1한다.
				}
			}
		}
			System.out.println("=========결과 =============");
			System.out.println("인원수"+size);

			System.out.println("이름\t국어\t영어\t수학\t총점\t순위");
			
			for(int i=0; i<size; ++i)
			{
				System.out.print(name[i]+"\t");
				System.out.print(korean[i]+"\t");
				System.out.print(english[i]+"\t");
				System.out.print(math[i]+"\t");
				System.out.print(total[i]+"\t");
				System.out.print(rank[i]+"\n");
			}
			
			
		
	}

}
