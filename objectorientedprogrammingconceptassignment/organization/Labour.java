package objectorientedprogrammingconceptassignment.organization;

public class Labour extends Employee{

	private double overTime;
	
	public Labour(int empId, String empName, int empAge, double salary,double overTime) {
		super(empId, empName, empAge, salary);
		this.overTime=overTime;
	}

	public double getOverTime() {
		return overTime;
	}

	public void setOverTime(double overTime) {
		this.overTime = overTime;
	}

	@Override
	public void getTotalSalary()
	{
		System.out.println("The Total salary of a Labour is :-  "+(super.getSalary()+overTime));
	}
	
	@Override
	public String toString() {
		return super.toString()+"overTime=" + overTime;
	}
	
	

	
	

}
