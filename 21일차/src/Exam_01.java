import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class MyFrame_01 extends JFrame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	private Container con;
	private Button bt = new Button();
	private Button bt2= new Button("����");
	private Button bt3= new Button("�ٽ�");
	private Button bt4= new Button("����");
	
	private Panel panel = new Panel();
	private Panel panel2 = new Panel();
		
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		con = this.getContentPane();
		this.setLayout(new BorderLayout());
		this.add(panel, BorderLayout.CENTER);
		bt();
		panel.setLayout(new GridLayout(9,9));
		
		this.add(panel2, BorderLayout.SOUTH);
		this.setLayout(new FlowLayout());
		this.add(panel2, FlowLayout.LEFT);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
						
	}
	

	public void bt(){
		for(int i=1; i<81; i++){
			bt=new Button();
			panel.add(bt);
		}
	}
	public void start(){
		//�̺�Ʈ ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������°�
	}
	
	public MyFrame_01(String title){
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
	
	}
}
public class Exam_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_01 mf = new MyFrame_01("AWT �ǽ�!");
	}
}