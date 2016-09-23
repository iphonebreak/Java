
class Marine
{
	String name;
	int age;
	String job;
	int year;
	
	Marine()
	{
		job="군인";
		year =2;
	}
	
	Marine (String name)
	{
		//내 기본 생성자 호출
		this();
		this.name=name;
		
	}
	
	Marine(String name, int age){
		this(name);
		this.age = age;
	}
	
	void info()
	{
		System.out.println("이름: "+name);
		System.out.println("나이 : "+age);
		System.out.println("직업 : "+ job);
		System.out.println("복무기간 : "+year);
	}
}
public class Exam_04 {
	public static void main(String [] ar){
		
	//군인 3명 생성
	Marine m1 = new Marine();
	Marine m2 = new Marine("터미네이터 ");
	Marine m3 = new Marine("브루스 윌리스",50);
	
	m1.info();
	m2.info();
	m3.info();
	
	}
}
