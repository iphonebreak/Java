
class A02 extends Object {//�ƹ��͵� ���� ������ jvm�� �ڵ� ����
	public String toString(){
		return "������� ���ĺ��ô�.~!";
	}
}


public class Exam_02 {
	public static void main(String[] ar){
		//���� A02�� ��ü�� ����ٸ� ������ �Ҽ� �ִ°�?
		A02 ap=new A02();
		
		System.out.println(ap.getClass());
		System.out.println(ap.toString());
		System.out.println(ap);
		
	}
}
