/**
 		Random, Calendar 를 조합한 문제
		<결혼 길일 추첨 프로그램>
		2016년에 결혼을 하려고 합니다.
		날짜를 무작위로 추첨하려고 하는데
		토요일하고 일요일 중에서 출력하도록 설정해 주시기 바랍니다.
		
		날짜 추첨은 1~31의 범위로 하세요
		
		<결과화면>
		==========결혼 축하==========
		당신의 길일은 2016년 7월 16일 토요일 입니다.
		=========================
 */
import java.util.*;
public class Quiz_01 {
	public static void main(String[] ar){
		Calendar cal = Calendar.getInstance();
		Random rand = new Random();
		int yoil;
		
		//연도 설정(2016년)
		cal.set(Calendar.YEAR, 2016);
		
		do{
			//날짜를 무작위로 한번 뽑아본다.
			int mm = rand.nextInt(12);//0~11
			int dd = rand.nextInt(31)+1;//1~31
			
			//추출한 날짜로 달력 변경
			cal.set(Calendar.MONTH, mm);
			cal.set(Calendar.DAY_OF_MONTH, dd);
			
			//요일 확인
			yoil = cal.get(Calendar.DAY_OF_WEEK);//1, 7
		}while(yoil!=1&&yoil!=7);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		String date = year+"년 " + month+"월 " + day+"일";
		
		String dow=null;//요일
		switch(yoil){
		case 1:dow="일요일";	break;
		case 7:dow="토요일";	break;
		}
		
		System.out.println("======결혼식 길일======");
		System.out.println(date+" "+dow);
	}
}