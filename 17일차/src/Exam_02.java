
import java.awt.*;

class MyFrame_02 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	private Label lb= new Label("�����ϴ� ��������?",Label.CENTER);
	private Label lb2= new Label("����� ���ɴ��? ",Label.CENTER);
	
	//Checkbox : check �� ������ ������ ������Ʈ
	private Checkbox cb1 = new Checkbox("����ȭ");
	private Checkbox cb2 = new Checkbox("������");
	private Checkbox cb3 = new Checkbox("������");
	
	private CheckboxGroup cg = new CheckboxGroup();	//("ǥ�� �۱�", �׷��, ���ÿ���)
	
	private Checkbox cb4 = new Checkbox("10��", cg, false);
	private Checkbox cb5 = new Checkbox("20��", cg, true);
	private Checkbox cb6 = new Checkbox("30��", cg, false);
			
	private Panel panel =new Panel();
	private Panel panel2 =new Panel();
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		this.setLayout(new GridLayout(4,1));
		this.add(lb);
		this.add(panel);
		panel.setLayout(new GridLayout(1,3));
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
	
		this.add(lb2);
		this.add(panel2);
		panel2.setLayout(new GridLayout(1,3));
		panel2.add(cb4);
		panel2.add(cb5);
		panel2.add(cb6);
	}
	public MyFrame_02(String title){
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

public class Exam_02 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_02 mf = new MyFrame_02("AWT �ǽ�!");
	}
}

