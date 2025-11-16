package pricecalculator;

import java.util.*;

public class PriceCalculator {

	public static double calculateTotal(List<? extends Product> items) {
	     double total = 0;
	     for (Product p : items) {
	         total += p.getPrice();
	     }
	     return total;
}
	
public static void main(String[] args) {

	     List<Mobile> mobiles = Arrays.asList(
	             new Mobile("iPhone 14", 90000),
	             new Mobile("Samsung S23", 75000)
	     );

	     List<Laptop> laptops = Arrays.asList(
	             new Laptop("Dell XPS", 120000),
	             new Laptop("MacBook Air", 110000)
	     );

	     System.out.println("Total Mobile Price: " + calculateTotal(mobiles));
	     System.out.println("Total Laptop Price: " + calculateTotal(laptops));
	 }
}