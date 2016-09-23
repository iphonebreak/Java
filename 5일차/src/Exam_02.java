//다중 for문
public class Exam_02 {
	public static void main(String [] ar){
		//123456789출력
		System.out.println(123456789);
		
		for(int j=1; j<=9; ++j){
			System.out.print(j);
			System.out.println();
			
		}
		
		System.out.println("==================================");
		//123456789를 9줄 출력	
		for(int i=1; i<=9; ++i) //바깥쪽for문 : 줄 
		{
			for(int i=1; i<=9; ++i)	//안쪽 for문 :칸
			{
				System.out.println(j);
			}
			System.out.println(123456789);
		}
}
}