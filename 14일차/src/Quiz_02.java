/*
<로그인 문제>
Hashtable을 이용하여 회원가입과 로그인을 구현하세요 key : id , value : pw
<메뉴의 구성>
1.회원가입 2.로그인 3.회원목록 4.종료

1. 회원가입 - id와 pw를 입력받아 id가 중복이 아닌 경우에만 가입 처리

2. 로그인 - id와 pw를 입력받아 로그인 처리
(예상 결과)
 - 로그인 성공 : id가 ht에 존재하고 pw가 일치하는 경우
 - 로그인 실패
	아이디 없음 : id가 ht에 없는 경우
	비밀번호 틀림 : pw가 저장된 값과 일치하지 않는 경우

3. 회원목록 : 전체 회원의 id와 pw를 1줄에 1명씩 출력
*/
import java.util.*;
public class Quiz_02{
	public static void main(String[] ar){
		Hashtable <String,String> ha = new Hashtable();
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("<메뉴>");
		System.out.println("1. 회원가입 2. 로그인 3. 회원목록 4. 종료");
		int a= sc.nextInt();
		
		switch (a){
		
		case 1:
		System.out.println("<회원가입>");
		System.out.print("id : ");
		 String id=sc.nextLine();
		  sc.nextLine();
		System.out.print("pw : ");
		 String pw=sc.nextLine();
						
		if(ha.containsKey(id)){
			System.out.println("아이디 중복");
		}
		else{
			ha.put(id,pw);
			System.out.println("회원가입 완료");
		}
		break;
		
		
		case 2:
		System.out.println("<로그인>");
		System.out.print("id : ");
		String id=sc.nextLine();
		sc.nextLine();
		System.out.print("pw : ");
		String pw=sc.nextLine();
		
		
		case 3: 
			
		case 4:
			System.exit(0);
		
		
		 }
		}
		
		
	}
}
	
/*
 * import java.util.*;
class Process{//처리 클래스
	private Hashtable<String, String> ht;
	private Scanner sc;
	public Process(){
		ht = new Hashtable<String, String>();
		sc = new Scanner(System.in);
	}
	
	public void accept(){
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		//중복검사 : containsKey()
		if(ht.containsKey(id))//아이디가 존재한다면
			System.out.println("이미 사용중인 아이디입니다.");
		else{
			ht.put(id, pw);//회원가입
			System.out.println("회원 가입이 완료되었습니다.\n로그인하세요");
		}
	}
	public void login(){
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(ht.containsKey(id)){//아이디가 있습니까
			String dbPw = ht.get(id);
			if(pw.equals(dbPw)){//비밀번호가 맞습니까
				System.out.println(id+"님 환영합니다~!");
			}else{
				System.out.println("비밀번호가 맞지 않습니다.");
			}
		}else{
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
	}
	public void list(){
		//전체 추출
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()){
			String id = enu.nextElement();
			String pw = ht.get(id);
			System.out.println(id+"\t\t"+pw);
		}
	}
}
public class Quiz_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		//처리 클래스 객체 생성
		Process pro = new Process();
		
		while(true){
			System.out.print("1.회원가입 2.로그인 3.회원목록 4.종료 : ");
			int select = sc.nextInt();
			switch(select){
			case 1://회원가입
				pro.accept();
				break;
			case 2://로그인
				pro.login();
				break;
			case 3://회원목록
				pro.list();
				break;
			case 4://종료
				System.exit(0);
			default://잘못입력
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}

 */
