package objectorientedprogrammingconceptassignment.persistance;

public class PersistenceMain {
	public static void main(String[] args) {
		
		Persistence per= getPersistence();
		
		per.persist();
	}
	
	public static Persistence getPersistence() {
		
		return new DataBasePersistence();
	}

}
