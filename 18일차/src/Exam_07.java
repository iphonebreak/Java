//JFileChooser : 파일을 관리하는 편리한 창
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class MyFrame_07 extends JFrame implements ActionListener{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	private Container con;
	
	private JFileChooser jfc = new JFileChooser(".");//("초기경로");
	
	private JButton open = new JButton("파일 열기");
	private JButton save = new JButton("파일 저장");
	
	public void init(){
		//화면 구성 요소 배치
		con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(open);
		con.add(save);
	}
	public void start(){
		//이벤트 등록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료상태값
		open.addActionListener(this);
		save.addActionListener(this);
	}
	public MyFrame_07(String title){
		super(title);//제목 설정
		this.init();
		this.start();//이벤트 설정 메소드
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
		if(e.getSource()==open){//파일 열기
			int a=jfc.showOpenDialog(this); //부모
			System.out.println("a="+a);
		}else if(e.getSource()==save){//파일 저장
			int a=jfc.showSaveDialog(this);
			System.out.println("a="+a);
		}
	}
}

public class Exam_07 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_07 mf = new MyFrame_07("AWT 실습!");
	}
}







