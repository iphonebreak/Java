//�͸� ��ø Ŭ���� : �̸��� ���� ��øŬ����
//����ϴ� ���� : �޼ҵ��� ���� (������) - method override
class outsourcing{	//�� �ָñ� Ŭ���� ����, .class���ϸ� �����ͼ� ����Ȯ��
	public void aa(){
		System.out.println("aa ����!");
	}
	
	public void bb(){
		System.out.println("bb����!");
		
	}
	
	public void cc(){
		System.out.println("cc����!");
	}
}
public class Test2 {
	public static void main(String[] ar){
		outsourcing os=new outsourcing(){
			//�͸� ��ø Ŭ����: �޼ҵ� ����, �߰� (������ �Ұ�)
			
			//�޼ҵ� ���� :bb ����
			
			public void bb(){
				System.out.println("bb����!");
				dd();
			}
			
			public void dd(){
				System.out.println("dd����!");
				
			}
		};
		os.aa();
		os.bb();
		os.cc();
	}
}
