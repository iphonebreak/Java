/**
		<������ Ŭ������ �̿��� ����� main�� ����� ������>
		Math Ŭ�������� ������ �̿�
		1. PI
		2. ceil()
		3. abs()
		
		Integer Ŭ�������� ������ �̿�
		4. parseInt() - �Ű����� 1��¥��
		5. MAX_VALUE
		6. MIN_VALUE
		
		String Ŭ�������� ������ �̿�
		7. equals()
 */

public class Quiz_02 {
	public static void main(String[] ar){
		System.out.println(Math.PI);
		
		double a = Math.ceil(5.1);//�ø�
		System.out.println(a);
		
		int b = Math.abs(5);
		int c = Math.abs(-5);
		System.out.println(b);
		System.out.println(c);
		
		int d=Integer.parseInt("10"); //String->int
		System.out.println(d);
		
		System.out.println("int�� �ִ밪: "+Integer.MAX_VALUE);
		System.out.println("int�� �ּҰ� : "+Integer.MIN_VALUE);
		

		String str = "�ȳ��ϼ���";
		String str1 = new String("�ȳ��ϼ���");
		boolean bool = str.equals(str1);
		System.out.println(bool);
		System.out.println(str==str1);
	
	}
}





