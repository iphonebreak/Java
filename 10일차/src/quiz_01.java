/**
		<����>
		1. main()���� output1()�� output2()�� ȣ���غ�����
		2. output1()�� output2() ���� ���� a�� ����ϴ� �ڵ带 ��������ð�
			����� �Ǵ��� Ȯ���� ������
		3. ����� �ȵǴ� �޼ҵ尡 �ִٸ� ������ ������ ������
 */
class StaticMethod{
	int a = 10;
	public static void output1(){  //staticMethod.output1();
		//���� ��ϵǴ� ������ �˰� �ִ� ������ �̾�� �ϹǷ�
		//�ܺ� ������Ҵ� static ���� �� �Ҽ� �ִ�.
		System.out.println(a);
	}
	public void output2(){
		System.out.println(a);
	}
}

public class quiz_01 {
	public static void main(String[] ar)
	{
		//output1() �� ȣ���϶� : static 
		StaticMethod.output1();
				
		//output2() �� ȣ���϶� : static X
		StaticMethod sm = new StaticMethod();
		sm.output2();
		
	
				
		
	}
	
}
