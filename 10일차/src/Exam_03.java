//static �� ��� �ʵ� 
class StaticMember{
	//���α׷� ���� ��ư�� ������ ���ÿ� ��ϵȴ�.(StaticMember.a)
	static int a=10;
		
	//staticMember Ŭ������ ��ü�� �����Ǹ� �޸𸮿� ��ϵȴ�.(��ü��.a)
	int b=20;
}
public class Exam_03 {
	public static void main(String [] ar){
		//a��� �϶�: �ܺ� ��ü ���ʿ�
		System.out.println(StaticMember.a);
		
		//b�� ����϶�: �ܺ�Ŭ���� ��ü�� �ʿ�
		StaticMember sm=new StaticMember();
		//System.out.println(sm.a);
		System.out.println(sm.b);
	}
}
