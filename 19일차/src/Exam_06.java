//�⺻�ڷ��� ��������
import java.io.*;
public class Exam_06 {
	public static void main(String[] ar) throws IOException{
		//������ ��ü����
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����"); //����
		File file = new File(dir, "aaa.txt");
	
		//����� ����
		FileOutputStream fos = new FileOutputStream(file);	//���
		BufferedOutputStream bos = new BufferedOutputStream(fos);	//���
		DataOutputStream dos = new DataOutputStream(bos);	//���۸�
		
		//dos�� ���� �����Ұǵ� ... ���°� �������̹Ƿ� ���±��� ����
		dos.writeInt(10);
		dos.writeDouble(3.141592);
		dos.writeChar('T');
		dos.writeByte(65);
		
		dos.close();
	}
}