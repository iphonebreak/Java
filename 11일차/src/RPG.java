//�������� �̿����� �ʰ� ���� RPG ����
/**
		ĳ���� Ŭ���� 1��
		���� Ŭ���� 3�� - ��ũ, ������, �巡��
 */
import java.util.*;
class Character{
	private String id;//���̵� - ����1ȸ ����, Ȯ�� ����
	private int exp;//����ġ - ���� �Ұ�, Ȯ�� ����, 1000�� �Ǹ� 1���� ��
	private int level;//���� - ���� �Ұ�, Ȯ�� ����
	
	public Character(String id){
		this.id = id;
		this.exp = 0;
		this.level = 1;
	}
	
	//��� �޼ҵ� : 3����(��ũ, ������, �巡��)
	public void hunt(Slime monster){
		System.out.println(monster.name+"�� ����մϴ�.");
		this.exp += monster.exp;//����ġ �߰�
		System.out.println(monster.exp+"�� ����ġ ȹ��!");
		if(exp>=1000){
			this.level++;//������
			System.out.println("������ " + level+"�� ���!");
			//����ġ ����
			this.exp -= 1000;//1000����
		}
	}
	public void hunt(Orc monster){
		System.out.println(monster.name+"�� ����մϴ�.");
		this.exp += monster.exp;//����ġ �߰�
		System.out.println(monster.exp+"�� ����ġ ȹ��!");
		if(exp>=1000){
			this.level++;//������
			System.out.println("������ " + level+"�� ���!");
			//����ġ ����
			this.exp -= 1000;//1000����
		}
	}
	public void hunt(Dragon monster){
		System.out.println(monster.name+"�� ����մϴ�.");
		this.exp += monster.exp;//����ġ �߰�
		System.out.println(monster.exp+"�� ����ġ ȹ��!");
		if(exp>=1000){
			this.level++;//������
			System.out.println("������ " + level+"�� ���!");
			//����ġ ����
			this.exp -= 1000;//1000����
		}
	}
	
	
	public void info(){
		System.out.println("======================");
		System.out.println("�� �� �� : " + id);
		System.out.println("�� �� ġ : " + exp/10+" %");
		System.out.println("��     �� : " + level);
		System.out.println("======================");
	}
}
//���� : ������, ��ũ, �巡�� 3����(�̸�, ����ġ)
class Monster{
	String name;
	int exp;
}

class Slime extends Monster{
	public Slime(){
		name="������";
		exp = 125;
	}
}
class Orc extends Monster{
	String name;
	int exp;
	public Orc(){
		name = "��ũ";
		exp = 275;
	}
}
class Dragon{
	String name;
	int exp;
	public Dragon(){
		name="�巡��";
		exp = 830;
	}
}

public class RPG {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���۵Ǿ����ϴ�.");
		System.out.print("���̵� �Է��ϼ��� : ");
		String id = sc.nextLine();
		//���̵� ������ ĳ���� ����
		Character my = new Character(id);
		//my.info();
		while(true){
			System.out.print("1.��� 2.���� 3.���� : ");
			int select = sc.nextInt();
			switch(select){
			case 1://���
				System.out.print("1.������ 2.��ũ 3.�巡�� : ");
				int select2 = sc.nextInt();
				Monster mon =null;
				if(select2==1){//�������� ��ü�� ����� ĳ���Ϳ��� ����
					mon = new Slime();
					
				}else if(select2==2){//��ũ�� ��ü�� ����� ĳ���Ϳ��� ����
					mon = new Orc();
				
				}else if(select2==3){//�巡���� ��ü�� ����� ĳ���Ϳ��� ����
					mon = new Dragon();
					
				}
				break;
			case 2://����
				my.info();
				break;
			case 3:System.exit(0);
			}
		}
	}
}














