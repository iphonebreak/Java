import java.awt.*;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;
class MyFrame_001 extends JFrame implements ActionListener{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	private Container con;
	private JFileChooser jfc = new JFileChooser(".");
	
	FileOutputStream fos = new FileOutputStream(file);//���
	BufferedOutputStream bos = new BufferedOutputStream(fos);//��θ�
	ObjectOutputStream oos = new ObjectOutputStream(bos);//���۸�
	
	private MenuBar mb = new MenuBar();
	private Menu menu = new Menu("�޴�");
	
	private MenuItem open = new MenuItem("����");
	private MenuItem save = new MenuItem("����");
	private MenuItem exit = new MenuItem("������");
	
	
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		con = this.getContentPane();
		this.setMenuBar(mb);
		mb.add(menu); menu.add(open); menu.add(save); menu.addSeparator(); menu.add(exit);
	}
	public void start(){
		//�̺�Ʈ ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������°�
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public MyFrame_001(String title){
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
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==open){
			jfc.showOpenDialog(this);
		}else if(e.getSource()==save){
			jfc.showSaveDialog(this);
		}else if(e.getSource()==exit){
			System.exit(0);
		}
		
	}
}
public class Quiz_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_001 mf = new MyFrame_001("AWT �ǽ�!");
	}
}