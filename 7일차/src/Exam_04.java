//메소드의 또다른 기능
public class Exam_04 {
	public static void main(String []ar)
	{
		int a = random();
		System.out.println(a);
		int b = random(5);
		System.out.println(b);
	}
	//메소드 오버로딩 : 같은 이름으로 여러개의 메소드가 존재하는것
	//무조건 되는것은 아니고 , 컴퓨터가 구별할수 있도록 만들어 줘야 한다.
	
	
	//ramdom() 메소드 : 무작위 수를 돌려주는 메소드 
	public static int random() //random();
	{
		return (int)(Math.random()*101);
	}
	
	public static int random(int a) //random(5);
	{
		return(int)(Math.random()*(a+1));
	}
	
	public static int random(double a){return 0;}         //random(1.23);
	public static int random(String a){return 0;}			//random("문장");
	public static int random(float a){return 0;}				//random(1.23f);
	public static int random(int a,int b){return 0;}		//random(1,2);	
	public static int random(int a ,double b){return 0;}//random(1,1.1);
	public static int random(double a,int b){return 0;} //random(1.1,1);
	
	
	//반환형이 다른것은 인정되지 않는다.
	//public static int random(int b){}
	//public static double random(){} //random();
	
	
}
