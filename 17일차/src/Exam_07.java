import java.awt.*;

class MyFrame_07 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	private Label lb = new Label("����� ��������? ",Label.CENTER);
	
	//Choice : ������ �������� ������â 
	private Choice ch = new Choice();
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		this.setLayout(new GridLayout(2,1));
		this.add(lb);
		ch.add("A��");
		ch.add("B��");
		ch.add("AB��");
		ch.add("O��");
		this.add(ch);
	}
	public MyFrame_07(String title){
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

public class Exam_07 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_07 mf = new MyFrame_07("AWT �ǽ�!");
	}
}

