import java.awt.*;

class MyFrame_06 extends Frame{
	//�߰��ϰ� ���� �������(������Ʈ)�� ����ʵ忡 ����
	
	//MenuBar : �޴��� �����Ҽ� �ִ°���
	private MenuBar bar = new MenuBar();
	
	//Menu : ���� �޴��� �Ŵ����� �ִ� �޴�
	private Menu file = new Menu("����");
	private Menu edit = new Menu("����");
	
	private Menu color = new Menu("������");
		
	//MenuItem : ���� �޴��� ������ ���� �ʴ� �޴�
	private MenuItem fnew = new MenuItem("������");
	private MenuItem fopen = new MenuItem("���Ͽ���");
	private MenuItem fsave = new MenuItem("��������");
	private MenuItem fexit = new MenuItem("����");;
	
	//CheckboxMenuItem : check�� ������ MenuItem
	private CheckboxMenuItem red = new CheckboxMenuItem("����");
	private CheckboxMenuItem blue = new CheckboxMenuItem("�Ķ�");
	private CheckboxMenuItem yellow = new CheckboxMenuItem("���");
	
	
	public void menu(){
		//�޴��� ���õ� ����
				this.setMenuBar(bar);
				bar.add(file);
				file.add(fnew);
				
				file.addSeparator();//���м� �߰�
				
				file.add(fopen); file.add(fsave);	
				
				file.addSeparator();
				
				file.add(fexit);
				bar.add(edit);
				edit.add(color);
				color.add(red);
				color.add(blue);
				color.add(yellow);
	}
	
	public void init(){
		//ȭ�� ���� ��� ��ġ
	}
	public MyFrame_06(String title){
		super(title);//���� ����
		this.menu();
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

public class Exam_06 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("������");
		MyFrame_06 mf = new MyFrame_06("AWT �ǽ�!");
	}
}

