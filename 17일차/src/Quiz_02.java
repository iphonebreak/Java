import java.awt.*;
import java.awt.event.*;
class MyFrame_00 extends Frame implements ActionListener{
	//�߰��ϰ� ���� �������(������Ʈ) ����
	private MenuBar mb = new MenuBar();
	private Menu edit = new Menu("����");
	private Menu view = new Menu("����");
	
	private MenuItem copy = new MenuItem("����");
	private MenuItem paste = new MenuItem("�ٿ��ֱ�");
	private MenuItem exit = new MenuItem("����");
	
	private CheckboxMenuItem view1 = new CheckboxMenuItem("�Ϲݿ�");
	private CheckboxMenuItem view2 = new CheckboxMenuItem("���п�");
	
	private TextField tf = new TextField();
	
	private Button bt[] = new Button[16];
	private String str[] = new String[]{"7","8","9","+","4","5","6","-","1","2","3","*","0","=","%","/"
	};
	
	private Panel panel = new Panel();
	
	private String buffer;
	
	public void menu(){
		this.setMenuBar(mb);
		mb.add(edit);
		edit.add(copy);
		edit.add(paste);
		edit.addSeparator();//���м�
		edit.add(exit);
		
		mb.add(view);
		view.add(view1);
		view.add(view2);
	}
	
	public void init(){
		this.setLayout(new BorderLayout());
		this.add(tf, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4,4));
		for(int i=0; i<bt.length; ++i){
			bt[i] = new Button(str[i]);
			panel.add(bt[i]);
		}
	}
	
	public void start(){
		//�������� �̺�Ʈ ������ ����� �޼ҵ�
		
		//X�� ������ â�� �ݰ� �ϰڴ�.(WindowEvent)
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
			});
		//�̺�Ʈ ���� ���
		//�������.add�̺�Ʈ����(ó����ü);
		
		//exit��� �޴��� �����ϸ� ���� ó���ϰڴ�.(����)
		exit.addActionListener(this);//1+2+3�ܰ�
		copy.addActionListener(this);
		
		//�ݺ������� bt�迭�� �ѹ��� �̺�Ʈ ����
		// -> bt[0]~bt[15]���� ActionEvent ���� �� ���� ó��
		for(int i=0; i<bt.length; ++i)
			bt[i].addActionListener(this);
	}
	
	public MyFrame_00(String title){
		super(title);

		this.menu();
		this.init();	
		this.start();//�̺�Ʈ ������ �޼ҵ�

		super.setSize(400,300);//ũ�� ����
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2-super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2-super.getHeight()/2);
		super.setLocation(xpos, ypos);
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ActionEvent�� �߻��ϸ� ������ �� �޼ҵ尡 ����ȴ�.
		//System.out.println(e);
		//e���� ���� �̱�
		//System.out.println(e.getSource());
		//System.out.println(e.getActionCommand());
		if(e.getSource()==exit){
			System.exit(0);
		}else if(e.getSource()==copy){
			System.out.println("�����ϱ� ����!");
		}
		
		//bt�迭�� ���� �̺�Ʈ �ϰ�ó��
		for(int i=0; i<bt.length; ++i){
			if(e.getSource()==bt[i]){//i�� ��ư�� ������
				//�ش� ���ڸ� tf�� ����� �ְڴ�.
				String imsi = tf.getText();
				String text = bt[i].getLabel();
				tf.setText(imsi+text);
				return;
			}
		}
	}
}

public class Quiz_02{
	public static void main(String[] ar){
		MyFrame_00 mf = new MyFrame_00("AWT ����");
	}
}








