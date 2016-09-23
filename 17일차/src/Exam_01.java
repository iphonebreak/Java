import java.awt.*;

class MyFrame_01 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	//��ư 3��
	private Button bt1 = new Button("��ư1");
	private Button bt2 = new Button("��ư2");
	private Button bt3 = new Button("��ư3");
	
	//Panel : Frame�� ����Ͽ� ���̾ƿ� ���� �� ������Ʈ�� ��ġ�ϴ� ������ ����
	private Panel panel = new Panel();
	private Panel panel2 = new Panel();
	
	public void init(){
		//���̾ƿ� ���� �� ������Ʈ ��ġ
		this.setLayout(new BorderLayout());//1ȸ�� ���̾ƿ� ��ü�� ����
		this.add(panel, BorderLayout.SOUTH);
		panel.setBackground(Color.YELLOW);		
		panel.setLayout(new GridLayout(1, 2));
		panel.add(bt1);
		panel.add(panel2);
		
		panel2.setLayout(new GridLayout(2,1));
		panel2.add(bt2);
		panel2.add(bt3);
	}
	
	public MyFrame_01(String title){
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

public class Exam_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_01 mf = new MyFrame_01("AWT �ǽ�!");
	}
}

