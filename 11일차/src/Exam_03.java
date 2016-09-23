
class Terran{
	String name;
	int hp;
	
	public Terran(int x){
		System.out.println("Terran 생성자 호출!");
		name="테란";
		hp = 1;
	}
	
	public void disp(){
		System.out.println("========부모의 disp=========");
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + hp);
	}
}

class Marine extends Terran{
	//가지고 시작하는 것들 : name, hp, disp()
	int hp;
	int attack;
	
	public Marine(){
		super(); //내가 적지 않아도 자동으로 빌드
		System.out.println("Marine의 생성자 호출!");
		name = "마린";
		hp = 40;
		attack = 6;
	}
	
	public void disp(){
		System.out.println("========자식의 disp=========");
		super.disp();//부모의 disp 호출
		
		System.out.println("이름 : " + name);
		//부모의 hp 호출
		System.out.println("부모의 체력 : "+super.hp);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + attack);
	}
}

public class Exam_03 {
	public static void main(String[] ar){
		//마린의 객체 생성
		Marine army = new Marine();
		army.disp();
	}
}










