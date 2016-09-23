/**
 		Random, Calendar �� ������ ����
		<��ȥ ���� ��÷ ���α׷�>
		2016�⿡ ��ȥ�� �Ϸ��� �մϴ�.
		��¥�� �������� ��÷�Ϸ��� �ϴµ�
		������ϰ� �Ͽ��� �߿��� ����ϵ��� ������ �ֽñ� �ٶ��ϴ�.
		
		��¥ ��÷�� 1~31�� ������ �ϼ���
		
		<���ȭ��>
		==========��ȥ ����==========
		����� ������ 2016�� 7�� 16�� ����� �Դϴ�.
		=========================
 */
import java.util.*;
public class Quiz_01 {
	public static void main(String[] ar){
		Calendar cal = Calendar.getInstance();
		Random rand = new Random();
		int yoil;
		
		//���� ����(2016��)
		cal.set(Calendar.YEAR, 2016);
		
		do{
			//��¥�� �������� �ѹ� �̾ƺ���.
			int mm = rand.nextInt(12);//0~11
			int dd = rand.nextInt(31)+1;//1~31
			
			//������ ��¥�� �޷� ����
			cal.set(Calendar.MONTH, mm);
			cal.set(Calendar.DAY_OF_MONTH, dd);
			
			//���� Ȯ��
			yoil = cal.get(Calendar.DAY_OF_WEEK);//1, 7
		}while(yoil!=1&&yoil!=7);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		String date = year+"�� " + month+"�� " + day+"��";
		
		String dow=null;//����
		switch(yoil){
		case 1:dow="�Ͽ���";	break;
		case 7:dow="�����";	break;
		}
		
		System.out.println("======��ȥ�� ����======");
		System.out.println(date+" "+dow);
	}
}