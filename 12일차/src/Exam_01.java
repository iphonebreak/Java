import java.util.*;
//�߻� Ŭ���� : �߻� �޼ҵ带 1�� �̻� ������ �ִ� Ŭ����

//������ �ִ°͵� (�������)
//����ʵ�, ����޼ҵ� , �߻� �޼ҵ�(abstarct), ���� Ŭ����
//���� ���� : �����ڰ� ����.
abstract class Car{//�������� �������� ���� Ŭ����, �߻�ȭ ���� : ����
	
	//�߻� �޼ҵ� : ������ ���� ���¸� ���ǵ� �޼ҵ�
	//					�ڽĿ��� ���� �������̵� ���� ����
	
	int x=10;
	public void disp(){
		System.out.println(x);
	}
	
	public abstract void drive();
	public abstract void emergency();
}

class PoliceCar extends Car{//������ : �븮
	public void drive(){
		x=20;
		disp();
		System.out.println("������ ������!");
	}
	public void emergency(){
		System.out.println("���� ��ƶ�~~~~!!!");
	}
}
class Ambulance extends Car{//������ : ���Ի��
	public void drive(){
		System.out.println("������ ��ȸ��");
	}
	public void emergency(){
		System.out.println("ȯ�� �ļ���!!~!~!~!~!");
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		System.out.print("1.������ 2.������ : ");
		int select1 = sc.nextInt();
		System.out.print("1.���� 2.��޻�Ȳ : ");
		int select2 = sc.nextInt();
		
//		�������� ����ϰ� Ǯ��(��� ����)
		Car car = null;
		if(select1==1) car = new PoliceCar();//��ĳ����(�ڵ�����ȯ)
		else if(select1==2) car = new Ambulance();
		if(select2==1) car.drive();
		else if(select2==2) car.emergency();
		
		
//		�������� ������� �ʰ� Ǯ��(���� ����)
//		if(select1==1){//������?
//			PoliceCar car = new PoliceCar();
//			if(select2==1)	car.drive();
//			else if(select2==2) car.emergency();
//		}else if(select1==2){//������?
//			Ambulance car = new Ambulance();
//			if(select2==1)	car.drive();
//			else if(select2==2) car.emergency();
//		}
	}
}

















