
import java.awt.*;
class MyFrame_10 extends Frame{
	//â�� ��ġ�ϰ� ���� �������(������Ʈ)���� ����
	
	//BorderLayout : �߽ɿ� ���Ը� �� ���̾ƿ�
	private BorderLayout bl = new BorderLayout(); 	//(x����, y����)
	private Button bt1 =new Button("��ư1");
	private Button bt2 =new Button("��ư2");
	private Button bt3 =new Button("��ư3");
	private Button bt4 =new Button("��ư4");
	private Button bt5 =new Button("��ư5");
		
	public MyFrame_10(String title){
		super(title);	//������
		
		this.setLayout(bl);
		//this.setLayout(new BorderLayout());
		
		this.add("Center",bt1);	//("����", ������Ʈ)
		this.add(bt2, BorderLayout.NORTH);
		this.add(bt3, BorderLayout.WEST);
		this.add(bt4, BorderLayout.EAST);
		this.add(bt5, BorderLayout.SOUTH);
		
		super.setSize(400,300);//ũ�⼳��
		// ��ġ ����
		Dimension screen= Toolkit.getDefaultToolkit().getScreenSize();
		int xpos=(int)(screen.getHeight()/2-super.getHeight()/2);
		int ypos=(int)(screen.getWidth()/2-super.getWidth()/2);
		super.setLocation(xpos,ypos);
		super.setResizable(false);
		super.setVisible(true);
		//ũ�⺯�� ����
		//������ġ�� �����ֱ�
	}
}
public class Exam_10 {
	public static void main(String[] ar){
		MyFrame_10 mf=new MyFrame_10("AWT �ǽ�!");
	}
}
