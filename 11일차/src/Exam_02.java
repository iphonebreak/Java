
class A02 extends Object {//아무것도 적지 않으면 jvm이 자동 빌드
	public String toString(){
		return "내맘대로 고쳐봅시다.~!";
	}
}


public class Exam_02 {
	public static void main(String[] ar){
		//만약 A02의 객체를 만든다면 무엇을 할수 있는가?
		A02 ap=new A02();
		
		System.out.println(ap.getClass());
		System.out.println(ap.toString());
		System.out.println(ap);
		
	}
}
