//Frame ����� ����
//- ��ü ����
//- ���
import java.awt.*;
public class Exam_04 {
	public static void main(String [] ar){
		Frame f1= new Frame();				//1��â
		Frame f2= new Frame("������");	//2��â - ������
		
		//ũ�� (size)����
		//f1.setSize(300, 200);	//(��, ����)
		f2.setSize(400, 300);
		
		//��ġ (location)
//		f2.setLocation(300, 200);
		
		//ȭ���� �߽ɰ��
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();	//ȭ���� ũ����
//		System.out.println(screen);
		int xpos =	(int)(screen.getWidth()/2 - f2.getWidth()/2);	//x������
		int ypos = (int)(screen.getHeight()/2 - f2.getHeight()/2);//y������
		f2.setLocation(xpos, ypos);
		
		//ũ�⺯�� ���� ����
		f2.setResizable(false);
		
		//���� ���� ���� : �⺻������ �Ⱥ����ֵ��� ����
		//f1.setVisible(true);
		f2.setVisible(true);
	}


}
