//익명 중첩 클래스 : 이름이 없는 중첩클래스
//사용하는 이유 : 메소드의 수정 (재정의) - method override
class outsourcing{	//외 주맡긴 클래스 파일, .class파일만 가져와서 내용확인
	public void aa(){
		System.out.println("aa 실행!");
	}
	
	public void bb(){
		System.out.println("bb실행!");
		
	}
	
	public void cc(){
		System.out.println("cc실행!");
	}
}
public class Test2 {
	public static void main(String[] ar){
		outsourcing os=new outsourcing(){
			//익명 중첩 클래스: 메소드 수정, 추가 (삭제는 불가)
			
			//메소드 수정 :bb 수정
			
			public void bb(){
				System.out.println("bb실행!");
				dd();
			}
			
			public void dd(){
				System.out.println("dd실행!");
				
			}
		};
		os.aa();
		os.bb();
		os.cc();
	}
}
