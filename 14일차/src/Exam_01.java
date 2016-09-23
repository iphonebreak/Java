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
		//규칙 구현, 나이순 정렬 후 이름순 정렬
		if(this.age>per.age) return 1;
		else if(this.age<per.age) return -1;
		else //같은 경우
			return name.compareTo(per.getName());
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("유재석",42));
		ts.add(new Person("정준하",43));
		ts.add(new Person("박명수",44));
		ts.add(new Person("하하", 36));
		ts.add(new Person("노홍철", 36));
		ts.add(new Person("정형돈", 39));
		ts.add(new Person("길성준", 37));
		
		Iterator<Person> it = ts.iterator();//오름차순
		while(it.hasNext()){
			Person per = it.next();
			System.out.println("이름 : " + per.getName()+", 나이 : "+per.getAge());
		}
	}
}
















