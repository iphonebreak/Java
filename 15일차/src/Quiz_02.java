/**
		<문제>
		국어, 영어, 수학 점수를 입력받아 총점과 평균을 구하는 프로그램
		(기존에 발생하던 예외)InputMismatchException, ArimaticException
		(추가되는 예외) ScoreException(0~100점 이외의 점수일 경우 발생)
		
		<결과 화면>
		점수를 입력하세요 : -50
			-> 국어 -50점? 그걸 지금 점수라고 보여주는겁니까?
			-> 영어 900점? 그걸 지금 점수라고 보여주는겁니까?
			-> 수학 -100점? 그걸 지금 점수라고 보여주는겁니까? 
 		예외처리는 Exception 으로 하시고, e.getMessage()를 통해 다음의 원인 출력
 */
import java.util.*;
class ScoreException extends Exception{
	private String subject;
	private int score;
	
	public ScoreException(String subject, int score){
		this.subject = subject;
		this.score = score;
	}
	
	@Override
	public String getMessage() {
		String msg=subject +" "+score+"점? 그걸 점수라고 보여줍니까?";
		
	}
}
public class Quiz_02 {
	public static void main(String[] ar){
		Scanner sc= new Scanner (System.in);
		
		try{
		System.out.println("국어 점수 : ");
		int korean = sc.nextInt();
		if(korean<0 || kor>100) throw new ScoreException ("국어", kor);
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		if(math<0 || math>100) throw new ScoreException ("수학", math);
		
		System.out.println("영어 점수 : ");
		int english =sc.nextInt();
		if(engllish<0 || english>100) throw new ScoreException ("영어", english);
		
		int sum=korean+math+english;
		double avg=korean+math+english/3.0;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
		}
		
		catch(Exception e){
			System.err.println(e.getMessage()); 
		}
			
		
	}
}

/*
 * import java.util.*;

class ScoreException extends Exception{
	private String subject;
	private int score;
	
	public ScoreException(String subject, int score){
		this.subject = subject;
		this.score = score;
	}
	
	@Override
	public String getMessage() {
		String msg = subject+" "+score+"점? 그걸 지금 점수라고 보여주는 겁니까?";
		return msg;
	}
}

public class Quiz_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			if(kor<0||kor>100)
				throw new Exception("국어 "+kor+"점? 그걸 지금 점수라고 보여주는 겁니까?");
				//throw new ScoreException("국어", kor);
			
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			if(eng<0||eng>100) 
				throw new ScoreException("영어", eng);
			
			System.out.print("수학 : ");
			int math = sc.nextInt();
			if(math<0||math>100) 
				throw new ScoreException("수학", math);
			
			int total = kor+eng+math;
			double avg = total / 3.0;
			
			System.out.println("총점 : " + total + ", 평균 : " + avg);
		}catch(Exception e){
			System.err.println(e.getMessage());
		}finally{//예외 발생 여부와 상관없이 무조건 실행되는 내용
			System.out.println("만든이 황인빈");
		}
	}
}

*/










