/**
		<����>
		Monster��� Ŭ������ ����� ������ ���� �����ϼ���
		1. Monster���� x��ǥ�� y��ǥ�� ������ �� �ִ� ������ �ֽ��ϴ�.
		2. �����ڴ� 2������ �ֽ��ϴ�.(�Ű����� 0��, 2��)
		3. info()��� ��ǥ Ȯ�ο� �޼ҵ尡 �ֽ��ϴ�.
		
		�� Monster Ŭ������ �̿��Ͽ� 2������ ���͸� ��ȯ�غ�����..
		(������ 1~100, ���� �ٸ� ������ �̿�!)
		
		<�߰�����1>
		Monster ������ �����͸� ������ �� �ִ� �迭�� 5ĭ ����ð�
		�ش� ������ Monster�� ��ü�� ����ְ� ����غ�����
		(�����ڴ� �ƹ����̳� �̿��ϼŵ� ��������ϴ�)
		
*/
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

public class Quiz_01 {
	public static void main(String[] ar){
		//Monster�� 5���� ������ �� �ִ� �迭����
				Monster mon[] = new Monster[5];
				for(int i=0; i<mon.length; ++i)
				{
					mon[0]=new monster(x,y);
					int x = (int)(Math.random()*100)+1;//1~100������ ��������;
					int y = (int)(Math.random()*100)+1;//1~100������ ��������;
					mon[i]=new Monster(x,y);
					
					//��(�ߺ�����)
					for(int j=0; j<i; ++j)
					{
						if(mon[i].x==mon[j].x&&mon[i].y==mon[j].y)
						{
							i--; break;
						}
					
		/*
		//�⺻ ������ : ��ü ���� �� ������ ����
		Monster m1 = new Monster();
		m1.x = (int)(Math.random()*100)+1;//1~100������ ��������;
		m1.y = (int)(Math.random()*100)+1;//1~100������ ��������;
		
		//�Ű������� �ִ� ������ : �����͸� ����־ ��ü ����
		int x = (int)(Math.random()*100)+1;//1~100������ ��������;
		int y = (int)(Math.random()*100)+1;//1~100������ ��������;
		Monster m2 = new Monster(x, y);
		
		m1.info();
		m2.info();
		
		Monster m3[]=new Monster[5];
		 m3.Monster[0] x=(int)(Math.random()*100)+1;
		 m3.Monster[1] y=(int)(Math.random()*100)+1;
		 */
		
	}
}














	
	
	
	}
}
