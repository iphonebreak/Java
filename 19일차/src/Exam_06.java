//기본자료형 저장형식
import java.io.*;
public class Exam_06 {
	public static void main(String[] ar) throws IOException{
		//파일의 객체생성
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차"); //폴더
		File file = new File(dir, "aaa.txt");
	
		//입출력 진행
		FileOutputStream fos = new FileOutputStream(file);	//대상
		BufferedOutputStream bos = new BufferedOutputStream(fos);	//통로
		DataOutputStream dos = new DataOutputStream(bos);	//버퍼명
		
		//dos를 시켜 전송할건데 ... 형태가 제각각이므로 형태까지 지정
		dos.writeInt(10);
		dos.writeDouble(3.141592);
		dos.writeChar('T');
		dos.writeByte(65);
		
		dos.close();
	}
}