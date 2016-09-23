//set - HashSet
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Exam_04 {
	public static void main(String [] ar){
		//저장소 생성 (로또 통을 만들었다.)
		HashSet <String> hs= new HashSet<String>();
		
		//데이터 추가 : add()
		String tmp = new String ("유재석");
		boolean a = hs.add(tmp); //String -> Object 업캐스팅
		boolean b = hs.add(tmp);
		System.out.println(a);
		System.out.println(b);
		hs.add("정형돈");
		hs.add("정준하");
		hs.add("하하");
		hs.add("박명수");
		hs.add("노홍철");
		hs.add("길");
		
		//데이터 삭제 : remove()
		boolean d= hs.remove("길")
		if(d) System.out.println("길을 탈퇴 시켰습니다.");
		else System.out.println("길은 무한도전 멤버가 아닙니다.");		
		
		//데이터 존재 확인 :  contains()
		boolean c=hs.contains("길");
		if(c) System.out.println("길은 무한도전 멤버입니다.");
		else System.out.println("길은 무한도전 멤버가 아닙니다.");
		
		//데이터 개수 확인 : size()
		System.out.println("데이터 개수 : "+hs.size());
		
		//데이터 전체 추출 : hs는 순서가 없으므로 다른곳으로 옮겨담는다.
		//방법1: Iterator라는 일자형 통에 옮기겠다.
		Iterator<String> it = hs.iterator(); //hs 전체 데이터 복사(HashSet ->Iterator)
		while(it.hasNext()){
			Object obj = it.next(); //있으면 가져와라
			String name = (String)obj; //다운캐스팅
			//String name = (String)it.next();
			
			//Generic을 사용해서 다운캐스팅이 필요없다.
			String name = it.next();
			
			//가지고와서 어떻게 할것인가?~~~~~~~
			System.out.println("이름 : "+name);
		}
		
		//방법2: 배열에 옯겨담아 처리 하겠다.
		String[] arr = new String[hs.size()];
		//hs-> arr로 복제
		hs.toArray(arr);
		
		//for(자료형 변수명 : 저장소)
		for(String name : arr){
			System.out.println("이름(배열) : "+name);
		}
		
		
	}
}
