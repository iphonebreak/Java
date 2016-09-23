//set - HashSet
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Exam_04 {
	public static void main(String [] ar){
		//����� ���� (�ζ� ���� �������.)
		HashSet <String> hs= new HashSet<String>();
		
		//������ �߰� : add()
		String tmp = new String ("���缮");
		boolean a = hs.add(tmp); //String -> Object ��ĳ����
		boolean b = hs.add(tmp);
		System.out.println(a);
		System.out.println(b);
		hs.add("������");
		hs.add("������");
		hs.add("����");
		hs.add("�ڸ��");
		hs.add("��ȫö");
		hs.add("��");
		
		//������ ���� : remove()
		boolean d= hs.remove("��")
		if(d) System.out.println("���� Ż�� ���׽��ϴ�.");
		else System.out.println("���� ���ѵ��� ����� �ƴմϴ�.");		
		
		//������ ���� Ȯ�� :  contains()
		boolean c=hs.contains("��");
		if(c) System.out.println("���� ���ѵ��� ����Դϴ�.");
		else System.out.println("���� ���ѵ��� ����� �ƴմϴ�.");
		
		//������ ���� Ȯ�� : size()
		System.out.println("������ ���� : "+hs.size());
		
		//������ ��ü ���� : hs�� ������ �����Ƿ� �ٸ������� �Űܴ�´�.
		//���1: Iterator��� ������ �뿡 �ű�ڴ�.
		Iterator<String> it = hs.iterator(); //hs ��ü ������ ����(HashSet ->Iterator)
		while(it.hasNext()){
			Object obj = it.next(); //������ �����Ͷ�
			String name = (String)obj; //�ٿ�ĳ����
			//String name = (String)it.next();
			
			//Generic�� ����ؼ� �ٿ�ĳ������ �ʿ����.
			String name = it.next();
			
			//������ͼ� ��� �Ұ��ΰ�?~~~~~~~
			System.out.println("�̸� : "+name);
		}
		
		//���2: �迭�� ���ܴ�� ó�� �ϰڴ�.
		String[] arr = new String[hs.size()];
		//hs-> arr�� ����
		hs.toArray(arr);
		
		//for(�ڷ��� ������ : �����)
		for(String name : arr){
			System.out.println("�̸�(�迭) : "+name);
		}
		
		
	}
}
