//KeyEvent : Ű������ �Է� �� �߻��Ǵ� �̺�Ʈ
//KeyListener(I), KeyAdapter(C)
import java.awt.*;
import java.awt.event.*;
class MyFrame_02 extends Frame implements KeyListener{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	private TextArea ta = new TextArea();
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		this.add(ta);//BorderLayout.CENTER�� �߰�(�⺻��)
		ta.setFont(new Font("", Font.PLAIN, 15));
	}
	public void start(){
		//�̺�Ʈ ���
		
		//TextArea�� KeyEvent�� �����Ͽ� ���� ó���ϰڽ��ϴ�.
		ta.addKeyListener(this);
	}
	public MyFrame_02(String title){
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
	public void keyTyped(KeyEvent e) {
//		System.out.println("Ÿ����");
		System.out.println(e.getKeyChar());
		switch(e.getKeyChar()){
		case 'x' : System.exit(0);
		}
	}
	public void keyPressed(KeyEvent e) {
		System.out.println("����");
	}
	public void keyReleased(KeyEvent e) {
		System.out.println("��");
	}
}

public class Exam_02 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_02 mf = new MyFrame_02("AWT �ǽ�!");
	}
}

