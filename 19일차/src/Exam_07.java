import java.io.*;
public class Exam_07{
	public static void main(String[] ar) throws IOException{
		//������ ��ü����
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����"); //����
		File file = new File(dir, "aaa.txt");
		
		//����� ����
		FileInputStream fis = new FileInputStream(file);//���
		BufferedInputStream bis = new BufferedInputStream(fis);//��θ�
		DataInputStream dis = new DataInputStream(bis);//���۸�
		
		//����� �����Ͱ� �������̹Ƿ� ��� ������� �о�;� �Ѵ�.
		int a = dis.readInt();
		double b = dis.readDouble();
		char c = dis.readChar();
		byte d = dis.readByte();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
