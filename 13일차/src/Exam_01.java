//java.util.Random
import java.util.*;
public class Exam_01 {
	public static void main(String[] ar)
	{
		//Random 객체 생성
		Random rand = new Random();
		
		System.out.println(rand.nextInt());	   //int 범위 안에서
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextFloat());
		System.out.println(rand.nextDouble()); //Math.random();
		System.out.println(rand.nextGaussian());
	
		//1~5 사이의 정수를 뽑고 싶다면
		int a= (int)(Math.random()*5)+1;
		int b= rand.nextInt(5)+1;
	
	
	
	
	
	
	
	
	
	
	
	}
}
