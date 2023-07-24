package assignments;

import java.util.Scanner;

public class CompoundInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Deposit Amount");
		double deposit = sc.nextDouble();
		
		System.out.println("Enter the interest Rate");
		double interest= sc.nextDouble();
		
		System.out.println("Enter the Time in Years");
		double time = sc.nextDouble();
		
		System.out.println("Enter the Number of Times of interest compounded");
		int number = sc.nextInt();
		
		double compoundInterest = deposit * (Math.pow((1 + interest/100), (time * number))) - deposit;
		
		
		System.out.println("The Compound Interest is : "+compoundInterest);
		
	}

}
