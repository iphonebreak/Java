//sort (정렬)
//정렬에는 두종류가 있다. (오름차순 : asc, 내림차순 : desc)
//1,2,3,4,5 순으로 출력되면  오름차순 
//5,4,3,2,1 순으로 출력되면  내림차순
public class Exam_04 {
	public static void main(String [] ar)
	{
		int arr[]=new int [] {5,7,2,9,1};
		//오름차순 으로 정렬 하면 1,2,5,7,9
		//내림차순 으로 정렬 하면 9,7,5,2,1
		
		//정렬
		for(int i=0; i<=arr.length-1; ++i)
		{
			for(int j=i+1; j<arr.length; ++j)
			{
				if(arr[i]>arr[j])
				{
					//대상이 나보다 작으면
					//서로바꾼다.
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			
		}
		//출력
		for(int i=0; i<arr.length; ++i)
		{
			System.out.println(arr[i]+"\t");
		}
		
		
	}
}
