package objectorientedprogrammingconceptassignment.bankingapplication;

public class AccountMain {
	public static void main(String[] args) {
		
		SavingsAccount a1 = new SavingsAccount("5556p", "Pritam Dhara", 25000, 10000);
		CurrentAccount a2= new CurrentAccount("5557p", "Rakesh Sharma", 75000, 15000);
		
		double[] arr = new double[10];
		
		arr[0]=a1.getTotalCash();
		arr[1]=a2.getTotalCash();
		
		Account.totalBalanceInBank(arr);
		
	}

}
