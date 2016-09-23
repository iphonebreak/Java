/**
		<문제> - 난수 생성기
		Math.random(), Random 쓰지 마시고
		사용자가 원하는 개수만큼
		1~100사이의 중복 없는 무작위수를 출력해 주세요
		
		(Hint) ArrayList와 Collections.shuffle()을 이용하세요
		
		<결과화면>
		난수 개수 : 5
		5		90		35		61		42
 */
import java.util.*;

public class Quiz_01 {
	public static void main(String[] ar){
		ArrayList list= new ArrayList ();
		Scanner sc=new Scanner(System.in);
		
		for(int i=1; i<=100; ++i)	list.add(i);
		
		System.out.println("난수 개수 : ");
		int a = sc.nextInt();
		Collections.shuffle(list);
		for(int i=0; i=)
		System.out.println(list.get());
	}
		
	}
}

/*
import java.util.*;
public class Quiz_01 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("최소값 : ");
		int min = sc.nextInt();
		System.out.print("최대값 : ");
		int max = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>(max-min+1);//100칸
		
		for(int i=min; i<=max; ++i)	list.add(i);
		
		System.out.print("난수 개수 : ");
		int size = sc.nextInt();
		
		Collections.shuffle(list);//섞어주고
		
		for(int i=0; i<size; ++i){//size개만큼 출력
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
	}
}


*/