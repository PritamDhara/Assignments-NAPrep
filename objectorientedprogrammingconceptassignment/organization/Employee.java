package objectorientedprogrammingconceptassignment.organization;

public class Employee {
	
	private int empId;
	private String empName;
	private int empAge;
	private double salary;
	
	
	public Employee(int empId, String empName, int empAge, double salary) {
	
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.salary = salary;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void getTotalSalary()
	{
		System.out.println("The total Salary is : - "+this.salary);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", salary=" + salary + "]";
	}
	
	
	
	

}
