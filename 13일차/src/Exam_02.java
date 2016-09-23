//Date 클래스
import java.util.Date;
import java.text.*;;
public class Exam_02 {
	public static void main (String[] ar)
	{
		Date today = new Date();
//		System.out.println(today);
		
		//java.text 패키지 내용
		//날짜형식을 편하게 수정하도록 해주는 클래스 생성
		
		SimpleDateFormat sdf= new SimpleDateFormat("y년 M월 d일 E요일 [h시 m분 s초]"); //("형식")
		
		System.out.println(sdf.format(today));
		
		
		//다음의 날짜형식을 만들어 출력 하세요
		//2015 년 1월 21일 수요일 [오후 7시 38분 2초]
		
		//숫자 형식 클래스
		//1,000,000
		//# : 불필요한 0 생략 / 0 : 불필요한 0도 출력
		DecimalFormat df=new DecimalFormat("0.000"); //("형식");
		System.out.println(df.format(1));
		
		
		
		
		
	}
}
