//�츮�� ����� �⺻���� - ����̿�
import java.awt.*;

class MyFrame_03 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	private Label lb = new Label("���� : ", Label.RIGHT);
	
	private Button bt = new Button("���");
	
	//TextField : �� ��¥�� �Է°���
	private TextField tf = new TextField();
		
	//TextArea : ���� ��¥�� �Է°���
	private TextArea ta = new TextArea();
	
	private Panel panel = new Panel();
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
				this.setLayout(new BorderLayout());
				this.add(panel, BorderLayout.NORTH);
				panel.setLayout(new BorderLayout());
				panel.add(lb, BorderLayout.WEST);
				panel.add(bt, BorderLayout.EAST);
				panel.add(tf, BorderLayout.CENTER);
				this.add(ta, BorderLayout.CENTER);
			
	}
	public MyFrame_03(String title){
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

public class Exam_03 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_03 mf = new MyFrame_03("AWT �ǽ�!");
	}
}

