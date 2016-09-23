import java.util.*;
//추상 클래스 : 추상 메소드를 1개 이상 가지고 있는 클래스

//가질수 있는것들 (구성요소)
//멤버필드, 멤버메소드 , 추상 메소드(abstarct), 내부 클래스
//주의 사항 : 생성자가 없다.
abstract class Car{//경찰차와 구급차의 상위 클래스, 추상화 과정 : 팀장
	
	//추상 메소드 : 몸통이 없고 형태만 정의된 메소드
	//					자식에게 강제 오버라이드 구현 강요
	
	int x=10;
	public void disp(){
		System.out.println(x);
	}
	
	public abstract void drive();
	public abstract void emergency();
}

class PoliceCar extends Car{//경찰차 : 대리
	public void drive(){
		x=20;
		disp();
		System.out.println("경찰차 순찰중!");
	}
	public void emergency(){
		System.out.println("도둑 잡아라~~~~!!!");
	}
}
class Ambulance extends Car{//구급차 : 신입사원
	public void drive(){
		System.out.println("구급차 순회중");
	}
	public void emergency(){
		System.out.println("환자 후송중!!~!~!~!~!");
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		System.out.print("1.경찰차 2.구급차 : ");
		int select1 = sc.nextInt();
		System.out.print("1.순찰 2.긴급상황 : ");
		int select2 = sc.nextInt();
		
//		다형성을 사용하고 풀이(상속 구조)
		Car car = null;
		if(select1==1) car = new PoliceCar();//업캐스팅(자동형변환)
		else if(select1==2) car = new Ambulance();
		if(select2==1) car.drive();
		else if(select2==2) car.emergency();
		
		
//		다형성을 사용하지 않고 풀이(비상속 구조)
//		if(select1==1){//경찰차?
//			PoliceCar car = new PoliceCar();
//			if(select2==1)	car.drive();
//			else if(select2==2) car.emergency();
//		}else if(select1==2){//구급차?
//			Ambulance car = new Ambulance();
//			if(select2==1)	car.drive();
//			else if(select2==2) car.emergency();
//		}
	}
}

















