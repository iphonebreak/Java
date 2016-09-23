import java.io.*;
public class Exam_07{
	public static void main(String[] ar) throws IOException{
		//파일의 객체생성
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차"); //폴더
		File file = new File(dir, "aaa.txt");
		
		//입출력 진행
		FileInputStream fis = new FileInputStream(file);//대상
		BufferedInputStream bis = new BufferedInputStream(fis);//통로명
		DataInputStream dis = new DataInputStream(bis);//버퍼명
		
		//저장된 데이터가 제각각이므로 출력 순서대로 읽어와야 한다.
		int a = dis.readInt();
		double b = dis.readDouble();
		char c = dis.readChar();
		byte d = dis.readByte();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
