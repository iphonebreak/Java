//List - ArrayList
import java.util.*;

class Mudo{
	private String name;
	public Mudo(String name){
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class Exam_01 {
	public static void main(String [] ar)
	{
		//����� ���� : Mudo�� ���尡�� �ϵ��� ����
		ArrayList<Mudo> list= new ArrayList <Mudo>();
		
		//������ �߰� : add()
//		list.add("���缮");
		list.add(new Mudo("���缮"));
		list.add(new Mudo("������"));
		list.add(new Mudo("������"));
		list.add(new Mudo("��ȫö"));
		list.add(new Mudo("�漺��"));
		list.add(new Mudo("����"));
		
		list.add(1, new Mudo("�ڸ��"));	//������ ���� �ڷ� 1ĭ �и�
		
		//������ �Ѱ� �������� : get(����)
		Mudo tmp = list.get(5);
		System.out.println(tmp.getName().equals("�漺��"));
		
		//��ü�� �̿��� ����
		list.remove(tmp);	//�漺�� ����
		list.remove(4);		//4���� ��ȫö ����
		
		//List�� ������ : get(index)
		//for(�ڷ��� ������ : �����)
		for(Mudo mudo : list){
			System.out.println("Ȯ��for�� : "+mudo.getName());
		}
		for(int i=0; i<list.size(); ++i){
			Mudo mudo = list.get(i);
			//���Ĵ� ������
			System.out.println(mudo.getName());
			
		}
		//���� �ڼ��� : �ٸ� �ܺ� Ŭ������ �޼ҵ� ������ �޴´�.
		Collections.shuffle(list);	//���� ����
		
		//��ü ����
		Iterator <Mudo> it = list.iterator();
		while(it.hasNext()){
			Mudo mudo = it.next();
			//������ ���� ���Ĵ� ������!
			System.out.println("�̸�: "+mudo.getName());
		}
		
		
		
		
		
		
		
		
	}
}
