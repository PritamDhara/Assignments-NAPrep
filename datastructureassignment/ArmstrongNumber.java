package assignments;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num= sc.nextInt();
		
		int res=0;
		int copy=num;
		
		while(copy!=0)
		{
			int temp=copy%10;
			 res= res+(temp*temp*temp);
			 copy=copy/10;
		}
		
		if(res==num)
		{
			System.out.println("The Number is Armstrong");
		}else {
			System.out.println("This is not an Armstrong number");
		}
	}

}
