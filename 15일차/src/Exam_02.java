//예외처리
import java.util.*;
public class Exam_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		//두개의 수를 입력받아 나머지 연산을 하는 프로그램
		try{
		System.out.println("수1 : ");
		int su1= sc.nextInt();	
		System.out.println("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.println(su1%su2);
		}
		catch(Exception e){
			System.err.println("에러 발생!");
			System.err.println(e.getMessage()); //원인 출력
			
			e.printStackTrace();//예외처리를 하지 않은것 처럼 에러를 보여달라
		}
//		}catch(InputMismatchException e){ 	//예외이름 변수명
//			System.out.println("숫자 입력하라고 했냐 안했냐");
//		}catch(ArithmeticException e){
//			System.out.println("초등학교는 폼으로 다녔냐");
//		
//	}
	}
}
