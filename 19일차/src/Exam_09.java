import java.io.*;
public class Exam_09 {
	public static void main(String[] ar) throws IOException{
		//������ ��ü ����
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����");//����
		File file = new File(dir, "ddd.txt");
		
		//����� ����
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		try{
			//���� Store ��������, Object�� ����Ǿ�����
			Store store = (Store)ois.readObject();//�ٿ�ĳ����
			System.out.println("�Ұ�� : " + store.sogogi+"kg");
			System.out.println("��ġ : " + store.kimchi+"����");
			System.out.println("������ : "+store.lighter+"��");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}


















