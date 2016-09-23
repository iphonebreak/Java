//int와 Integer 클래스

public class Exam_5 {
	public static void main(String [] ar){
		//기본자료형
		int a=10;
		//사용자 정의 자료형 (Integer)의 객체 생성
		Integer b = new Integer(12345);
		Integer c = new Integer(Messages.getString("Exam_5.0"));	//변환 가능한 숫자만 삽입 //$NON-NLS-1$
		Integer d=12345;	//오토 박싱
		
		//기본자료형을 제외한 자료형의 비교는 equals로 한다.
		System.out.println(b==d);
		System.out.println(b.equals(b));
	
		int e=b; 
		
		//String->int로 변환 하는 명령어 : parseInt()
		int g =Integer.parseInt(Messaf
				as
				f
				es.getString("Exam_5.1")); //$NON-NLS-1$
		System.out.println(g);
		System.out.println(g+1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
				
		
	
	}
}
