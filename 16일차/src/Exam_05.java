//�츮�� ����� �⺻���� - ����̿�
import java.awt.*;

class MyFrame_04 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
	}
	public MyFrame_04(String title){
		super(title);//���� ����
		this.init();
		super.setSize(400, 300);//ũ�� ����
		//ȭ�� �߾ӿ� ��ġ
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);//��ġ ����
		super.setResizable(false);//ũ�� ���� �Ұ�
		super.setVisible(true);//�����ֵ��� ����		
	}
}

public class Exam_04 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_04 mf = new MyFrame_04("AWT �ǽ�!");
	}
}

