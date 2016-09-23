import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
class MyFrame_05 extends Frame implements Runnable{
	//â�� ��ġ�ϰ� ���� �������(������Ʈ)���� �̰��� ����
	
	//Label : ���ڳ� �׸��� �����ϴ� ������ ����
	private Label lb = new Label("���� ���� ��!", Label.CENTER);//("ǥ�ñ���", ���İ�);
	
	public MyFrame_05(String title){
		super(title);//���� ����
		
		//�������(������Ʈ) Frame�� �߰� : add()
		this.add(lb);//lb�� this�� �߰�
		//lb.setBackground(Color.YELLOW);
		
		super.setSize(400, 300);//ũ�� ����
		//��ġ ����
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);//ũ�⺯�� ����
		super.setVisible(true);//���� ��ġ�� �����ֱ�
		
		//��Ƽ������ ����
//		this.start();
		Thread th = new Thread(this);
		th.setDaemon(true);
		th.start();
	}

	@Override
	public void run() {
		while(true){
			Date date = new Date();
			SimpleDateFormat sdf = 
				new SimpleDateFormat("y�� M�� d�� a h�� m�� s��");
			//System.out.println(sdf.format(date));
			//lb�� ���� ǥ��
			lb.setText(sdf.format(date));
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
public class Exam_06 {
	public static void main(String[] ar){
		MyFrame_05 mf = new MyFrame_05("AWT �ǽ�!");//Frame�� ��ü ����
	}
}










