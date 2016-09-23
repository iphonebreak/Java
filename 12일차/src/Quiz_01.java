/*
문장을 한개 입력받아 이메일 형식인지를 검사

	조건)
	1. @ 가 . 보다 먼저 나와야 한다.
	2. 마지막은 .com, .net, .co.kr 로 끝나야 한다.
	3. 한글은 사용 불가
	4. 길이는 10글자 이상

조건을 만족하면 이메일 등록 성공,
조건을 불만족하면 어떤 조건에서 문제가 생겼는지를 사용자에게 알려준다.
*/

/**
<String 문제> - 이메일 검사
조건)
1. @가 .보다 먼저 나와야 한다.
2. 마지막은 .com, .net, .co.kr로 끝나야 한다.
3. 한글은 사용 불가
4. 길이는 10글자 이상

조건을 만족하면 이메일 등록 성공
조건을 불만족하면 어떤 조건에서 문제가 생겼는지를 사용자에게 알림
 */
import java.util.*;

//import java.util.regex.Pattern;
public class Quiz_01 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);

		System.out.println("사용할 이메일 주소 : ");
		String email = sc.nextLine();

		String[] arr = email.trim().split("@");
		if (arr.length != 2) {
			System.out.println("@가 없거나 너무 많습니다.");
			return;
		}

		String prefix = arr[0];
		for (int i = 0; i < prefix.length(); ++i) {
			char tmp = prefix.toUpperCase().charAt(i);
			if (!(tmp >= '0' && tmp <= '9') && !(tmp >= 'A' && tmp <= 'Z')) {
				System.out.println("이메일 이름은 영문과 숫자만 가능");
				return;
			}
		}

		String suffix = arr[1];
		String[] domain = suffix.split("[.]");
//		for (int i = 0; i < domain.length; ++i) {
//			System.out.println(domain[i]);
//		}
		if (domain.length > 3 || domain.length < 2) {
			System.out.println("도메인 형식 오류");
			return;
		}

		for (int i = 0; i < domain.length; ++i) {
			for (int j = 0; j < domain[i].length(); ++j) {
				char tmp = domain[i].toUpperCase().charAt(j);
				if (!(tmp >= '0' && tmp <= '9') && !(tmp >= 'A' && tmp <= 'Z')) {
					System.out.println("도메인은 영문과 숫자만 가능");
					return;
				}
			}
		}

		String[] end = new String[] { ".com", ".co.kr", ".net" };
		boolean check = false;
		
		//for(int i=0; i<end.length; ++i){
		//for(자료형 변수명 : 저장소){
		for (String tmp : end) {
			if (email.endsWith(tmp)) {
				check = true;
			}
		}
		if (!check) {
			System.out.println(".com , .net , .co.kr만 사용 가능");
			return;
		}

		System.out.println("등록 성공!");
		System.out.println("등록한 이메일 : " + email);

		// Pattern을 이용한 검사

		// if(!Pattern.matches("^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$", email)){
		// System.out.println("이메일 형식에 어긋남");
		// }else{
		// System.out.println("이메일 등록 성공");
		// System.out.println(email);
		// }
	}
}







