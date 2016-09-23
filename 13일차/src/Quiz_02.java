/**
		������ ���� ���� ���ӿ����� �迭�� �̿��ؼ� ���͸� �����߽��ϴ�.
		
		�׷��� ���ο� ���� ����� HashSet�� ���Դٴ� �ҽ��� ���
		
		������ �迭�� ������ HashSet���� ����Ÿ�� �մϴ�.
		
		�迭 ��� HashSet�� �̿��ؼ� ������ ����� ���� �� �ֵ���
		
		"�����" �� �ٲټ���...Generic ����Ͻð�...

 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
class Monster{
	int x,y;
	Monster(){
		
	}
	Monster(int x, int y){
		this.x = x;
		this.y = y;
	}
	void info(){
		System.out.printf("��ǥ : %d, %d\n", x, y);
	}
}

//equals �������̵�
public boolean equals(Object obj){
	Monster mon = (monster)obj;
	boolean result = (mon.x==this.x)&&(mon.y==this.y);
	return result;
}

//hashCode �������̵�
public int hashCode() {
	//x��ǥ + y��ǥ -> (50, 60) 50060
	return x*100+y;
}

public class Quiz_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		HashSet<Monster> hs= new HashSet<Monster>();
		
		for(int i=0; i<mon.length; ++i){
			int x = (int)(Math.random()*100)+1;//1~100������ ��������;
			int y = (int)(Math.random()*100)+1;//1~100������ ��������;
			mon[i] = new Monster(x, y);
			hs.add(new Monster(x,y));
			
			//��(�ߺ�����)
			if(!result) i--;
		}
		
		//��� : Iterator ���
		Iterator<Monster> it= hs.iterator();
		while(it.hasNext()){
			Monster mon= it.next();
			mon.info();
		}
		//�⺻ ������ : ��ü ���� �� ������ ����
//		Monster m1 = new Monster();
//		m1.x = (int)(Math.random()*100)+1;//1~100������ ��������;
//		m1.y = (int)(Math.random()*100)+1;//1~100������ ��������;
//		
//		//�Ű������� �ִ� ������ : �����͸� ����־ ��ü ����
//		int x = (int)(Math.random()*100)+1;//1~100������ ��������;
//		int y = (int)(Math.random()*100)+1;//1~100������ ��������;
//		Monster m2 = new Monster(x, y);
//		
//		m1.info();
//		m2.info();
		
		
	}
}