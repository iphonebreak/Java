//문장입력
import java.io.*;
public class Exam_05 {
	public static void main(String[] ar) throws IOException{
		//파일의 객체생성
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차"); //폴더
		File file = new File(dir, "aaa.txt");

		//통로생성
		FileReader fr = new FileReader(file);	//대상
		
		//버퍼생성
		BufferedReader br = new BufferedReader(fr);
		
		//무한반복으로 한줄씩 입력받기
		while (true){
			String text = br.readLine();
			if(text==null) break;	//EOF == null
			System.out.println(text);
		}
	}
}

