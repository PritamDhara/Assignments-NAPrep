package objectorientedprogrammingconceptassignment.organization;

public class OrganizationMain {
	
	public static void main(String[] args) {
		Employee e1 = new Manager(1, "Pritam Dhara", 50, 27000, 5354.50);
		Employee e2 = new Labour(2, "Aniruddh Barman", 55, 21000, 3241.50);
		Employee e3 = new Manager(3, "Debnath Sarkar", 60, 98000, 10054.75);
		
		e1.getTotalSalary();
		e2.getTotalSalary();
		System.out.println(e3.toString());
		
	}
	

}
