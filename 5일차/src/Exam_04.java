//������ - Math.random();
public class Exam_04 {
	public static void main(String[] ar)
	{
		//Math.random(); -> 0�̻� 1�̸� ������ double ���� ��ȯ
		/*for(int i=1; i<=10; ++i)
		{
		System.out.println(Math.random());
		}*/
		
		double a=Math.random();
		double b=a*45;
		int c=(int)b;
		int d=c+1;
		
		//int d=(int)(Math.random()*45)+1;   //1~45����, 45������ �ʿ� 1���ͽ���
		int e=(int)(Math.random()*100)+0;
		int f=(int)(Math.random()*21)+30;
		int g=(int)(Math.random()*100)+1;
		
		
		System.out.println("a="+a); //0<=a<1, double
		System.out.println("b="+b); //0<=b,45, double
		System.out.println("c="+c); //0<=c<45, int
		System.out.println("d="+d); //1<=d<46, int
		System.out.println("f="+f);
		System.out.println("g="+g);
		
	}
}
