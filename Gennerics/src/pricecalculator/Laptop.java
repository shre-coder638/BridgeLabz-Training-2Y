package pricecalculator;

public class Laptop extends Product {
	 String brand;

	 Laptop(String brand, double price) {
	     super(price);
	     this.brand = brand;
	 }

	 public String toString() {
	     return "Laptop: " + brand + " | Price: " + price;
	 }
}