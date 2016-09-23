/**	<문제>	아파트 주차장 관리 프로그램
 		작성해야 할 메소드 : 
 		input() - 차량번호를 입력받는 메소드
 		check() - 등록된 차량인지 검사하는 메소드, 임의의 차량번호와 비교
 		execute() - 등록된 차량이면 통과, 등록되지 않은 차량이면 
 						통과 불가라는 메세지를 출력하는 메소드
 		반드시 위의 3개 메소드를 이용하여 처리하세요
 		이용 순서 혹은 방법은 자유입니다.
	(참고) 문자열의 비교는 ==로 하지 않고 equals라는 메소드를 이용합니다.
	(예) 	String str = "hi";
			String str2 = "hi";
 			System.out.println(str.equals(str2)); -> true
 	<출력 결과>
 	차량 번호 입력 : 42다 8282
 	등록된 차량입니다. 통과하셔도 좋습니다.	
 	차량 번호 입력 : 13사 7979
 	등록되지 않은 차량입니다... 돌아가세요.
 */
import java.util.*;
public class Quiz_02 {
	public static void main(String [] ar)
	{
		System.out.println("차량번호 입력: ");
		String num = input();
		boolean bool=check(num);
	    execute(bool);
	}
	
	public static String input()
	{
		Scanner sc=new Scanner (System.in);
		String num=sc.nextLine();
		return num;
	}
	
	public static boolean check(String num)
	{
		if(num.equals("42다 8282")) return true;
		else return false;
	}
	
	public static void execute(boolean bool)
	{
		if(bool)		System.out.println("등록된 차량입니다. 통과하세요");
		else 			System.out.println("등록되지 않은 차량입니다.");
	}
}
