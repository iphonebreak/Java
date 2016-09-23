import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame_05 extends JFrame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	private Container con;
	
	private JButton bt1 = new JButton("��ư1");
	private JButton bt2 = new JButton("��ư2");
	
	//ImageIcon : ��ư�� �ø� �̹��� ������
	private ImageIcon image = new ImageIcon("icon1.png");
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		con = this.getContentPane();
		con.setLayout(new GridLayout(1,2));
		con.add(bt1);
		con.add(bt2);
	}
	public void start(){
		//�̺�Ʈ ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������°�
	}
	
	public MyFrame_05(String title){
		super(title);//���� ����
		this.init();
		this.start();
		super.setSize(400, 300);//ũ�� ����
		//ȭ�� �߾ӿ� ��ġ
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);//��ġ ����
		super.setResizable(false);//ũ�� ���� �Ұ�
		super.setVisible(true);//�����ֵ��� ����
		
		try{
			Thread.sleep(2000);
			
		}catch(Exception e){}
		bt1.setIcon(image); 	//JButton�� ImageIcon �����Ű��
	}
}
public class Exam_05 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_05 mf = new MyFrame_05("AWT �ǽ�!");
	}
}