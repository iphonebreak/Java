
class Terran{
	String name;
	int hp;
	
	public Terran(int x){
		System.out.println("Terran ������ ȣ��!");
		name="�׶�";
		hp = 1;
	}
	
	public void disp(){
		System.out.println("========�θ��� disp=========");
		System.out.println("�̸� : " + name);
		System.out.println("ü�� : " + hp);
	}
}

class Marine extends Terran{
	//������ �����ϴ� �͵� : name, hp, disp()
	int hp;
	int attack;
	
	public Marine(){
		super(); //���� ���� �ʾƵ� �ڵ����� ����
		System.out.println("Marine�� ������ ȣ��!");
		name = "����";
		hp = 40;
		attack = 6;
	}
	
	public void disp(){
		System.out.println("========�ڽ��� disp=========");
		super.disp();//�θ��� disp ȣ��
		
		System.out.println("�̸� : " + name);
		//�θ��� hp ȣ��
		System.out.println("�θ��� ü�� : "+super.hp);
		System.out.println("ü�� : " + hp);
		System.out.println("���ݷ� : " + attack);
	}
}

public class Exam_03 {
	public static void main(String[] ar){
		//������ ��ü ����
		Marine army = new Marine();
		army.disp();
	}
}










