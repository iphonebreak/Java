
public class Exam_01 {

	public static void main(String[] args) {
		//������ �ڷ���
		byte a=10; //byte�� �����Ҽ� �ִ� a��� ������ ����� 10 ����!
		//a=128; ������ �ʰ��ؼ� �ȵ���.
		a=127;
		a++; //a�� ���� 1�������Ѷ� (128?)
		System.out.println(a); //a= -128
		
		//���ڸ� �����ϴ� �ڷ��� : char
		char b=65;
		char c='A';
		System.out.println(b);
		System.out.println(c);
		char d='��';
		System.out.println(d);
		
		//������ �ڷ����� �뻧 : int
		//��� ������ �ڷ����� ��� ����� int�� ���´�.
		//char e= b+c;
		int e=b+c;
		System.out.println(e);
		
		//�뻧�� �ƴ� ������ int���� ū ������ ǥ���ϴ� long
		long f=1000L; //�ݵ�� int�� ��������� �Ѵ�.
		System.out.println(f);
		
		//�Ǽ��� �ڷ���
		float g=3.141592f; //float���� �ݵ�� ǥ������� �Ѵ�.
		double h=3.141592;
		
		//���ڿ� �ڷ��� -string
		String name ="Ȳ�κ�";
		name = "java 7�� ����";
		System.out.println(name);		
		
		
	}

}
