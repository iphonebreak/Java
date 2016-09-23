/**
		기존에 내가 만든 게임에서는 배열을 이용해서 몬스터를 보관했습니다.
		
		그런데 새로운 좋은 저장소 HashSet이 나왔다는 소식을 듣고
		
		기존에 배열을 버리고 HashSet으로 갈아타려 합니다.
		
		배열 대신 HashSet을 이용해서 동일한 결과가 나올 수 있도록
		
		"저장소" 만 바꾸세요...Generic 사용하시고...

 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
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

//equals 오버라이드
public boolean equals(Object obj){
	Monster mon = (monster)obj;
	boolean result = (mon.x==this.x)&&(mon.y==this.y);
	return result;
}

//hashCode 오버라이드
public int hashCode() {
	//x좌표 + y좌표 -> (50, 60) 50060
	return x*100+y;
}

public class Quiz_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		HashSet<Monster> hs= new HashSet<Monster>();
		
		for(int i=0; i<mon.length; ++i){
			int x = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
			int y = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
			mon[i] = new Monster(x, y);
			hs.add(new Monster(x,y));
			
			//비교(중복제거)
			if(!result) i--;
		}
		
		//출력 : Iterator 사용
		Iterator<Monster> it= hs.iterator();
		while(it.hasNext()){
			Monster mon= it.next();
			mon.info();
		}
		//기본 생성자 : 객체 생성 후 데이터 설정
//		Monster m1 = new Monster();
//		m1.x = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
//		m1.y = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
//		
//		//매개변수가 있는 생성자 : 데이터를 집어넣어서 객체 생성
//		int x = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
//		int y = (int)(Math.random()*100)+1;//1~100사이의 무작위값;
//		Monster m2 = new Monster(x, y);
//		
//		m1.info();
//		m2.info();
		
		
	}
}