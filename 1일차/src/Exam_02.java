//import java.lang.*; //무조건 적어야 하므로 jvm이 자동 으로 적어주겠다.
public class Exam_02 {

	public static void main(String[] args) {
		//변수를 사용하는 이유
		//1. 데이터를 저장하기 위해서
		//2. 데이터를 재사용하기 위해서
		
		//공간을 생성 - 변수 선언
		
		boolean a; //논리를 보관 할수 있는 1칸 짜리 공간을 만들고 a라 부른다.
		                  //변수이름으로 사용불가인 것들 .. 적었을때 보라색이 되는 단어들
		                  //boolean public;
		
		//변수 초기화
		a = false; //a라는 공간에 false라는 값을 집어넣어라...
		//a=0; 자바에서는 0과 1은 숫자로 인식...
		
		//저장한 a값을 출력. 변수호출
		System.out.println(a);

	}

}
