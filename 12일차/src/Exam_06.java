import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

//String class : ���ڿ��� ���õ� �ڷ���
public class Exam_06 {
	public static void main(String[] ar){
		String str = "Hello JAVA!";//������ġ : ��� �� �޼ҵ��
		String str1 = new String("Hello JAVA!");//���ڿ� �̿� ��ü ����
		byte[] by = new byte[]{'H','e','l','l','o',' ','J','A','V','A','!'};
		String str2 = new String(by);//byte[] �̿� ��ü ����
		
		//��
		
		//���� ��
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2)); //��ҹ��� ����
		
		//������ �� : ASCII �ڵ� �� ��
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		
		//�˻���
		String str3="aaa@naver.com";
		
		//@�� ������ �ִ���? indexOf()	- �ش� ������ ��ġ�� ��ȯ
		System.out.println(str3.indexOf("@")); 	//"@"�� �����ϴ°� (��������)
		
		//.com���� �����ϴ��� Ȯ�� 
		System.out.println(str3.endsWith(".com"));
		
		//a�� ���� �ϴ��� Ȯ��
		System.out.println(str3.startsWith("a"));
		
		//���� Ȯ��
		System.out.println(str3.length());
		
		//���ڿ�����
		String str4 = "                          ���ѹα�   ����          ";
		System.out.println(str4);
		System.out.println(str4.length());
		System.out.println(str4.trim());
		System.out.println(str4.trim().length());
		
		//�߶󳻱�
		System.out.println(str.substring(6));				//6��° ���� ~~~ JAVA!
		System.out.println(str.substring(6,10));			//6~9��° ����	  JAVA
		
		//�����ϱ� : ������(������ȣ)
		String str5="�̸�//����//����//�ּ�//����о�//�����Ⱓ";
		String[] arr = str5.split("//");
		
//		for(int i=0; i<arr.length; ++i)
		for(String tmp : arr){ 					//�ڷ��� ������ : �����
			System.out.println(tmp);
		}
		
		//��ȯ
		
		//����-> �⺻ �ڷ��� : ��ȯ ������ �������� ��츸 ����
		boolean a=Boolean.parseBoolean("true");
		int b=Integer.parseInt("100");
		double c=Double.parseDouble("3.141592");
		char d=str.charAt(0); //'H'
		
		//�⺻�ڷ��� -> ���� : String.valueOf();
		String e;
		e = String.valueOf(a);
		e = String.valueOf(b);
		System.out.println(e+1);
		e = String.valueOf(c);
		e = String.valueOf(d);
		
		
		//����� ���� �ڷ��� -> String
		Scanner sc= new Scanner (System.in);
		String imsi=sc.toString();
		System.out.println(imsi);
				
		
	}
}

























