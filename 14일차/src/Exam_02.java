//Map - Hashtable
import java.util.*;
public class Exam_02 {
	public static void main(String []ar){
		//저장소 생성
		Hashtable<String,String> ht = new Hashtable();
		
		//데이터 추가 : put(key, value); 별도의 지시 없으면 object로 저장
		ht.put("유재석","개그맨");
		ht.put("정준하","개그맨");
		ht.put("노홍철","개그맨");
		ht.put("정형돈","개그맨");
		ht.put("박명수","개그맨");
		ht.put("하하","개그맨");
		ht.put("길","가수");
		
		//value 수정
		ht.put("하하", "가수");
		
		//하하의 직업 확인 : key 값으로 value 값 확인 : get(key)
		String tmp = ht.get("하하");
		System.out.println("하하의 직업은"+tmp);
		
		//삭제 : remove()
		String str = ht.remove("노홍철");
		System.out.println(str);
		
		//key값 확인 : containskey()
		if(ht.containsKey("노홍철") System.out.println("노홍철 있음!");
		else System.out.println("노홍철 없음!");
		
		//value 값 확인 : containsValue()
		if(ht.containsValue("가수")) System.out.println("가수 있음");
		else System.out.println("가수 없음");
		
		//크기 확인 : size()
		System.out.println("멤버수  : "+ht.size());
	
		//전체 추출
		Enumeration<String> enu = null;
		
		//전체 key 추출 : keys()
		enu = ht.key();
		while(enu.hasMoreElements()){//it.hasNext()
			String name = enu.nextElement(); //it.next()
			//name을 가지고 뭘할수 있는가???????/
			String job = ht.get(name);
			System.out.println(name+"님의 직업은" + job);
		}
		
		//전체 value 추출 : elements()
		enu = ht.elements();
		while(enu.hasMoreElements()){
			String job = enu.nextElement();
			//value로 할수 있는것?????
			System.out.println("직업 :"+job);
		}
	
	
	
	
	
	}
}
