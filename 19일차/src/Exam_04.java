import java.io.*;
public class Exam_04 {
	public static void main(String[] ar) throws IOException{
		//������ ��ü����
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����"); //����
		File file = new File(dir, "aaa.txt");
		
		//���������
		
		//���
		FileWriter fw = new FileWriter(file);	//(���)
		
		//���� : �ӽ������
		BufferedWriter bw = new BufferedWriter(fw);	//(��θ�)
		
		//���� , ������ü
		PrintWriter pw = new PrintWriter(bw); 	//(���۸�)
		
		//����
		//����ڿ��� "��������"��� �޼����� �Է¹ޱ������� 
		//�Է¹��� �޼����� �ݺ��Ͽ� ����
		while(true){
			System.out.print("�Է� : ");
			String text = sc.nextLine();
			if(text.equals("��������")) break;
			pw.println(text);
			pw.flush();
			
		//pw���� ��������� ����
		pw.println("�޸����� ����!");
		pw.println("��� �� ������?");
		pw.println(30);									//�������� ��ȯ�Ǿ� ����
	
		//������ ���� ���
		//���� : flush();
		//���� + ������ : close();
		pw.close();
	}
}
