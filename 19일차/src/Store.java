//����ȭ : ��ü�� stream�� ����� �� �ֵ��� ��������
import java.io.*;
public class Store implements Serializable {
	//������ �׸��� ����ʵ�� ����
	double sogogi = 5.2;
	int kimchi = 4;
	transient int lighter = 3000;	//������ �ϵ� �������� �ʰڴ�.
}
