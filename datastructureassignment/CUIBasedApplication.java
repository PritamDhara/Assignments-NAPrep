package assignments;

import java.util.Scanner;

public class CUIBasedApplication {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String userName = "";
		String password;
		
		
		int attempts=3;
		boolean loginflag=false;
		
		while(attempts!=0)
		{
			System.out.println("Enter Your UserName");
			userName = sc.nextLine();
			
			

			System.out.println("Enter Your Password");
			 password = sc.nextLine();
			
			if(userName.equals("Pritam Dhara") && password.equals("Pritam@123"))
			{
				loginflag=true;
				attempts=3;
				break;
			}else {
				attempts--;
				System.out.println("Wrong Credientials ----------- "+ attempts+ " more attempts left");
				
			}
			
		}
		
		if(loginflag)
		{
			System.out.println("Welcome  :  " +userName );
		}else {
			System.out.println("Contact Admin");

		}
	}

}
