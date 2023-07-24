package assignments;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		sortArray(arr);
		
		
	}
	
	public static void sortArray(int arr[])
	{
		System.out.println("Before Sorting the array");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("After Sorting the Array");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
