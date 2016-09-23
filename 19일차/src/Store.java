//직렬화 : 객체가 stream을 통과할 수 있도록 정렬해줌
import java.io.*;
public class Store implements Serializable {
	//관리할 항목을 멤버필드로 정의
	double sogogi = 5.2;
	int kimchi = 4;
	transient int lighter = 3000;	//관리는 하되 저장하지 않겠다.
}
