
import java.awt.*;
class MyFrame_07 extends Frame{
	//â�� ��ġ�ϰ� ���� �������(������Ʈ)���� ����
	
	//button : ������ ���� ������Ʈ
	private Button bt1= new Button ("��ư1");
	private Button bt2= new Button ("��ư2");
	
	
	public MyFrame_07(String title){
		super(title);	//������
		
		//��ư 2���� frame�� �߰�
		this.add(bt1);
		this.add(bt2);
		
		super.setSize(400,300);//ũ�⼳��
		// ��ġ ����
		Dimension screen= Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getHeight()/2-super.getHeight()/2);
		int ypos=(int)(screen.getWidth()/2-super.getWidth()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		//ũ�⺯�� ����
		//������ġ�� �����ֱ�
	}
}
public class Exam_07 {
	public static void main(String[] ar){
		MyFrame_07 mf=new MyFrame_07("AWT �ǽ�!");
	}
}
