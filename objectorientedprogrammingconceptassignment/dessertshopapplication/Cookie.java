package objectorientedprogrammingconceptassignment.dessertshopapplication;

public class Cookie extends DessertItem{

	double price=3.5*70;

	public Cookie() {
		
	}



	public Cookie(double price) {
		
		this.price = price*70;
	}



	@Override
	public double getCost() {

		return price;
		
	}



	@Override
	public String toString() {
		return "Cookie [price(Rs)=" + price + "]";
	}
	
	

}
