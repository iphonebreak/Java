
public class Exam_03 {
	public static void main(String[] ar){
//�� ����������
		boolean a=false;
		System.out.println(a);
		System.out.println(!a);
		
	//��Ʈ ���� ������
		int c= 3;
		System.out.println(~c);
		System.out.println(~c);
		System.out.println(~c+1);
		
	//����������
		int d=10;
		System.out.println(d++);	//���߿� 1���� : ���->����: 10
		System.out.println(++d);	//���� 1 ���� : ����-> ��� : 12
		System.out.println(--d);		//���� 1���� -> ��� :11
		System.out.println(d--);		//���߿� 1���� : ��� -> ���� : 11
		
	//��� ������ : /�� %��  ���� �ϸ� �ȴ�.
		System.out.println(10/3);
		System.out.println(10/3.0);
		System.out.println(10.0/3);
		System.out.println(10.0/3.0);
		
		System.out.println(10%3);
		System.out.println(10%3.0);
		System.out.println(10.0%3);
		System.out.println(10.0%3.0);
		
		//%�������� Ȱ��
		System.out.println(100%2); //������ 0�̹Ƿ� 2�� ��� : ¦��
		System.out.println(101%2); //������ 1�̹Ƿ� 2�� ��� 
		
		//shift ������
		System.out.println(7<<2); //28
		System.out.println(7>>2); //1
		
		//��Ʈ ������ -����
		System.out.println (7&4);	//4
		System.out.println (7|4);	//7
		System.out.println (7^4);	//3
		
		//��Ʈ ������  - �� : �̶���ŭ�� 0�� ����, 1�� ���̶�� �����ص� ����.
		System.out.println(true&false); //& : �Ѵ� ���̸� ��
		System.out.println(true|false); //| : �Ѵ� �����̸� ����
		System.out.println(true^false); //^: ���� �ٸ��� ��
		
		//���� ������
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//���׿����� : (����)? ���ΰ�� : �����ΰ�� 
		int lotto = 1;
		String action =(lotto==1)?"�϶���ģ��.":"������ ���ϼ���";
		System.out.println("���� �ؾ����ൿ : "+action);
	
		//�������Կ�����
		byte a1=10;
		byte a2 = 5;
		//a1�� a2 ��ŭ ������Ű�ڴ�.
		//a1= (byte)(a1+a2);
		a1+=a2;
	
	
	
	}
}