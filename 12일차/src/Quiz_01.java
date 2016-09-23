/*
������ �Ѱ� �Է¹޾� �̸��� ���������� �˻�

	����)
	1. @ �� . ���� ���� ���;� �Ѵ�.
	2. �������� .com, .net, .co.kr �� ������ �Ѵ�.
	3. �ѱ��� ��� �Ұ�
	4. ���̴� 10���� �̻�

������ �����ϸ� �̸��� ��� ����,
������ �Ҹ����ϸ� � ���ǿ��� ������ ��������� ����ڿ��� �˷��ش�.
*/

/**
<String ����> - �̸��� �˻�
����)
1. @�� .���� ���� ���;� �Ѵ�.
2. �������� .com, .net, .co.kr�� ������ �Ѵ�.
3. �ѱ��� ��� �Ұ�
4. ���̴� 10���� �̻�

������ �����ϸ� �̸��� ��� ����
������ �Ҹ����ϸ� � ���ǿ��� ������ ��������� ����ڿ��� �˸�
 */
import java.util.*;

//import java.util.regex.Pattern;
public class Quiz_01 {
	public static void main(String[] ar) {
		Scanner sc = new Scanner(System.in);

		System.out.println("����� �̸��� �ּ� : ");
		String email = sc.nextLine();

		String[] arr = email.trim().split("@");
		if (arr.length != 2) {
			System.out.println("@�� ���ų� �ʹ� �����ϴ�.");
			return;
		}

		String prefix = arr[0];
		for (int i = 0; i < prefix.length(); ++i) {
			char tmp = prefix.toUpperCase().charAt(i);
			if (!(tmp >= '0' && tmp <= '9') && !(tmp >= 'A' && tmp <= 'Z')) {
				System.out.println("�̸��� �̸��� ������ ���ڸ� ����");
				return;
			}
		}

		String suffix = arr[1];
		String[] domain = suffix.split("[.]");
//		for (int i = 0; i < domain.length; ++i) {
//			System.out.println(domain[i]);
//		}
		if (domain.length > 3 || domain.length < 2) {
			System.out.println("������ ���� ����");
			return;
		}

		for (int i = 0; i < domain.length; ++i) {
			for (int j = 0; j < domain[i].length(); ++j) {
				char tmp = domain[i].toUpperCase().charAt(j);
				if (!(tmp >= '0' && tmp <= '9') && !(tmp >= 'A' && tmp <= 'Z')) {
					System.out.println("�������� ������ ���ڸ� ����");
					return;
				}
			}
		}

		String[] end = new String[] { ".com", ".co.kr", ".net" };
		boolean check = false;
		
		//for(int i=0; i<end.length; ++i){
		//for(�ڷ��� ������ : �����){
		for (String tmp : end) {
			if (email.endsWith(tmp)) {
				check = true;
			}
		}
		if (!check) {
			System.out.println(".com , .net , .co.kr�� ��� ����");
			return;
		}

		System.out.println("��� ����!");
		System.out.println("����� �̸��� : " + email);

		// Pattern�� �̿��� �˻�

		// if(!Pattern.matches("^(?:\\w+\\.?)*\\w+@(?:\\w+\\.)+\\w+$", email)){
		// System.out.println("�̸��� ���Ŀ� ��߳�");
		// }else{
		// System.out.println("�̸��� ��� ����");
		// System.out.println(email);
		// }
	}
}







