//중첩 클래스 :  클래스 안에 존재하는 클래스
//일반 중첩 클래스 : 일반 변수와 비교하여 이해
//static 중첩 클래스 : static 변수와 비교하여 이해
//지역 중첩 클래스 : 지역변수와 비교하여 이해
class outer{	//외부 클래스
	//static 중첩 클래스
	static int y=20;
	static class static{//outer.Static
	//외부값을 가지고 올때 static 만 가능하다. (x를 가지고 올수 없다.)	
	
	}
	
	//일반 중첩 클래스
	int x=10;
	class Normal{}
	
	//지역중첩클래스
	public void disp()
	{
		int a=10;
		System.out.println(a);
		
		class Imsi{}
		Imsi imsi=new Imsi();
		//imsi가 사라지기 전에 하고 싶은걸 다하면 된다. (1회용 클래스)
	}
	
public void disp2(){
	int a=10;
	class imsi{}
}
}
public class Test1 {
	public static void main(String[] ar){
		//지역 변수 : a를 출력하라
		outer outer=new outer();
		outer.disp();
		
		//static변수 : y를 출력하라
		System.out.println(outer.y);
		
		//static 중첩클래스 : static의 객체 생성
		outer.Normal normal=ot.new Normal();
		
		//일반 변수 : x를 출력하라
		outer ot= new outer();
		System.out.println(ot.x);
		
		//일반중첩 클래스 : Normal의 객체 생성
		outer.Normal normal=ot.new Normal();
	}
}
