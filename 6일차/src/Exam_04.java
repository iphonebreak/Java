//sort (����)
//���Ŀ��� �������� �ִ�. (�������� : asc, �������� : desc)
//1,2,3,4,5 ������ ��µǸ�  �������� 
//5,4,3,2,1 ������ ��µǸ�  ��������
public class Exam_04 {
	public static void main(String [] ar)
	{
		int arr[]=new int [] {5,7,2,9,1};
		//�������� ���� ���� �ϸ� 1,2,5,7,9
		//�������� ���� ���� �ϸ� 9,7,5,2,1
		
		//����
		for(int i=0; i<=arr.length-1; ++i)
		{
			for(int j=i+1; j<arr.length; ++j)
			{
				if(arr[i]>arr[j])
				{
					//����� ������ ������
					//���ιٲ۴�.
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			
		}
		//���
		for(int i=0; i<arr.length; ++i)
		{
			System.out.println(arr[i]+"\t");
		}
		
		
	}
}
