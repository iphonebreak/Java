
import java.io.*;
public class Exam_03 {
	public static void main(String[] ar) throws IOException{
		//������ ��ü ����
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����"); //����
		File file = new File(dir, "aaa.txt");
		
		//����� ����
		FileInputStream fis = new FileInputStream(file); //(���)
		
		while(true){
			int in = fis.read(); //ASCII �ڵ尪
			if(in==-1)       		//EOF(End of File)
			System.out.println((char)in);
		}
	}
}
