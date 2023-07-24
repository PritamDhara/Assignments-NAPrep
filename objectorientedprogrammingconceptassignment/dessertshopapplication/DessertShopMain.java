package objectorientedprogrammingconceptassignment.dessertshopapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DessertShopMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter Your Role(owner/customer): ");
		String role = sc.nextLine();

		List<DessertItem> listOfdessert = new ArrayList<>();
		List<DessertItem> listOfdessertAvailable = new ArrayList<>();
		listOfdessertAvailable.add(new Candy());
		listOfdessertAvailable.add(new Cookie());
		listOfdessertAvailable.add(new IceCream());
		
		
		
		List<DessertItem> listOfdessertOrdered = new ArrayList<>();
		
		

		if(role.equalsIgnoreCase("owner")) {
			boolean flag=false;

			while (true) {

				System.out.println("Press 1 to add Candy in desserts: ");
				System.out.println("Press 2 to add Cookie in desserts: ");
				System.out.println("Press 3 to add IceCream in desserts: ");
				System.out.println("Press 4 exit from here: ");

				int i = sc.nextInt();

				switch (i) {
				case 1: {
					listOfdessert.add(new Candy());
					break;
				}
				case 2: {
					listOfdessert.add(new Cookie());
					break;
				}
				case 3: {
					listOfdessert.add(new IceCream());
					break;
				}
				case 4:{
					flag=true;
					break;
				}
				default:{
					System.out.println("Wrong Choice");
				}
				
			
			}
				if(flag) break;
					
			}
				
		}
		
	boolean cflag=false;
		if(role.equalsIgnoreCase("customer"))
		{
			System.out.println("We have These Item Available");
			
			for(DessertItem d :listOfdessertAvailable)
			{
				System.out.println(d.toString());
			}
			
			
			while(true)
			{
				System.out.println("Press 1 to Order Candy: ");
				System.out.println("Press 2 to order Cookie: ");
				System.out.println("Press 3 to order IceCream: ");
				System.out.println("Press 4 exit from here: ");
				
				int i = sc.nextInt();
				switch(i) {
				case 1:{listOfdessertOrdered.add(new Candy());
						break;
				}
				case 2:{listOfdessertOrdered.add(new Cookie());
						break;
				}
				case 3:{listOfdessertOrdered.add(new IceCream());
						break;
				}
				case 4:
					{
						cflag=true;
						break;
					}
				default:{
					System.out.println("Wrong Choice");
				}
				
				
				}
				if(cflag) break;
			}
				
		}
		
		double totalCostOfTheOrder=0;
		
		for(DessertItem d:listOfdessertOrdered)
		{
			totalCostOfTheOrder+=d.getCost();
		}
		
		if(role.equalsIgnoreCase("customer"))
		System.out.println("The Total Cost of order is : "+totalCostOfTheOrder);
		else
		System.out.println("The List of Dessert is : "+listOfdessert);
	}

}
