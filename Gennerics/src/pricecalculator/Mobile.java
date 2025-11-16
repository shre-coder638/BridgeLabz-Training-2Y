package pricecalculator;

public class Mobile extends Product {
	 String model;

	 Mobile(String model, double price) {
	     super(price);
	     this.model = model;
	 }

	 public String toString() {
	     return "Mobile: " + model + " | Price: " + price;
	 }
}