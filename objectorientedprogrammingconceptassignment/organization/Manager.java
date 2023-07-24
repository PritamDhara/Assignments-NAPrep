package objectorientedprogrammingconceptassignment.organization;

public class Manager extends Employee{
	
	private double incentive;

	public Manager(int empId, String empName, int empAge, double salary,double incentive) {
		super(empId, empName, empAge, salary);
		this.incentive=incentive;
	}
	
	
	
	public double getIncentive() {
		return incentive;
	}



	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}



	@Override
	public void getTotalSalary()
	{
		System.out.println("The Total salary of a Manager is :-  "+(super.getSalary()+incentive));
	}



	@Override
	public String toString() {
		return "Manager [" + super.toString()+" Incentive=" + incentive + "]";
	}

	
	
}
