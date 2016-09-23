//List - ArrayList
import java.util.*;

class Mudo{
	private String name;
	public Mudo(String name){
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Exam_01 {
	public static void main(String [] ar)
	{
		//저장소 생성 : Mudo만 저장가능 하도록 설정
		ArrayList<Mudo> list= new ArrayList <Mudo>();
		
		//데이터 추가 : add()
//		list.add("유재석");
		list.add(new Mudo("유재석"));
		list.add(new Mudo("정형돈"));
		list.add(new Mudo("정준하"));
		list.add(new Mudo("노홍철"));
		list.add(new Mudo("길성준"));
		list.add(new Mudo("하하"));
		
		list.add(1, new Mudo("박명수"));	//정형돈 부터 뒤로 1칸 밀림
		
		//데이터 한개 가져오기 : get(순서)
		Mudo tmp = list.get(5);
		System.out.println(tmp.getName().equals("길성준"));
		
		//객체를 이용한 삭제
		list.remove(tmp);	//길성준 삭제
		list.remove(4);		//4번방 노홍철 삭제
		
		//List의 추출방식 : get(index)
		//for(자료형 변수명 : 저장소)
		for(Mudo mudo : list){
			System.out.println("확장for문 : "+mudo.getName());
		}
		for(int i=0; i<list.size(); ++i){
			Mudo mudo = list.get(i);
			//이후는 내마음
			System.out.println(mudo.getName());
			
		}
		//순서 뒤섞기 : 다른 외부 클래스의 메소드 도움을 받는다.
		Collections.shuffle(list);	//순서 섞기
		
		//전체 추출
		Iterator <Mudo> it = list.iterator();
		while(it.hasNext()){
			Mudo mudo = it.next();
			//데이터 추출 이후는 내마음!
			System.out.println("이름: "+mudo.getName());
		}
		
		
		
		
		
		
		
		
	}
}
