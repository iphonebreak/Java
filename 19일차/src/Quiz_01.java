import java.awt.*;
import java.awt.event.*;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;
class MyFrame_001 extends JFrame implements ActionListener{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	private Container con;
	private JFileChooser jfc = new JFileChooser(".");
	
	FileOutputStream fos = new FileOutputStream(file);//대상
	BufferedOutputStream bos = new BufferedOutputStream(fos);//통로명
	ObjectOutputStream oos = new ObjectOutputStream(bos);//버퍼명
	
	private MenuBar mb = new MenuBar();
	private Menu menu = new Menu("메뉴");
	
	private MenuItem open = new MenuItem("열기");
	private MenuItem save = new MenuItem("저장");
	private MenuItem exit = new MenuItem("끝내기");
	
	
	
	public void init(){
		//화면 구성 요소 배치
		con = this.getContentPane();
		this.setMenuBar(mb);
		mb.add(menu); menu.add(open); menu.add(save); menu.addSeparator(); menu.add(exit);
	}
	public void start(){
		//이벤트 등록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //종료상태값
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
	}
	
	public MyFrame_001(String title){
		super(title);//제목 설정
		this.init();
		this.start();
		super.setSize(400, 300);//크기 설정
		//화면 중앙에 배치
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - super.getHeight()/2);
		super.setLocation(xpos, ypos);//위치 설정
		super.setResizable(false);//크기 변경 불가
		super.setVisible(true);//보여주도록 설정		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==open){
			jfc.showOpenDialog(this);
		}else if(e.getSource()==save){
			jfc.showSaveDialog(this);
		}else if(e.getSource()==exit){
			System.exit(0);
		}
		
	}
}
public class Quiz_01 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_001 mf = new MyFrame_001("AWT 실습!");
	}
}