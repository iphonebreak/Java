/**
		<문제>
		Monster라는 클래스를 만들어 다음과 같이 설정하세요
		1. Monster에는 x좌표와 y좌표를 설정할 수 있는 공간이 있습니다.
		2. 생성자는 2종류가 있습니다.(매개변수 0개, 2개)
		3. info()라는 좌표 확인용 메소드가 있습니다.
		
		이 Monster 클래스를 이용하여 2마리의 몬스터를 소환해보세요..
		(범위는 1~100, 서로 다른 생성자 이용!)
		
		<추가내용1>
		Monster 형태의 데이터를 보관할 수 있는 배열을 5칸 만드시고
		해당 공간에 Monster의 객체를 집어넣고 출력해보세요
		(생성자는 아무것이나 이용하셔도 상관없습니다)
		
*/
class Monster{
	int x,y;
	Monster(){
		
	}
	Monster(int x, int y){
		this.x = x;
		this.y = y;
	}
	void info(){
		System.out.printf("좌표 : %d, %d\n", x, y);
	}
}

public class Quiz_01 {
	public static void main(String[] ar){
		//Monster를 5마리 보관할 수 있는 배열생성
				Monster mon[] = new Monster[5];
				for(int i=0; i<mon.length; ++i)
				{
					mon[0]=new monster(x,y);
					int x = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
					int y = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
					mon[i]=new Monster(x,y);
					
					//비교(중복제거)
					for(int j=0; j<i; ++j)
					{
						if(mon[i].x==mon[j].x&&mon[i].y==mon[j].y)
						{
							i--; break;
						}
					
		/*
		//기본 생성자 : 객체 생성 후 데이터 설정
		Monster m1 = new Monster();
		m1.x = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
		m1.y = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
		
		//매개변수가 있는 생성자 : 데이터를 집어넣어서 객체 생성
		int x = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
		int y = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
		Monster m2 = new Monster(x, y);
		
		m1.info();
		m2.info();
		
		Monster m3[]=new Monster[5];
		 m3.Monster[0] x=(int)(Math.random()*100)+1;
		 m3.Monster[1] y=(int)(Math.random()*100)+1;
		 */
		
	}
}














	
	
	
	}
}
