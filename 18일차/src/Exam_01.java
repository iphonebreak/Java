//MouseEvent : ���콺�� �Է� �� �߻��ϴ� �̺�Ʈ
//ó�� Ŭ���� : MouseListener(I), MouseAdapter(C)
import java.awt.*;
import java.awt.event.*;
class EventHandler implements MouseListener{
	public void mouseClicked(MouseEvent e) {
//		System.out.println("Ŭ��");
//		System.out.println(e.getButton()); //���� ��ư ������?
//		System.out.println(e.getClickCount()); //��� ������?
		if(e.getClickCount()==2){
			System.out.println("���� Ŭ�� �ϼ̳׿�");
		}
	}
	public void mousePressed(MouseEvent e) {
		System.out.println("����");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("��");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("����");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("Ż��");
	}
}
class MyFrame_01 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	private Button bt = new Button("��ư");
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		this.setLayout(new BorderLayout());
		this.add(bt, BorderLayout.SOUTH);
	}
	public void start(){
		//�̺�Ʈ ���
		//bt�� MouseEvent�� �����Ͽ� ���� ó��
		EventHandler event = new EventHandler();
		bt.addMouseListener(event);
	}
	public MyFrame_01(String title){
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

public class Exam_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_01 mf = new MyFrame_01("AWT �ǽ�!");
	}
}


