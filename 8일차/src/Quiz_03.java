/**
 * 		문제 : 다음의 결과가 나올 수 있도록 구성하시기 바랍니다.
 * 		단, 데이터의 설정은 반드시 매개변수 있는 생성자만 이용하시기 바랍니다.
 * 												(기본생성자를 이용하지 마십시오)
 * 		<출력 결과>
 * 		JAVA 게임에 오신 걸 환영합니다~!
 * 		캐릭터를 생성하셔야 게임을 진행할 수 있습니다.
 * 		아이디를 입력하세요 : 이웃집또털어
 * 		직업군을 입력하세요 : 도둑
 * 		
 * 		========캐릭터가 생성되었습니다========
 * 		아이디 : 이웃집또털어
 * 		직   업 : 도둑
 * 		레   벨 : 1
 * 		계	  급 : 새내기
 * 		==============================
 */
import java.util.*;
class game
{
	String ID;
	String job;
	int level;
	String rank;
	
	//this: 나의 것 , 나의 객체의 것
	game (String ID, String job)
	{
	this.ID=ID;
	this.job=j;
	level =1;
	rank="새내기";
	}
	
	void info(){
		System.out.println("아이디 : " + ID);
		System.out.println("직   업 : " + job);
		System.out.println("레   벨 : " + level);
		System.out.println("계   급 : " + rank);
	
}

public class Quiz_03 {
	public static void main(String [] ar)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("JAVA 게임에 오신걸 환영합니다.");
		System.out.println("캐릭터를 생성하셔야 게임을 진행할수 있습니다.");
		
		System.out.print("아이디를 입력하세요 : ");
		String ID=sc.nextLine();
		
		System.out.println("직업군을 입력하세요 : ");
		String job=sc.nextLine();
		
		game cha =new game(ID,job);
		
		cha.info();
	}
}
