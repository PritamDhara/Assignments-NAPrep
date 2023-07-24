package assignments;

import java.util.Scanner;

public class IncomeTaxCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your CTC to calculate");
		
		double ctc = sc.nextDouble();
		
		
		if(ctc<0)
		{
			System.out.println("Please enter a positive value");
		}
		else if(ctc>0&&ctc<=180000)
		{
			System.out.println("You Don't have to pay any tax - income tax(0%) "+ 0);
		}
		else if(ctc>=181001 && ctc<=300000)
		{
			System.out.println("Your Income Tax amount is (10%) "+(ctc*0.1));
		}else if(ctc>=300001 && ctc<=500000)
		{
			System.out.println("Your Income Tax amount is (20%) "+(ctc*0.2));
		}
		else if(ctc>=500001 && ctc<=1000000)
		{
			System.out.println("Your Income Tax amount is (30%) "+(ctc*0.3));
		}
		else {
			System.out.println("You have entered a ctc greater than 1000000 that cant be calculated");
		}
	}
}
