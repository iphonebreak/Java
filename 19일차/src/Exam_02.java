//byte������ �����
import java.io.*;
public class Exam_02 {
	public static void main(String[] ar) throws IOException{
		//������ ��ü����
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����"); //����
		File file = new File(dir, "aaa.txt");
		
		//����� ����
		
		//��λ���(~~~Stream)
		FileOutputStream fos = new FileOutputStream(file, false);  //(���ü , ������(�̾��))
		
		//byte ������ ������ ���� (-128~127)
		fos.write(65);
		fos.write('B');
		byte[] by = new byte[] {'H','e','l','l','o',' ','J','A','V','A','!'};
		
		fos.write(by);
		fos.write('\t');
		fos.write(by, 6, 4);
		fos.write('\n');
	}
}
