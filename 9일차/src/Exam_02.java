import test.test3.*;
class test1{
	private int a;
	int b;
	protected int c;
	public int d;
}
public class Exam_02 {
	public static void main(String [] ar)
	Test3 t1=new test1();
	t1.a=10;
	t1.b=20;
	t1.c=30;
	t1.d=40;
	
//	test t2=new test2(); //package
	test t3=new test3();	//public
}
