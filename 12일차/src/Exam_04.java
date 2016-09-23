//기본 자료형을 객체 형태로 만들어 놓은 클래스 : wrapper class
public class Exam_04 {
	public static void main(String[] ar){
		//Boolean 클래스
		//기본 자료형
		boolean a = false;
		//사용자 정의 자료형
		Boolean b = new Boolean(true);//1번 생성자
		Boolean c = new Boolean("aosidjfoaisj");//2번 생성자
		System.out.println(b);
		System.out.println(c);
		
		//기본자료형인 a는 값 이외의 다른 기능을 가질 수 없다.(저장위치 : 스택)
		//클래스형인 b,c는 값 이외의 기능을 가질 수 있다.(저장위치 : 힙)
		
		//상호간의 변환
		//기본 자료형 -> 사용자 정의 자료형 (auto-boxing) : 1.5버전
		Boolean d= false;		
		
		//사용자 정의 자료형 -> 기본 자료형 (auto - unboxing) : 1.6버전
		boolean e= new Boolean("true");
		boolean f=Boolean.FALSE; //미리 만들어진 객체
	}
}



