/*
<�α��� ����>
Hashtable�� �̿��Ͽ� ȸ�����԰� �α����� �����ϼ��� key : id , value : pw
<�޴��� ����>
1.ȸ������ 2.�α��� 3.ȸ����� 4.����

1. ȸ������ - id�� pw�� �Է¹޾� id�� �ߺ��� �ƴ� ��쿡�� ���� ó��

2. �α��� - id�� pw�� �Է¹޾� �α��� ó��
(���� ���)
 - �α��� ���� : id�� ht�� �����ϰ� pw�� ��ġ�ϴ� ���
 - �α��� ����
	���̵� ���� : id�� ht�� ���� ���
	��й�ȣ Ʋ�� : pw�� ����� ���� ��ġ���� �ʴ� ���

3. ȸ����� : ��ü ȸ���� id�� pw�� 1�ٿ� 1�� ���
*/
import java.util.*;
public class Quiz_02{
	public static void main(String[] ar){
		Hashtable <String,String> ha = new Hashtable();
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("<�޴�>");
		System.out.println("1. ȸ������ 2. �α��� 3. ȸ����� 4. ����");
		int a= sc.nextInt();
		
		switch (a){
		
		case 1:
		System.out.println("<ȸ������>");
		System.out.print("id : ");
		 String id=sc.nextLine();
		  sc.nextLine();
		System.out.print("pw : ");
		 String pw=sc.nextLine();
						
		if(ha.containsKey(id)){
			System.out.println("���̵� �ߺ�");
		}
		else{
			ha.put(id,pw);
			System.out.println("ȸ������ �Ϸ�");
		}
		break;
		
		
		case 2:
		System.out.println("<�α���>");
		System.out.print("id : ");
		String id=sc.nextLine();
		sc.nextLine();
		System.out.print("pw : ");
		String pw=sc.nextLine();
		
		
		case 3: 
			
		case 4:
			System.exit(0);
		
		
		 }
		}
		
		
	}
}
	
/*
 * import java.util.*;
class Process{//ó�� Ŭ����
	private Hashtable<String, String> ht;
	private Scanner sc;
	public Process(){
		ht = new Hashtable<String, String>();
		sc = new Scanner(System.in);
	}
	
	public void accept(){
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		
		//�ߺ��˻� : containsKey()
		if(ht.containsKey(id))//���̵� �����Ѵٸ�
			System.out.println("�̹� ������� ���̵��Դϴ�.");
		else{
			ht.put(id, pw);//ȸ������
			System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�.\n�α����ϼ���");
		}
	}
	public void login(){
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		
		if(ht.containsKey(id)){//���̵� �ֽ��ϱ�
			String dbPw = ht.get(id);
			if(pw.equals(dbPw)){//��й�ȣ�� �½��ϱ�
				System.out.println(id+"�� ȯ���մϴ�~!");
			}else{
				System.out.println("��й�ȣ�� ���� �ʽ��ϴ�.");
			}
		}else{
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		}
		
	}
	public void list(){
		//��ü ����
		Enumeration<String> enu = ht.keys();
		while(enu.hasMoreElements()){
			String id = enu.nextElement();
			String pw = ht.get(id);
			System.out.println(id+"\t\t"+pw);
		}
	}
}
public class Quiz_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		//ó�� Ŭ���� ��ü ����
		Process pro = new Process();
		
		while(true){
			System.out.print("1.ȸ������ 2.�α��� 3.ȸ����� 4.���� : ");
			int select = sc.nextInt();
			switch(select){
			case 1://ȸ������
				pro.accept();
				break;
			case 2://�α���
				pro.login();
				break;
			case 3://ȸ�����
				pro.list();
				break;
			case 4://����
				System.exit(0);
			default://�߸��Է�
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}

 */
