package objectorientedprogrammingconceptassignment.bankingapplication;

public class Account {

	private String accountNo;
	private String accountHolderName;
	private double balance;
	public Account(String accountNo, String accountHolderName, double balance) {
		
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public double getTotalCash()
	{
		System.out.println("The Balance is "+balance);
		return balance;
	}
	
	public static void totalBalanceInBank(double[] arr)
	{
		double totalBankBalance=0;
		for(double d:arr)
		{
			totalBankBalance+=d;
		}
		
		System.out.println("The Total Bank Balance is "+totalBankBalance);
		
	}
	
	
	
}
