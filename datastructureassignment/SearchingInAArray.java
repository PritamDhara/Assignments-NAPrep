package assignments;

import java.util.Scanner;

public class SearchingInAArray {
	public static void main(String[] args) {
		
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to search");
		int numToBeSearch= sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==numToBeSearch)
			{
				System.out.println(numToBeSearch+" is present in this array in the "+(i+1)+" position");
				break;
			}
		}
		
		
	}

}
