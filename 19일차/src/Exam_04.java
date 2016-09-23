import java.io.*;
public class Exam_04 {
	public static void main(String[] ar) throws IOException{
		//파일의 객체생성
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차"); //폴더
		File file = new File(dir, "aaa.txt");
		
		//입출력진행
		
		//통로
		FileWriter fw = new FileWriter(file);	//(대상)
		
		//버퍼 : 임시저장소
		BufferedWriter bw = new BufferedWriter(fw);	//(통로명)
		
		//분해 , 조립객체
		PrintWriter pw = new PrintWriter(bw); 	//(버퍼명)
		
		//문제
		//사용자에게 "꺼져버려"라는 메세지를 입력받기전까지 
		//입력받은 메세지를 반복하여 저장
		while(true){
			System.out.print("입력 : ");
			String text = sc.nextLine();
			if(text.equals("꺼져버려")) break;
			pw.println(text);
			pw.flush();
			
		//pw에게 문장단위로 전달
		pw.println("메모장의 원리!");
		pw.println("어때요 참 쉽죠잉?");
		pw.println(30);									//문장으로 변환되어 저장
	
		//데이터 전송 방법
		//전송 : flush();
		//전송 + 통로폐기 : close();
		pw.close();
	}
}
