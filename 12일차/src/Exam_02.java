
interface A02{
	//��� �ʵ� : public static final(���)�� ����, �������� JVM �ڵ�����
	public static final int A = 10;
	public static int B = 20;
	public final int C = 30;
	public int D = 40;
	int E = 50;
	//private int F = 60;
	//protected int G = 100;
	
	//��� �޼ҵ� : public abstract �޼ҵ常 ����, �������� JVM �ڵ�����
	public abstract void info1();
	public void info2();
	void info3();
	//public static abstract void info4();
	//public final abstract void info5();
	
	//Ŭ����
	class Inner{}
}

class B02 implements A02{

	@Override
	public void info1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info3() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Exam_02 {
	public static void main(String[] ar){
		//A02Ŭ������ E�� static���� Ȯ��
		System.out.println(A02.E);
		//A02Ŭ������ E�� final���� Ȯ��
		//A02.E = 100;
		
		//A02.Inner Ŭ������ static���� Ȯ�� : ��ü ����
		A02.Inner inner = new A02.Inner();
	}
}


















