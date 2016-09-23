import java.util.Iterator;
import java.util.TreeSet;


class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person per) {
		//��Ģ ����, ���̼� ���� �� �̸��� ����
		if(this.age>per.age) return 1;
		else if(this.age<per.age) return -1;
		else //���� ���
			return name.compareTo(per.getName());
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("���缮",42));
		ts.add(new Person("������",43));
		ts.add(new Person("�ڸ��",44));
		ts.add(new Person("����", 36));
		ts.add(new Person("��ȫö", 36));
		ts.add(new Person("������", 39));
		ts.add(new Person("�漺��", 37));
		
		Iterator<Person> it = ts.iterator();//��������
		while(it.hasNext()){
			Person per = it.next();
			System.out.println("�̸� : " + per.getName()+", ���� : "+per.getAge());
		}
	}
}
















