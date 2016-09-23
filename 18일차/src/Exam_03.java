//WindowEvent : â�� �����Ϸ��� �ϸ� �߻��ϴ� �̺�Ʈ
//WindowListener(I), WindowAdapter(C)
import java.awt.*;
import java.awt.event.*;
class MyFrame_03 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
	}
	public void start(){
		//�̺�Ʈ ���
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.out.println("X ����!");
			}
			public void windowOpened(WindowEvent e) {
				System.out.println("â ����!");
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("â ����!");
			}
			public void windowActivated(WindowEvent e) {
				System.out.println("Ȱ��ȭ!");
			}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("�ּ�ȭ���� ���!");
			}
		});
	}
	public MyFrame_03(String title){
		super(title);//���� ����
		this.init();
		this.start();//�̺�Ʈ ���� �޼ҵ�
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

public class Exam_03 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_03 mf = new MyFrame_03("AWT �ǽ�!");
	}
}

