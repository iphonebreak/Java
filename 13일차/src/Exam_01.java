//java.util.Random
import java.util.*;
public class Exam_01 {
	public static void main(String[] ar)
	{
		//Random ��ü ����
		Random rand = new Random();
		
		System.out.println(rand.nextInt());	   //int ���� �ȿ���
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextFloat());
		System.out.println(rand.nextDouble()); //Math.random();
		System.out.println(rand.nextGaussian());
	
		//1~5 ������ ������ �̰� �ʹٸ�
		int a= (int)(Math.random()*5)+1;
		int b= rand.nextInt(5)+1;
	
	
	
	
	
	
	
	
	
	
	
	}
}
