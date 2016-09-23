//클래스 - 구조체 관점

//클래스는 클래스 바깥 부분에 작성할 수 있다.

//사용자 정의 자료형 : fish
class fish //붕어빵 틀
{
	//클래스 변수 : 클래스 전체에 영향을 미치는 변수 (멤버필드)
	String name; //순서
	int pat; //팥
	int cream; //크림
	int price; //가격
}
public class Exam_02 {
	public static void main(String []ar)
	{
		//붕어빵 1개 생성
		fish f1 = new fish();
		
		//F1의 정보 설정
		f1.name="오늘 처음 만든 붕어빵";
		f1.pat=10; //10숟가락
		f1.cream=5; //5번
		f1.price=10; //10원
		
		//f1의 정보 출력
		System.out.println("이름 : "+f1.name);
		System.out.println("팥: "+f1.pat);
		System.out.println("크림 : "+f1.cream);
		System.out.println("가격 : "+f1.price);
		
		//붕어빵 한개 더 생성
		fish f2=new fish();
		
		f2.name="두번째 만든 붕어빵";
		f2.pat=5;
		f2.cream=2;
		f2.price=100;
		
		System.out.println("이름 : "+f2.name);
		System.out.println("팥: "+f2.pat);
		System.out.println("크림 : "+f2.cream);
		System.out.println("가격 : "+f2.price);
		
		fish f3=f2;
		System.out.println("이름 : "+f3.name);
		System.out.println("팥: "+f3.pat);
		System.out.println("크림 : "+f3.cream);
		System.out.println("가격 : "+f3.price);
		
	}
}
