import java.awt.*;

class MyFrame_05 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	//FileDialog : ���Ͽ��� , ���� â
	private FileDialog fdlg = new FileDialog(this, "�޷�", FileDialog.LOAD);
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
	}
	public MyFrame_05(String title){
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
		
		fdlg.setVisible(true);
	}
}

public class Exam_05 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_05 mf = new MyFrame_05("AWT �ǽ�!");
	}
}

