//byte단위의 입출력
import java.io.*;
public class Exam_02 {
	public static void main(String[] ar) throws IOException{
		//파일의 객체생성
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차"); //폴더
		File file = new File(dir, "aaa.txt");
		
		//입출력 진행
		
		//통로생성(~~~Stream)
		FileOutputStream fos = new FileOutputStream(file, false);  //(대상객체 , 저장방식(이어쓰기))
		
		//byte 단위의 데이터 전송 (-128~127)
		fos.write(65);
		fos.write('B');
		byte[] by = new byte[] {'H','e','l','l','o',' ','J','A','V','A','!'};
		
		fos.write(by);
		fos.write('\t');
		fos.write(by, 6, 4);
		fos.write('\n');
	}
}
