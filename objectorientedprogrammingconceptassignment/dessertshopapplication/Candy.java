package objectorientedprogrammingconceptassignment.dessertshopapplication;

public class Candy extends DessertItem{
	
	double price=5*60;
	
	

	public Candy() {
		
	}



	public Candy(double price) {
	
		this.price = price*60;
	}



	@Override
	public double getCost() {
	return price;
		
	}



	@Override
	public String toString() {
		return "Candy [price(Rs)=" + price + "]";
	}
	
	

}
