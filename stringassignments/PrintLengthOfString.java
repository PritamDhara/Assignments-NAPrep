package stringassignments;

import java.util.Scanner;

public class PrintLengthOfString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your String Value");
		String str = sc.nextLine();
		
		System.out.println("The Length Of the String is : "+str.length());
	}

}
