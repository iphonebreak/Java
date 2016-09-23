
interface A02{
	//멤버 필드 : public static final(상수)만 가능, 안적으면 JVM 자동빌드
	public static final int A = 10;
	public static int B = 20;
	public final int C = 30;
	public int D = 40;
	int E = 50;
	//private int F = 60;
	//protected int G = 100;
	
	//멤버 메소드 : public abstract 메소드만 가능, 안적으면 JVM 자동빌드
	public abstract void info1();
	public void info2();
	void info3();
	//public static abstract void info4();
	//public final abstract void info5();
	
	//클래스
	class Inner{}
}

class B02 implements A02{

	@Override
	public void info1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info3() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Exam_02 {
	public static void main(String[] ar){
		//A02클래스의 E가 static인지 확인
		System.out.println(A02.E);
		//A02클래스의 E가 final인지 확인
		//A02.E = 100;
		
		//A02.Inner 클래스가 static인지 확인 : 객체 생성
		A02.Inner inner = new A02.Inner();
	}
}


















