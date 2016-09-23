import java.awt.*;
import java.awt.event.*;
class MyFrame_001 extends Frame implements ActionListener{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	private Button bt1 = new Button("����");
	private Button bt2 = new Button("���");
	private Button bt3 = new Button("������");
	
	private String msg = "��ư�� ��������!";
	private Label lb = new Label(msg, Label.CENTER);
	
	private Panel panel = new Panel();
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		this.setLayout(new GridLayout(2,1));
		this.add(panel);
		panel.setLayout(new GridLayout(1,3));
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		this.add(lb);
	}
	public void start(){
		//�̺�Ʈ ���
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
	}
	public MyFrame_001(String title){
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
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();//ǥ�ñ���
		if(cmd.equals("����")) lb.setText("���� ��ư �������~");
		else if(cmd.equals("���")) lb.setText("��� ��ư �������~");
		else if(cmd.equals("������")) lb.setText("������ ��ư �������~");
		
//		��Ƽ ������
		Thread th = new Thread(){
			public void run() {
				try{
					Thread.sleep(2000);//2��
				}catch(Exception err){}
				lb.setText(msg);//�ʱⰪ
			}
		};
		th.start();
		
//		���� ������
//		try{
//			Thread.sleep(2000);//2��
//		}catch(Exception err){}
//		lb.setText(msg);//�ʱⰪ
	}
}

public class Quiz_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_001 mf = new MyFrame_001("AWT �ǽ�!");
	}
}

