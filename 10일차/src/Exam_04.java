//final : ������
//������ ������ : �������� ������ (���� 1ȸ ���������� ������ �Ұ�
//�޼ҵ� : �޼ҵ� ������ ������
//Ŭ���� : ����� ������
class A04{
	//��� : public static final -���� �̸� ���̴¼� ������ ���� ��
	public static final double PI=3.141592;
	
	public static double random(){
		return  Math.random();
	}
}

public class Exam_04 {
	public static void main(String[] ar)
	{
		//�������� 5�� ���� ���̸� ���ϰ� �ʹٸ�?
		A04.PI=3.0;
		System.out.println(5*5*A04.PI);
		System.out.println(5*5*Math.PI);
		
		System.out.println(A04.random());
		System.out.println(Math.random());
	}
}
