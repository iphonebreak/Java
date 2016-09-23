//static 과 멤버 필드 
class StaticMember{
	//프로그램 시작 버튼을 누름과 동시에 등록된다.(StaticMember.a)
	static int a=10;
		
	//staticMember 클래스의 객체가 생성되면 메모리에 등록된다.(객체명.a)
	int b=20;
}
public class Exam_03 {
	public static void main(String [] ar){
		//a출력 하라: 외부 객체 불필요
		System.out.println(StaticMember.a);
		
		//b를 출력하라: 외부클래스 객체가 필요
		StaticMember sm=new StaticMember();
		//System.out.println(sm.a);
		System.out.println(sm.b);
	}
}
