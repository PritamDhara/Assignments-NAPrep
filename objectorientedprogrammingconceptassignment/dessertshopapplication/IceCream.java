package objectorientedprogrammingconceptassignment.dessertshopapplication;

public class IceCream extends DessertItem{

	double price=100;
	
	
	
	public IceCream() {
		
	}


	public IceCream(double price) {
		
		this.price = price;
	}


	@Override
	public double getCost() {
		return price;
		
	}


	@Override
	public String toString() {
		return "IceCream [price(Rs)=" + price + "]";
	}

	
}
