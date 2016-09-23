//JOptionPane : �� â�� �����ϴ� Ŭ����
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class MyFrame_08 extends JFrame implements ActionListener{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	private Container con;
	
	private JButton bt1 = new JButton("�˸�â");
	private JButton bt2 = new JButton("Ȯ��â");
	private JButton bt3 = new JButton("�Է�â");
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(bt1);
		con.add(bt2);
		con.add(bt3);
	}
	public void start(){
		//�̺�Ʈ ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������°�
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
	}
	public MyFrame_08(String title){
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
		if(e.getSource()==bt1){//�˸�â
			JOptionPane.showMessageDialog(this, 
				"�޷ո޷�", "�˸�â", JOptionPane.ERROR_MESSAGE);
														//(�θ�, "�޼���", "����", �׸���);
		}else if(e.getSource()==bt2){//Ȯ��â
			int a = JOptionPane.showConfirmDialog(this,"���� ���?", "���Ȯ��", JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE);
								//(�θ�, "�޼���", "â����", ��ư����, �׸���);
			if(a==0){
				System.out.println("��ٿϷ�!");
			}
		}else if(e.getSource()==bt3){//�Է�â
			String text = JOptionPane.showInputDialog("�̸���?");	//�θ�, "�޼���", "â����", �׸���)
			System.out.println(text);
			
			if(text!=null){
				JOptionPane.showMessageDialog(this,"�̸� : "+text);
			}
		}
	}
}

public class Exam_08 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_08 mf = new MyFrame_08("AWT �ǽ�!");
	}
}

