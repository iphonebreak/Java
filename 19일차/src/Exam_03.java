
import java.io.*;
public class Exam_03 {
	public static void main(String[] ar) throws IOException{
		//파일의 객체 생성
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차"); //폴더
		File file = new File(dir, "aaa.txt");
		
		//입출력 진행
		FileInputStream fis = new FileInputStream(file); //(대상)
		
		while(true){
			int in = fis.read(); //ASCII 코드값
			if(in==-1)       		//EOF(End of File)
			System.out.println((char)in);
		}
	}
}
