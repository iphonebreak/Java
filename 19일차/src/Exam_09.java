import java.io.*;
public class Exam_09 {
	public static void main(String[] ar) throws IOException{
		//파일의 객체 생성
		File dir = new File("D:\\java평일 비둘기\\workspace\\19일차");//폴더
		File file = new File(dir, "ddd.txt");
		
		//입출력 진행
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		try{
			//원래 Store 형태지만, Object로 저장되어있음
			Store store = (Store)ois.readObject();//다운캐스팅
			System.out.println("소고기 : " + store.sogogi+"kg");
			System.out.println("김치 : " + store.kimchi+"포대");
			System.out.println("라이터 : "+store.lighter+"개");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}


















