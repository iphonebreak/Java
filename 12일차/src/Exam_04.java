//�⺻ �ڷ����� ��ü ���·� ����� ���� Ŭ���� : wrapper class
public class Exam_04 {
	public static void main(String[] ar){
		//Boolean Ŭ����
		//�⺻ �ڷ���
		boolean a = false;
		//����� ���� �ڷ���
		Boolean b = new Boolean(true);//1�� ������
		Boolean c = new Boolean("aosidjfoaisj");//2�� ������
		System.out.println(b);
		System.out.println(c);
		
		//�⺻�ڷ����� a�� �� �̿��� �ٸ� ����� ���� �� ����.(������ġ : ����)
		//Ŭ�������� b,c�� �� �̿��� ����� ���� �� �ִ�.(������ġ : ��)
		
		//��ȣ���� ��ȯ
		//�⺻ �ڷ��� -> ����� ���� �ڷ��� (auto-boxing) : 1.5����
		Boolean d= false;		
		
		//����� ���� �ڷ��� -> �⺻ �ڷ��� (auto - unboxing) : 1.6����
		boolean e= new Boolean("true");
		boolean f=Boolean.FALSE; //�̸� ������� ��ü
	}
}



