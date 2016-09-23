//사람의 정보를 입력받아 보관하고 출력하는 프로그램(이름, 나이)
import java.util.*;
public class Exam_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		//이름의 자료형 -> String
		//나이의 자료형 -> int
		
		//사용자에게 배열의 크기를 입력하도록 하여 해당 크기만큼 생성 가능!!!
		System.out.print("인원수 입력 : ");
		int size = sc.nextInt();
		sc.nextLine();//엔터처리
		
		//이름 저장용 배열 size칸
		String[] name = new String[size];//size명의 이름 보관
		int[] age = new int[size];//size명의 나이 보관
		
		//입력받기 : 반복문
		//0번방부터 (size-1)번방까지 한칸씩 이동하며 입력받기
		for(int i=0; i<size; ++i){
			System.out.print(i+1+"번째 사람의 이름 : ");
			name[i] = sc.nextLine();
			System.out.print(i+1+"번째 사람의 나이 : ");
			age[i] = sc.nextInt();
			sc.nextLine();//엔터처리
		}
		
		for(int i=0; i<name.length; ++i)
			System.out.println(name[i]+"님의 나이는 " + age[i]+"살");
		
		System.out.println("size = " + size);
		System.out.println("name배열 길이 : " + name.length);
		System.out.println("age배열 길이 : " + age.length);
	}
}




