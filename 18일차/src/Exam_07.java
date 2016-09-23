//JFileChooser : ������ �����ϴ� ���� â
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class MyFrame_07 extends JFrame implements ActionListener{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	private Container con;
	
	private JFileChooser jfc = new JFileChooser(".");//("�ʱ���");
	
	private JButton open = new JButton("���� ����");
	private JButton save = new JButton("���� ����");
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(open);
		con.add(save);
	}
	public void start(){
		//�̺�Ʈ ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������°�
		open.addActionListener(this);
		save.addActionListener(this);
	}
	public MyFrame_07(String title){
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
		if(e.getSource()==open){//���� ����
			int a=jfc.showOpenDialog(this); //�θ�
			System.out.println("a="+a);
		}else if(e.getSource()==save){//���� ����
			int a=jfc.showSaveDialog(this);
			System.out.println("a="+a);
		}
	}
}

public class Exam_07 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_07 mf = new MyFrame_07("AWT �ǽ�!");
	}
}







