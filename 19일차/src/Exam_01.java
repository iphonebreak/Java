import java.io.*;
//java.io.File -> 폴더 + 파일명
public class Exam_01 {
	public static void main(String[] ar){
		//폴더경로
		String path = "D:"+File.separator+"JAVA7시"+File.separator+"workspace"+File.separator+"Day19";
		// \ (폴더 구별자) -  (윈도우) \  , (리눅스,유닉스) /
		// ; (경로 구별자) -  (윈도우) ;  , (리눅스,유닉스) :
				
		//File 클래스의 객체 생성
		File f1 = new File("D:\\java평일 비둘기\\workspace\\19일차\\aaa.txt");
		File f2 = new File("D:\\java평일 비둘기\\workspace\\19일차","aaa.txt");
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차"); //폴더
		File file = new File(dir, "aaa.txt");
		
		//파일객체를 가지고 어쩌구저쩌구~~~`
		try{
			//파일 생성 : createNewFile() -> 성공/실패
			if(file.createNewFile()){//성공
				System.out.println("aaa.txt 파일 생성");
			}else{//실패
				System.out.println("aaa.txt 파일 이미 생성되있음");
			}
			//파일 삭제 : delete() -> 성공/실패
			if(file.delete()){
				System.out.println("aaa.txt 삭제");
			}else{
				System.out.println("aaa.txt 없음");
			}
			
			File imsi = File.createTempFile("temp",".hib",dir);//("접두사","접미사",경로)
			Thread.sleep(5000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	

}
