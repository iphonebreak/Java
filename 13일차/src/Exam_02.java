//Date Ŭ����
import java.util.Date;
import java.text.*;;
public class Exam_02 {
	public static void main (String[] ar)
	{
		Date today = new Date();
//		System.out.println(today);
		
		//java.text ��Ű�� ����
		//��¥������ ���ϰ� �����ϵ��� ���ִ� Ŭ���� ����
		
		SimpleDateFormat sdf= new SimpleDateFormat("y�� M�� d�� E���� [h�� m�� s��]"); //("����")
		
		System.out.println(sdf.format(today));
		
		
		//������ ��¥������ ����� ��� �ϼ���
		//2015 �� 1�� 21�� ������ [���� 7�� 38�� 2��]
		
		//���� ���� Ŭ����
		//1,000,000
		//# : ���ʿ��� 0 ���� / 0 : ���ʿ��� 0�� ���
		DecimalFormat df=new DecimalFormat("0.000"); //("����");
		System.out.println(df.format(1));
		
		
		
		
		
	}
}
