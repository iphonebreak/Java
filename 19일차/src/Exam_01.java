import java.io.*;
//java.io.File -> ���� + ���ϸ�
public class Exam_01 {
	public static void main(String[] ar){
		//�������
		String path = "D:"+File.separator+"JAVA7��"+File.separator+"workspace"+File.separator+"Day19";
		// \ (���� ������) -  (������) \  , (������,���н�) /
		// ; (��� ������) -  (������) ;  , (������,���н�) :
				
		//File Ŭ������ ��ü ����
		File f1 = new File("D:\\java���� ��ѱ�\\workspace\\19����\\aaa.txt");
		File f2 = new File("D:\\java���� ��ѱ�\\workspace\\19����","aaa.txt");
		File dir = new File("D:\\java���� ��ѱ�\\workspace\\19����"); //����
		File file = new File(dir, "aaa.txt");
		
		//���ϰ�ü�� ������ ��¼����¼��~~~`
		try{
			//���� ���� : createNewFile() -> ����/����
			if(file.createNewFile()){//����
				System.out.println("aaa.txt ���� ����");
			}else{//����
				System.out.println("aaa.txt ���� �̹� ����������");
			}
			//���� ���� : delete() -> ����/����
			if(file.delete()){
				System.out.println("aaa.txt ����");
			}else{
				System.out.println("aaa.txt ����");
			}
			
			File imsi = File.createTempFile("temp",".hib",dir);//("���λ�","���̻�",���)
			Thread.sleep(5000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
