//배열
public class Exam_01 {
	public static void main(String[] ar)
	{
		//변수 : 하나의 이름에 하나의 데이터를 보관 하는 저장소
		int x=10;
		int y=20;
		
		//변수의 생성단계 (2단계)
		// 1. 변수의 선언
		int a;
		char b;
		String c;
		Scanner sc;
		
		//2. 변수의 초기화
		a=10;
		b='A'; //혹은 65
		c= "문자열";
		sc= newScanner (System.in);	//new Scanner도 하나의 데이터
		
		//배열 : 하나의 이름에 여러개의 동일한 데이터를 보관하는 저장소
		//배열의 생성 단계 (총 3단계)
		//1. 배열의 선언
		int arr[]; //숫자를 적으면 에러
		int [] arr1; //순서는 중요하지 않다.
		char ch[];
		
		//2. 배열의 초기화 ( 이름에 공간을 할당해준다.)
		arr=new int[3]; //arr 이라는 이름에 int 보관할수 있는 3칸의 공간 할당
		ch= new char[3]; //ch라는 이름에 char를 보관할 3칸의 공간 할당
		
		//3. 값 대입
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		//데이터 출력
		for(int i=0; i<3; ++)
		{
			System.out.println(arr[i]);
		}
		
		
		int index=0;
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
	    
	    
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		//String 형태의 데이터를 3개 보관할 수 있는 배열 생성후 값 대입
		String str[]= new String[3];
		str[0]="0번방";
		str[1]="1번방";
		str[2]="2번방";
		for(int i=0; i<3; ++i) System.out.println(str[i]);
		
		//Scanner 형태의 데이터를 3개 보관할수 있는 배열 생성후 값대입
		sc= new Scanner (System.in);
		
		Scanner[] srr= new Scanner [3];  //new 자료형[공간개수]
		srr[0] = sc;
		srr[1] = sc;
		srr[2] = new Scanner(System.in);
		
		//1+2+3 단계 (데이터가 적은 경우)
		byte by[] =new byte[]{1+2+3};
		
		//c언어의 방식(비 추천)
		int tmp[]={1,2,3};
		
		
		
		
		
		
		
		
		
	}
}
