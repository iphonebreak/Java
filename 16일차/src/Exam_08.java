//�츮�� ����� �⺻���� - ����̿�
import java.awt.*;
class MyFrame_08 extends Frame{
	//â�� ��ġ�ϰ� ���� �������(������Ʈ)���� ����
	
	//FlowLayout : ���� �ڸ��� ������Ʈ�� ��� ����߷� ������ �ϴ� ���̾ƿ�
	private FlowLayout fl= new FlowLayout(FlowLayout.LEFT);	//(���� ���°�)
	
	private Button bt1 =new Button("��ư1");
	private Button bt2 =new Button("��ư2");
	private Button bt3 =new Button("��ư3");
	
	public MyFrame_08(String title){
		super(title);	//������
		
		this.setLayout(fl);
		
		//������Ʈ ��ġ
		this.add(bt1);
		this.add(bt2);
		this.add(bt3);
		
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
public class Exam_08 {
	public static void main(String[] ar){
		MyFrame_08 mf=new MyFrame_08("AWT �ǽ�!");
	}
}

