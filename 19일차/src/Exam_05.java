//�����Է�
import java.io.*;
public class Exam_05 {
	public static void main(String[] ar) throws IOException{
		//������ ��ü����
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����"); //����
		File file = new File(dir, "aaa.txt");

		//��λ���
		FileReader fr = new FileReader(file);	//���
		
		//���ۻ���
		BufferedReader br = new BufferedReader(fr);
		
		//���ѹݺ����� ���پ� �Է¹ޱ�
		while (true){
			String text = br.readLine();
			if(text==null) break;	//EOF == null
			System.out.println(text);
		}
	}
}

