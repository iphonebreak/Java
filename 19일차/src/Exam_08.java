import java.io.*;
public class Exam_08{
	public static void main(String[] ar) throws IOException{
		//������ ��ü����
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����"); //����
		File file = new File(dir, "aaa.txt");
	
		//����� ����
		FileOutputStream fos = new FileOutputStream(file);//���
		BufferedOutputStream bos = new BufferedOutputStream(fos);//��θ�
		ObjectOutputStream oos = new ObjectOutputStream(bos);//���۸�

		//oos���� ��ü�� �����ָ� �����ش޶�� ��û
		Store store = new Store();
		oos.writeObject(store);
		oos.close();
		
		
	}
}
