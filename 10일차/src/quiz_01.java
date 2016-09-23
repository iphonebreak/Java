/**
		<문제>
		1. main()에서 output1()과 output2()를 호출해보세요
		2. output1()과 output2() 에서 각각 a를 출력하는 코드를 집어넣으시고
			출력이 되는지 확인해 보세요
		3. 출력이 안되는 메소드가 있다면 오류를 수정해 보세요
 */
class StaticMethod{
	int a = 10;
	public static void output1(){  //staticMethod.output1();
		//내가 등록되는 시점에 알고 있는 내용이 이어야 하므로
		//외부 구성요소는 static 으로 만 할수 있다.
		System.out.println(a);
	}
	public void output2(){
		System.out.println(a);
	}
}

public class quiz_01 {
	public static void main(String[] ar)
	{
		//output1() 을 호출하라 : static 
		StaticMethod.output1();
				
		//output2() 를 호출하라 : static X
		StaticMethod sm = new StaticMethod();
		sm.output2();
		
	
				
		
	}
	
}
