//�޼ҵ��� �Ǵٸ� ���
public class Exam_04 {
	public static void main(String []ar)
	{
		int a = random();
		System.out.println(a);
		int b = random(5);
		System.out.println(b);
	}
	//�޼ҵ� �����ε� : ���� �̸����� �������� �޼ҵ尡 �����ϴ°�
	//������ �Ǵ°��� �ƴϰ� , ��ǻ�Ͱ� �����Ҽ� �ֵ��� ����� ��� �Ѵ�.
	
	
	//ramdom() �޼ҵ� : ������ ���� �����ִ� �޼ҵ� 
	public static int random() //random();
	{
		return (int)(Math.random()*101);
	}
	
	public static int random(int a) //random(5);
	{
		return(int)(Math.random()*(a+1));
	}
	
	public static int random(double a){return 0;}         //random(1.23);
	public static int random(String a){return 0;}			//random("����");
	public static int random(float a){return 0;}				//random(1.23f);
	public static int random(int a,int b){return 0;}		//random(1,2);	
	public static int random(int a ,double b){return 0;}//random(1,1.1);
	public static int random(double a,int b){return 0;} //random(1.1,1);
	
	
	//��ȯ���� �ٸ����� �������� �ʴ´�.
	//public static int random(int b){}
	//public static double random(){} //random();
	
	
}
