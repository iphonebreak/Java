
import java.awt.*;
class MyFrame_09 extends Frame{
	//â�� ��ġ�ϰ� ���� �������(������Ʈ)���� ����
	
	//GridLayout : ǥ�� ���İ� ������ ���̾ƿ� (��, ĭ)
	private GridLayout gl= new GridLayout(3,2);	//(��, ĭ, x����)
	
	private Button bt1 =new Button("��ư1");
	private Button bt2 =new Button("��ư2");
	private Button bt3 =new Button("��ư3");
	private Button bt4 =new Button("��ư4");
	private Button bt5 =new Button("��ư5");
	private Button bt6 =new Button("��ư6");
	
	public MyFrame_09(String title){
		super(title);	//������
		
		this.setLayout(gl);
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		this.add(bt4);
		this.add(bt5);
		this.add(bt6);
		
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
public class Exam_09 {
	public static void main(String[] ar){
		MyFrame_09 mf=new MyFrame_09("AWT �ǽ�!");
	}
}
