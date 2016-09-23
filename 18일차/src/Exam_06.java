//JColorChooser : ����ȯ
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyFrame_06 extends JFrame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	private Container con;
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		con = this.getContentPane();
	}
	public void start(){
		//�̺�Ʈ ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������°�
	}
	
	public MyFrame_06(String title){
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
		
		//���� ����â ����
		Color color = JColorChooser.showDialog(this, "�� ����~", Color.RED);  //(�θ�, "����", �ʱ����)
		//System.out.println(color);
		if(color!=null){
			con.setBackground(color);
		}
	}
}
public class Exam_06 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_06 mf = new MyFrame_06("AWT �ǽ�!");
	}
}