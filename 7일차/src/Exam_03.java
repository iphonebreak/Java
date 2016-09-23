//main() 메소드 살펴보기
public class Exam_03 {
	public static void main(String [] ar){
		//main()이 요구하는 초기값(매개변수): String 배열 1개(ar)
		
		//ar이라는 배열에 데체 무엇이 들어가는가?
		//시작 : 0번방 부터 , 종료 : ar.length-1번방, 증가 : 1
		for(int i=0; i<ar.length; ++i)
		{
			System.out.printf("ar[%d]= %s\n",i,ar[i]);
		}
		
	}
}

