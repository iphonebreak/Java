import java.io.*;
public class Exam_08{
	public static void main(String[] ar) throws IOException{
		//파일의 객체생성
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차"); //폴더
		File file = new File(dir, "aaa.txt");
	
		//입출력 진행
		FileOutputStream fos = new FileOutputStream(file);//대상
		BufferedOutputStream bos = new BufferedOutputStream(fos);//통로명
		ObjectOutputStream oos = new ObjectOutputStream(bos);//버퍼명

		//oos에게 객체를 전해주며 저장해달라고 요청
		Store store = new Store();
		oos.writeObject(store);
		oos.close();
		
		
	}
}
