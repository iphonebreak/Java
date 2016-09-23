import java.awt.*;

class MyFrame_001 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	private Label lb = new Label("��ȭ�� ����", Label.CENTER);
	
	//��ư 12��
	private Button[] bt = new Button[12];//���� ��ư �ȸ��������.
	//���� �迭
	private String[] str = 
			new String[]{"1","2","3","4","5","6","7","8","9","*","0","#"};
	
	private Panel panel = new Panel();
	
	//Font : ���ڿ� �����ϴ� Ŭ����
	private Font font = new Font("",Font.BOLD, 30);	//("�۲�", ���� , ũ��);
	
	//Color : ������ �����ϴ� Ŭ����
	private Color color = new Color (124,235,149);     //(R, G, B)
	
	//Cursor : Ŀ���� �����ϴ� Ŭ����
	private Cursor cursor = new Cursor(Cursor.SW_RESIZE_CURSOR); //(Ŀ�� ��簪)
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
		this.setLayout(new BorderLayout());
		this.add(lb, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 3));
		
		//Frame�� ���� ����
		this.setBackground(color);
		
		//lb�� �۲� Font�� ����
		lb.setFont(font);
		lb.setForeground(Color.darkGray);
		lb.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		//panel�� ��ư 12�� �߰�
		for(int i=0; i<bt.length; ++i){
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("",Font.ITALIC, 25));
			bt[i].setBackground(Color.cyan);
			panel.add(bt[i]);
		}
	}
	public MyFrame_001(String title){
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

public class Quiz_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_001 mf = new MyFrame_001("AWT �ǽ�!");
	}
}

