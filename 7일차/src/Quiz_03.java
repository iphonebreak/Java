/**	<���� ������ ��� ���(�����ε� ���)>
 		
	System.out.println()�� ��� 
	����, ���ڿ�, �迭, ��ü ��� ��� �͵��� ��� �����մϴ�.
	output() �̶�� �޼ҵ带 ���� System.out.println()�� �䳻�� ���ô�.
 	output()�� ���ؼ� char, int, double, String������ �����͸� ���
 	(����) �⺻�ڷ����� String���� ��ȯ�ϴ� ��ɾ� : String.valueOf(��)
 	String str = String.valueOf(12345); */
public class Quiz_04 {
	public static void main(String[] ar){
		output('A');
		output(30);
		output(3.141592);
		output("�ȳ��ϼ���");
	}
	public static void output(char a){
		String str = String.valueOf(a);
		output(str);
	}
	public static void output(int a){
		String str = String.valueOf(a);
		output(str);
	}
	public static void output(double a){
		String str = String.valueOf(a);
		output(str);
	}
	public static void output(String a){
		System.out.println(a);
	}
}


