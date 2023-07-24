package objectorientedprogrammingconceptassignment.bankingapplication;

public class SavingsAccount extends Account{
	
	private double fixedDiposit;
	public SavingsAccount(String accountNo, String accountHolderName, double balance,double fixedDiposit) {
		super(accountNo, accountHolderName, balance);
		this.fixedDiposit=fixedDiposit;
	}
	public double getFixedDiposit() {
		return fixedDiposit;
	}
	public void setFixedDiposit(double fixedDiposit) {
		this.fixedDiposit = fixedDiposit;
	}

	@Override
	public double getTotalCash()
	{
		System.out.println("The Balance is "+(super.getBalance()+fixedDiposit));
		return (super.getBalance()+fixedDiposit);
	}
	
	
	

}
