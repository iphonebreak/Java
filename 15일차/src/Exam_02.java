//����ó��
import java.util.*;
public class Exam_02 {
	public static void main(String[] ar){
		Scanner sc = new Scanner(System.in);
		
		//�ΰ��� ���� �Է¹޾� ������ ������ �ϴ� ���α׷�
		try{
		System.out.println("��1 : ");
		int su1= sc.nextInt();	
		System.out.println("��2 : ");
		int su2 = sc.nextInt();
		
		System.out.println(su1%su2);
		}
		catch(Exception e){
			System.err.println("���� �߻�!");
			System.err.println(e.getMessage()); //���� ���
			
			e.printStackTrace();//����ó���� ���� ������ ó�� ������ �����޶�
		}
//		}catch(InputMismatchException e){ 	//�����̸� ������
//			System.out.println("���� �Է��϶�� �߳� ���߳�");
//		}catch(ArithmeticException e){
//			System.out.println("�ʵ��б��� ������ �ٳ��");
//		
//	}
	}
}
