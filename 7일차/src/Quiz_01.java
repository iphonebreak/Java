/**
 		<�޼ҵ� �����>
 		�޼ҵ带 ���� ������ ��ȯ��, �̸�, �Ű����� ������ ���ϸ� �˴ϴ�!
 		������ ���¸� ���� �޼ҵ带 �����Ͽ� main()���� ��� �� ���
 		 		
 		1. ���� 1���� �ǳ׾��ָ� 1~�� ������ �������� 1���� ��ȯ�ϴ� �޼ҵ�
 		2. 1���� 100 ������ �������� 1���� ��ȯ�ϴ� �޼ҵ�
 		3. ���� �Ѱ��� �Է¹޾Ƽ� ��ȯ�ϴ� �޼ҵ�
 		4. �� 2���� �ǳ׾� �ָ� �հ踦 ���ؼ� ��ȯ�ϴ� �޼ҵ�
 		5. ���� 1���� �ǳ��ָ� �ش� ������ ȭ�鿡 ����ϴ� �޼ҵ�
 		6. �޼ҵ� ȣ��� Hello JAVA!�� ȭ�鿡 ����ϴ� �޼ҵ�
 		7. ���޹��� ���� �������� ȭ�鿡 ����ϴ� �޼ҵ�
 		8. ���޹��� ���� ���밪�� ����Ͽ� ȭ�鿡 ����ϴ� �޼ҵ�
 		
 */
import java.util.*;
public class Quiz_01 {
	public static void main(String[] ar){
		int a = random1();
		System.out.println("a = " + a);
		int b = random2(5);
		System.out.println("b = " + b);
		int c = input();
		System.out.println("c = " + c);
		float d = total(3.14f, 1.23f);
		System.out.println("d = " + d);
		
		output1("����");
		output2();
		sejegop(5);
		abs(-200);
	}
//	1. ���� 1���� �ǳ׾��ָ� 1~�� ������ �������� 1���� ��ȯ�ϴ� �޼ҵ�
	public static int random2(int a){
		int b = (int)(Math.random()*a)+1;
		return b;
	}
//	2. 1���� 100 ������ �������� 1���� ��ȯ�ϴ� �޼ҵ�
	public static int random1(){
		int a = (int)(Math.random()*100)+1;
		return a;
	}
//	3. ���� �Ѱ��� �Է¹޾Ƽ� ��ȯ�ϴ� �޼ҵ�
	public static int input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int su = sc.nextInt();
		return su;
	}
//	4. �� 2���� �ǳ׾� �ָ� �հ踦 ���ؼ� ��ȯ�ϴ� �޼ҵ�
	public static float total(float a, float b){
		return a+b;
	}
//	5. ���� 1���� �ǳ��ָ� �ش� ������ ȭ�鿡 ����ϴ� �޼ҵ�
	public static void output1(String msg){
		System.out.println(msg);
	}
//	6. �޼ҵ� ȣ��� Hello JAVA!�� ȭ�鿡 ����ϴ� �޼ҵ�
	public static void output2(){
		System.out.println("Hello JAVA!");
	}
//	7. ���޹��� ���� �������� ȭ�鿡 ����ϴ� �޼ҵ�
	public static void sejegop(int a){
		System.out.println(a*a*a);
	}
//	8. ���޹��� ���� ���밪�� ����Ͽ� ȭ�鿡 ����ϴ� �޼ҵ�
	public static void abs(int su){
		if(su<0) su *= -1;
		System.out.println("���밪 : " + su);
	}
}























