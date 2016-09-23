//다형성을 이용하지 않고 만든 RPG 게임
/**
		캐릭터 클래스 1개
		몬스터 클래스 3개 - 오크, 슬라임, 드래곤
 */
import java.util.*;
class Character{
	private String id;//아이디 - 최초1회 설정, 확인 가능
	private int exp;//경험치 - 설정 불가, 확인 가능, 1000이 되면 1레벨 업
	private int level;//레벨 - 설정 불가, 확인 가능
	
	public Character(String id){
		this.id = id;
		this.exp = 0;
		this.level = 1;
	}
	
	//사냥 메소드 : 3종류(오크, 슬라임, 드래곤)
	public void hunt(Slime monster){
		System.out.println(monster.name+"을 사냥합니다.");
		this.exp += monster.exp;//경험치 추가
		System.out.println(monster.exp+"의 경험치 획득!");
		if(exp>=1000){
			this.level++;//레벨업
			System.out.println("레벨이 " + level+"로 상승!");
			//경험치 감소
			this.exp -= 1000;//1000감소
		}
	}
	public void hunt(Orc monster){
		System.out.println(monster.name+"을 사냥합니다.");
		this.exp += monster.exp;//경험치 추가
		System.out.println(monster.exp+"의 경험치 획득!");
		if(exp>=1000){
			this.level++;//레벨업
			System.out.println("레벨이 " + level+"로 상승!");
			//경험치 감소
			this.exp -= 1000;//1000감소
		}
	}
	public void hunt(Dragon monster){
		System.out.println(monster.name+"을 사냥합니다.");
		this.exp += monster.exp;//경험치 추가
		System.out.println(monster.exp+"의 경험치 획득!");
		if(exp>=1000){
			this.level++;//레벨업
			System.out.println("레벨이 " + level+"로 상승!");
			//경험치 감소
			this.exp -= 1000;//1000감소
		}
	}
	
	
	public void info(){
		System.out.println("======================");
		System.out.println("아 이 디 : " + id);
		System.out.println("경 험 치 : " + exp/10+" %");
		System.out.println("레     벨 : " + level);
		System.out.println("======================");
	}
}
//몬스터 : 슬라임, 오크, 드래곤 3종류(이름, 경험치)
class Monster{
	String name;
	int exp;
}

class Slime extends Monster{
	public Slime(){
		name="슬라임";
		exp = 125;
	}
}
class Orc extends Monster{
	String name;
	int exp;
	public Orc(){
		name = "오크";
		exp = 275;
	}
}
class Dragon{
	String name;
	int exp;
	public Dragon(){
		name="드래곤";
		exp = 830;
	}
}

public class RPG {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("게임이 시작되었습니다.");
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		//아이디를 가지고 캐릭터 생성
		Character my = new Character(id);
		//my.info();
		while(true){
			System.out.print("1.사냥 2.정보 3.종료 : ");
			int select = sc.nextInt();
			switch(select){
			case 1://사냥
				System.out.print("1.슬라임 2.오크 3.드래곤 : ");
				int select2 = sc.nextInt();
				Monster mon =null;
				if(select2==1){//슬라임의 객체를 만들어 캐릭터에게 전달
					mon = new Slime();
					
				}else if(select2==2){//오크의 객체를 만들어 캐릭터에게 전달
					mon = new Orc();
				
				}else if(select2==3){//드래곤의 객체를 만들어 캐릭터에게 전달
					mon = new Dragon();
					
				}
				break;
			case 2://정보
				my.info();
				break;
			case 3:System.exit(0);
			}
		}
	}
}














