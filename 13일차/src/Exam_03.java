//Calendar Ŭ���� : �ð� ����
import java.util.Calendar;
public class Exam_03 {
	public static void main(String[] ar)
	{
		//cal �̶�� �̸��� ���� �޷��� ��밡��
		Calendar cal=Calendar.getInstance();
		
//		System.out.println(cal);
		//���ϴ� �ð��� ���� : set(�ٲ��׸�, �ٲܰ�);
		cal.set(Calendar.YEAR,1999);
		cal.set(Calendar.MONTH,12-1);
		cal.set(Calendar.DATE, 31);
		
		
		//���ϴ� ������ ����	 : get(������ �׸��� ������);
		int yy=cal.get(Calendar.YEAR);
		int mm=cal.get(Calendar.MONTH)+1; //��(0~11), 12�� 1���� ������
		int dd=cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min=cal.get(Calendar.MINUTE);
		int sec=cal.get(Calendar.SECOND);
		String today = yy+ "��"+mm+"��"+dd+"��"+hour+"��"+min+"��"+sec+"��";
		System.out.println(today);
	
		//���� Ȯ�� : 1~7 ������ ������(DAY_OF_WEEK)
		int yoil = cal.get(Calendar.DAY_OF_MONTH);
		
		
	}
}
