package assignments;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Deposit Amount");
		double deposit = sc.nextDouble();
		
		System.out.println("Enter the interest Rate");
		double interest= sc.nextDouble();
		
		System.out.println("Enter the Time in Years");
		double time = sc.nextDouble();
		
		
		double simpleInterest = (deposit*interest*time) /100;
		
		System.out.println("The Simple Interest is : "+simpleInterest);
		
		sc.close();
		
	}

}
