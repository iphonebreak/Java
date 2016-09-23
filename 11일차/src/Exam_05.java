//다형성
class Teacher{//강사 클래스
	String name;
	
	public void teach(){
		System.out.println("강의 한다: ");
	}
}

class Hwang extends Teacher{ //황인빈
	int tall;
	public Hwang(){
		name="황인빈";
		tall=180;
	}
	
	public void game(){
		System.out.println(name+"이 게임을 합니다.");
	}
	
	public void biliard(){
		System.out.println(name+"이 당구를 칩니다");
	}
	
	public void eat(){
		System.out.println(name+"이 군것질 합니다");
	}
	
	//강의 메소드 오버라이드(재정의)
		public void teach(){
			System.out.println(name+"이 강의를 합니다.");
		} 
}

class Yun extends Teacher{
	
}
public class Exam_05 {
	public static void main(String[] ar){
		//Hwang의 객체 생성
		Hwang hwang= new Hwang();
		
		hwang.game();
		hwang.biliard();
		hwang.eat();
		hwang.teach();
		
		//출근 : 황인빈 -> 강사
		//1. 가족이라는 공통점
		//2. 크기가 Teacher가 더 크다.
		Teacher teacher =hwang; //자동형 변환
		//Teacher teacher =new Hwang(); -> 이렇게 표현도 가능
		
		hwang.game();
		hwang.biliard();
		hwang.eat();
		hwang.teach();
	
		//멤버필드는 어디까지 접근이 되는가?
		System.out.println(teacher.name);
//		System.out.println(teacher.tall);
		//퇴근 : 원래의 나로 되돌린다.
		Hwang h=(Hwang)teacher; //강제형 변환 , down-casting(다운캐스팅)
//		Yun y=(Yun)teacher; //불가 : 원래 Hwang의 객체이므로
		System.out.println(h.name);
		System.out.println(h.tall);
		
	
	
	}
	
}
