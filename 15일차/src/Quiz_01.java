/**
		<����> - ���� ������
		Math.random(), Random ���� ���ð�
		����ڰ� ���ϴ� ������ŭ
		1~100������ �ߺ� ���� ���������� ����� �ּ���
		
		(Hint) ArrayList�� Collections.shuffle()�� �̿��ϼ���
		
		<���ȭ��>
		���� ���� : 5
		5		90		35		61		42
 */
import java.util.*;

public class Quiz_01 {
	public static void main(String[] ar){
		ArrayList list= new ArrayList ();
		Scanner sc=new Scanner(System.in);
		
		for(int i=1; i<=100; ++i)	list.add(i);
		
		System.out.println("���� ���� : ");
		int a = sc.nextInt();
		Collections.shuffle(list);
		for(int i=0; i=)
		System.out.println(list.get());
	}
		
	}
}

/*
import java.util.*;
public class Quiz_01 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ּҰ� : ");
		int min = sc.nextInt();
		System.out.print("�ִ밪 : ");
		int max = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>(max-min+1);//100ĭ
		
		for(int i=min; i<=max; ++i)	list.add(i);
		
		System.out.print("���� ���� : ");
		int size = sc.nextInt();
		
		Collections.shuffle(list);//�����ְ�
		
		for(int i=0; i<size; ++i){//size����ŭ ���
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
	}
}


*/