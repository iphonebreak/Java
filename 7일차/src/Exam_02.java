//method(�޼ҵ�)
//-�޼ҵ�� class ���ο� ���������.
//-�޼ҵ�� �ٸ� �޼ҵ�� �и��� ������ ������ �Ѵ�.
//-main()�� �ϳ��� �޼ҵ� �̴�.

public class Exam_02 {
	public static void main(String [] ar){
		System.out.println("���� ����");
		//�޼ҵ带 ����ϱ� ���� ȣ��(�޼ҵ� ȣ��)
		//�̸�(�䱸�ϴ� ������)
		func1(); 
		func2(10);
		func3("����",3.14);
		int a=func4();   //func4()�� ������ ����� int�̹Ƿ� int�� ������ ����
		
		double b = func5(3.141592);
		System.out.println(b);
		
		System.out.println("���� ����");
		
	}
	//�޼ҵ� �����
	//public static ��ȯ�� �޼ҵ��(�Ű�����) {}
	
	//1. �Ű����� : x, ��ȯ�� : x
	public static void func1(){
		System.out.println("func1 ����");
	}
	
	//2. �Ű����� : O, ��ȯ�� : X (void)
	public static void func2(int a){
		System.out.println("func2 ���� :"+a);
	}
	
	//3. �Ű����� : ������ (String 1�� , double 1��), ��ȯ�� : X(void)
	public static void func3(String str, double b){
		System.out.println("func3 ����"+str+","+b);
	}
	
	//4. �Ű����� : X, ��ȯ�� : int(������ 1��)
	public static int func4(){
		return 30;  //func4()�� �����Ű�鼭 30�� ��ȯ�ϰڴ�.
		
		//return�� �ǹ�
		//1. �޼ҵ带 �����Ų��. return ���Ŀ� �ڵ带 ������ ����
		//2. ���� ȣ���� ���� ������� �����ְڴ�.  return ��;
	}
	
	//5. �Ű����� : double 1��,  ��ȯ��: double
	public static double func5(double a){
		return a*a; //a�� ������ �����ش�.
	}
	
}
