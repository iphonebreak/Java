//����� ����
class A01{
	int x=10;
	int y=20;
}

class B01 extends A01{ //B01 Ŭ������ �θ��  
	public void disp()
	{
		//�θ��ڽ� ���Ը� �϶��� x,y�� ���
		System.out.println();
		
		
		//x,y�� ����ϰ� �ʹٸ�?
//		A01 ap=new A01();
//		System.out.println("x="+ap.x);
//		System.out.println("y="+ap.y);
	}
}
public class Exam_01 {
	public static void main(String [] ar){
		B01 bp=new B01();
		bp.disp();
	}
}
