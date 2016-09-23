//JOptionPane : 새 창을 관리하는 클래스
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
class MyFrame_08 extends JFrame implements ActionListener{
	//추가하고 싶은 구성요소(컴포넌트)를 멤버필드에 정의
	private Container con;
	
	private JButton bt1 = new JButton("알림창");
	private JButton bt2 = new JButton("확인창");
	private JButton bt3 = new JButton("입력창");
	
	public void init(){
		//화면 구성 요소 배치
		con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(bt1);
		con.add(bt2);
		con.add(bt3);
	}
	public void start(){
		//이벤트 등록
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료상태값
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
	}
	public MyFrame_08(String title){
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
		if(e.getSource()==bt1){//알림창
			JOptionPane.showMessageDialog(this, 
				"메롱메롱", "알림창", JOptionPane.ERROR_MESSAGE);
														//(부모, "메세지", "제목", 그림값);
		}else if(e.getSource()==bt2){//확인창
			int a = JOptionPane.showConfirmDialog(this,"정말 퇴근?", "퇴근확인", JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE);
								//(부모, "메세지", "창제목", 버튼유형, 그림값);
			if(a==0){
				System.out.println("퇴근완료!");
			}
		}else if(e.getSource()==bt3){//입력창
			String text = JOptionPane.showInputDialog("이름은?");	//부모, "메세지", "창제목", 그림값)
			System.out.println(text);
			
			if(text!=null){
				JOptionPane.showMessageDialog(this,"이름 : "+text);
			}
		}
	}
}

public class Exam_08 {
	public static void main(String[] ar){
		//Frame f1 = new Frame("하하하");
		MyFrame_08 mf = new MyFrame_08("AWT 실습!");
	}
}

