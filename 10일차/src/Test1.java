//��ø Ŭ���� :  Ŭ���� �ȿ� �����ϴ� Ŭ����
//�Ϲ� ��ø Ŭ���� : �Ϲ� ������ ���Ͽ� ����
//static ��ø Ŭ���� : static ������ ���Ͽ� ����
//���� ��ø Ŭ���� : ���������� ���Ͽ� ����
class outer{	//�ܺ� Ŭ����
	//static ��ø Ŭ����
	static int y=20;
	static class static{//outer.Static
	//�ܺΰ��� ������ �ö� static �� �����ϴ�. (x�� ������ �ü� ����.)	
	
	}
	
	//�Ϲ� ��ø Ŭ����
	int x=10;
	class Normal{}
	
	//������øŬ����
	public void disp()
	{
		int a=10;
		System.out.println(a);
		
		class Imsi{}
		Imsi imsi=new Imsi();
		//imsi�� ������� ���� �ϰ� ������ ���ϸ� �ȴ�. (1ȸ�� Ŭ����)
	}
	
public void disp2(){
	int a=10;
	class imsi{}
}
}
public class Test1 {
	public static void main(String[] ar){
		//���� ���� : a�� ����϶�
		outer outer=new outer();
		outer.disp();
		
		//static���� : y�� ����϶�
		System.out.println(outer.y);
		
		//static ��øŬ���� : static�� ��ü ����
		outer.Normal normal=ot.new Normal();
		
		//�Ϲ� ���� : x�� ����϶�
		outer ot= new outer();
		System.out.println(ot.x);
		
		//�Ϲ���ø Ŭ���� : Normal�� ��ü ����
		outer.Normal normal=ot.new Normal();
	}
}
