import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

//String class : 문자열에 관련된 자료형
public class Exam_06 {
	public static void main(String[] ar){
		String str = "Hello JAVA!";//저장위치 : 상수 및 메소드부
		String str1 = new String("Hello JAVA!");//문자열 이용 객체 생성
		byte[] by = new byte[]{'H','e','l','l','o',' ','J','A','V','A','!'};
		String str2 = new String(by);//byte[] 이용 객체 생성
		
		//비교
		
		//논리적 비교
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2)); //대소문자 무시
		
		//사전적 비교 : ASCII 코드 값 비교
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		
		//검사기능
		String str3="aaa@naver.com";
		
		//@를 가지고 있느냐? indexOf()	- 해당 문구의 위치를 변환
		System.out.println(str3.indexOf("@")); 	//"@"를 포함하는가 (여러글자)
		
		//.com으로 종료하는지 확인 
		System.out.println(str3.endsWith(".com"));
		
		//a로 시작 하는지 확인
		System.out.println(str3.startsWith("a"));
		
		//길이 확인
		System.out.println(str3.length());
		
		//문자열조작
		String str4 = "                          대한민국   만세          ";
		System.out.println(str4);
		System.out.println(str4.length());
		System.out.println(str4.trim());
		System.out.println(str4.trim().length());
		
		//잘라내기
		System.out.println(str.substring(6));				//6번째 부터 ~~~ JAVA!
		System.out.println(str.substring(6,10));			//6~9번째 까지	  JAVA
		
		//분해하기 : 구별자(구별기호)
		String str5="이름//나이//성별//주소//희망분야//수강기간";
		String[] arr = str5.split("//");
		
//		for(int i=0; i<arr.length; ++i)
		for(String tmp : arr){ 					//자료형 변수명 : 저장소
			System.out.println(tmp);
		}
		
		//변환
		
		//문장-> 기본 자료형 : 반환 가능한 데이터일 경우만 가능
		boolean a=Boolean.parseBoolean("true");
		int b=Integer.parseInt("100");
		double c=Double.parseDouble("3.141592");
		char d=str.charAt(0); //'H'
		
		//기본자료형 -> 문장 : String.valueOf();
		String e;
		e = String.valueOf(a);
		e = String.valueOf(b);
		System.out.println(e+1);
		e = String.valueOf(c);
		e = String.valueOf(d);
		
		
		//사용자 정의 자료형 -> String
		Scanner sc= new Scanner (System.in);
		String imsi=sc.toString();
		System.out.println(imsi);
				
		
	}
}

























