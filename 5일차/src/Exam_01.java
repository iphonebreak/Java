/**
 			<달력 만들기>
 			월을 입력받아 해당하는 월의 날짜를 출력하는 프로그램
 			(규칙)
 			1,3,5,7,8,10,12월은 31일까지
 			4,6,9,11월은 30일까지
 			2월은 28일까지만 있다
 			시작하는 요일은 계산할 필요가 없으며 다음과 같이 나오도록 만든다
 			<결과화면>
 			확인하고 싶은 달 : 5
 			일		월		화		수		목		금		토
 			1		2		3		4		5		6		7
 			8		9		10		11		12		13		14
 			15		16		17		18		19		20		21
 			22		23		24		25		26		27		28
 			29		30		31
 */

import java.util.*;
public class Quiz_06 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		int day =0;
		
		//날짜 계산
		switch(month){
		case 1:case 3:case 5:case 7:case 8:case 10: case 12:
			day = 31;	break;
		case 4:case 6:case 9:case 11:
			day = 30; break;
		case 2:
			day = 28; break;
		}
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<=day; ++i){
			System.out.print(i+"\t");
			if(i%7==0) System.out.println();
		}
	}
}

