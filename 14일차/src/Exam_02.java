//Map - Hashtable
import java.util.*;
public class Exam_02 {
	public static void main(String []ar){
		//����� ����
		Hashtable<String,String> ht = new Hashtable();
		
		//������ �߰� : put(key, value); ������ ���� ������ object�� ����
		ht.put("���缮","���׸�");
		ht.put("������","���׸�");
		ht.put("��ȫö","���׸�");
		ht.put("������","���׸�");
		ht.put("�ڸ��","���׸�");
		ht.put("����","���׸�");
		ht.put("��","����");
		
		//value ����
		ht.put("����", "����");
		
		//������ ���� Ȯ�� : key ������ value �� Ȯ�� : get(key)
		String tmp = ht.get("����");
		System.out.println("������ ������"+tmp);
		
		//���� : remove()
		String str = ht.remove("��ȫö");
		System.out.println(str);
		
		//key�� Ȯ�� : containskey()
		if(ht.containsKey("��ȫö") System.out.println("��ȫö ����!");
		else System.out.println("��ȫö ����!");
		
		//value �� Ȯ�� : containsValue()
		if(ht.containsValue("����")) System.out.println("���� ����");
		else System.out.println("���� ����");
		
		//ũ�� Ȯ�� : size()
		System.out.println("�����  : "+ht.size());
	
		//��ü ����
		Enumeration<String> enu = null;
		
		//��ü key ���� : keys()
		enu = ht.key();
		while(enu.hasMoreElements()){//it.hasNext()
			String name = enu.nextElement(); //it.next()
			//name�� ������ ���Ҽ� �ִ°�???????/
			String job = ht.get(name);
			System.out.println(name+"���� ������" + job);
		}
		
		//��ü value ���� : elements()
		enu = ht.elements();
		while(enu.hasMoreElements()){
			String job = enu.nextElement();
			//value�� �Ҽ� �ִ°�?????
			System.out.println("���� :"+job);
		}
	
	
	
	
	
	}
}
