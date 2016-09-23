//Calendar 클래스 : 시간 설정
import java.util.Calendar;
public class Exam_03 {
	public static void main(String[] ar)
	{
		//cal 이라는 이름을 붙인 달력을 사용가능
		Calendar cal=Calendar.getInstance();
		
//		System.out.println(cal);
		//원하는 시간을 설정 : set(바꿀항목, 바꿀값);
		cal.set(Calendar.YEAR,1999);
		cal.set(Calendar.MONTH,12-1);
		cal.set(Calendar.DATE, 31);
		
		
		//원하는 정보만 추출	 : get(추출할 항목의 정수값);
		int yy=cal.get(Calendar.YEAR);
		int mm=cal.get(Calendar.MONTH)+1; //월(0~11), 12는 1년의 개월수
		int dd=cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		String today = yy+ "년"+mm+"월"+dd+"일"+hour+"시"+min+"분"+sec+"초";
		System.out.println(today);
	
		//요일 확인 : 1~7 사이의 정수값(DAY_OF_WEEK)
		int yoil = cal.get(Calendar.DAY_OF_MONTH);
		
		
	}
}
