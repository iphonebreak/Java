//상속의 사용법
class A01{
	int x=10;
	int y=20;
}

class B01 extends A01{ //B01 클래스의 부모로  
	public void disp()
	{
		//부모자식 관게를 일때의 x,y의 출력
		System.out.println();
		
		
		//x,y를 출력하고 싶다면?
//		A01 ap=new A01();
//		System.out.println("x="+ap.x);
//		System.out.println("y="+ap.y);
	}
}
public class Exam_01 {
	public static void main(String [] ar){
		B01 bp=new B01();
		bp.disp();
	}
}
