//������
class Teacher{//���� Ŭ����
	String name;
	
	public void teach(){
		System.out.println("���� �Ѵ�: ");
	}
}

class Hwang extends Teacher{ //Ȳ�κ�
	int tall;
	public Hwang(){
		name="Ȳ�κ�";
		tall=180;
	}
	
	public void game(){
		System.out.println(name+"�� ������ �մϴ�.");
	}
	
	public void biliard(){
		System.out.println(name+"�� �籸�� Ĩ�ϴ�");
	}
	
	public void eat(){
		System.out.println(name+"�� ������ �մϴ�");
	}
	
	//���� �޼ҵ� �������̵�(������)
		public void teach(){
			System.out.println(name+"�� ���Ǹ� �մϴ�.");
		} 
}

class Yun extends Teacher{
	
}
public class Exam_05 {
	public static void main(String[] ar){
		//Hwang�� ��ü ����
		Hwang hwang= new Hwang();
		
		hwang.game();
		hwang.biliard();
		hwang.eat();
		hwang.teach();
		
		//��� : Ȳ�κ� -> ����
		//1. �����̶�� ������
		//2. ũ�Ⱑ Teacher�� �� ũ��.
		Teacher teacher =hwang; //�ڵ��� ��ȯ
		//Teacher teacher =new Hwang(); -> �̷��� ǥ���� ����
		
		hwang.game();
		hwang.biliard();
		hwang.eat();
		hwang.teach();
	
		//����ʵ�� ������ ������ �Ǵ°�?
		System.out.println(teacher.name);
//		System.out.println(teacher.tall);
		//��� : ������ ���� �ǵ�����.
		Hwang h=(Hwang)teacher; //������ ��ȯ , down-casting(�ٿ�ĳ����)
//		Yun y=(Yun)teacher; //�Ұ� : ���� Hwang�� ��ü�̹Ƿ�
		System.out.println(h.name);
		System.out.println(h.tall);
		
	
	
	}
	
}
