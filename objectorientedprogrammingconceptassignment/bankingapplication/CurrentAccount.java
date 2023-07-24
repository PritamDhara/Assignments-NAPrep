package objectorientedprogrammingconceptassignment.bankingapplication;

public class CurrentAccount extends Account{

	private double cashCredit;
	
	public CurrentAccount(String accountNo, String accountHolderName, double balance,double cashCredit) {
		super(accountNo, accountHolderName, balance);
		this.cashCredit=cashCredit;
		
	}

	public double getCashCredit() {
		return cashCredit;
	}

	public void setCashCredit(double cashCredit) {
		this.cashCredit = cashCredit;
	}
	
	@Override
	public double getTotalCash()
	{
		System.out.println("The Balance is "+(super.getBalance()+cashCredit));
		return (super.getBalance()+cashCredit);
	}

}
