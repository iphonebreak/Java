//int�� Integer Ŭ����

public class Exam_5 {
	public static void main(String [] ar){
		//�⺻�ڷ���
		int a=10;
		//����� ���� �ڷ��� (Integer)�� ��ü ����
		Integer b = new Integer(12345);
		Integer c = new Integer(Messages.getString("Exam_5.0"));	//��ȯ ������ ���ڸ� ���� //$NON-NLS-1$
		Integer d=12345;	//���� �ڽ�
		
		//�⺻�ڷ����� ������ �ڷ����� �񱳴� equals�� �Ѵ�.
		System.out.println(b==d);
		System.out.println(b.equals(b));
	
		int e=b; 
		
		//String->int�� ��ȯ �ϴ� ��ɾ� : parseInt()
		int g =Integer.parseInt(Messaf
				as
				f
				es.getString("Exam_5.1")); //$NON-NLS-1$
		System.out.println(g);
		System.out.println(g+1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
				
		
	
	}
}
