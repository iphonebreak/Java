//�迭
public class Exam_01 {
	public static void main(String[] ar)
	{
		//���� : �ϳ��� �̸��� �ϳ��� �����͸� ���� �ϴ� �����
		int x=10;
		int y=20;
		
		//������ �����ܰ� (2�ܰ�)
		// 1. ������ ����
		int a;
		char b;
		String c;
		Scanner sc;
		
		//2. ������ �ʱ�ȭ
		a=10;
		b='A'; //Ȥ�� 65
		c= "���ڿ�";
		sc= newScanner (System.in);	//new Scanner�� �ϳ��� ������
		
		//�迭 : �ϳ��� �̸��� �������� ������ �����͸� �����ϴ� �����
		//�迭�� ���� �ܰ� (�� 3�ܰ�)
		//1. �迭�� ����
		int arr[]; //���ڸ� ������ ����
		int [] arr1; //������ �߿����� �ʴ�.
		char ch[];
		
		//2. �迭�� �ʱ�ȭ ( �̸��� ������ �Ҵ����ش�.)
		arr=new int[3]; //arr �̶�� �̸��� int �����Ҽ� �ִ� 3ĭ�� ���� �Ҵ�
		ch= new char[3]; //ch��� �̸��� char�� ������ 3ĭ�� ���� �Ҵ�
		
		//3. �� ����
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		//������ ���
		for(int i=0; i<3; ++)
		{
			System.out.println(arr[i]);
		}
		
		
		int index=0;
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
		System.out.println(arr[index++]);
	    
	    
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		//String ������ �����͸� 3�� ������ �� �ִ� �迭 ������ �� ����
		String str[]= new String[3];
		str[0]="0����";
		str[1]="1����";
		str[2]="2����";
		for(int i=0; i<3; ++i) System.out.println(str[i]);
		
		//Scanner ������ �����͸� 3�� �����Ҽ� �ִ� �迭 ������ ������
		sc= new Scanner (System.in);
		
		Scanner[] srr= new Scanner [3];  //new �ڷ���[��������]
		srr[0] = sc;
		srr[1] = sc;
		srr[2] = new Scanner(System.in);
		
		//1+2+3 �ܰ� (�����Ͱ� ���� ���)
		byte by[] =new byte[]{1+2+3};
		
		//c����� ���(�� ��õ)
		int tmp[]={1,2,3};
		
		
		
		
		
		
		
		
		
	}
}
