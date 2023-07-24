package assignments;

import java.util.Scanner;

public class SubjectWiseAverage {
	
	public static void main(String[] args) {
		
		double[] marksOfSubA = new double[3];
		double[] marksOfSubB = new double[3];
		double[] marksOfSubC = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give the Input for sub A for all the students");
		for(int i=0;i<marksOfSubA.length;i++)
		{
			marksOfSubA[i]=sc.nextDouble();
		}
		
		System.out.println("Give the Input for sub B for all the students");
		for(int i=0;i<marksOfSubB.length;i++)
		{
			marksOfSubB[i]=sc.nextDouble();
		}
		
		System.out.println("Give the Input for sub C for all the students");
		for(int i=0;i<marksOfSubC.length;i++)
		{
			marksOfSubC[i]=sc.nextDouble();
		}
		
		
		double totalmarksOfSubA=0;
		double averageMarksOfSubA=0.0;
		
		for(int i=0;i<marksOfSubA.length;i++)
		{
			totalmarksOfSubA+=marksOfSubA[i];
		}
		
		System.out.println("The total marks of Subject A is : "+totalmarksOfSubA + " And The average marks is : "+(totalmarksOfSubA/marksOfSubA.length));
		
		
		double totalmarksOfSubB=0;
		double averageMarksOfSubB=0.0;
		
		for(int i=0;i<marksOfSubB.length;i++)
		{
			totalmarksOfSubB+=marksOfSubB[i];
		}
		
		System.out.println("The total marks of Subject A is : "+totalmarksOfSubB + " And The average marks is : "+(totalmarksOfSubB/marksOfSubB.length));
		
		
		double totalmarksOfSubC=0;
		double averageMarksOfSubC=0.0;
		
		for(int i=0;i<marksOfSubC.length;i++)
		{
			totalmarksOfSubC+=marksOfSubC[i];
		}
		
		System.out.println("The total marks of Subject A is : "+totalmarksOfSubC + " And The average marks is : "+(totalmarksOfSubC/marksOfSubC.length));
		
		
		
	}

}
