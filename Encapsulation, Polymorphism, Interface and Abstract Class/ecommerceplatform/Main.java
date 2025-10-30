package ecommerceplatform;

import java.util.ArrayList;

public class Main {

public static void displayFinalPrice(ArrayList<Product> products) {
     System.out.println("\n=== Final Price Calculation ===");

     for (Product p : products) {
         p.displayDetails();

         double discount = p.calculateDiscount();
         double tax = 0;
         String taxDetails = "No tax applicable";

         if (p instanceof Electronics) {
             Taxable taxCalc = new ElectronicsTax();
             tax = taxCalc.calculateTax(p.getPrice());
             taxDetails = taxCalc.getTaxDetails();
         } else if (p instanceof Clothing) {
             Taxable taxCalc = new ClothingTax();
             tax = taxCalc.calculateTax(p.getPrice());
             taxDetails = taxCalc.getTaxDetails();
         }

         double finalPrice = p.getPrice() + tax - discount;

         System.out.println(taxDetails);
         System.out.println("Discount: " + discount);
         System.out.println("Tax: " + tax);
         System.out.println("Final Price: " + finalPrice);
     }
 }

 public static void main(String[] args) {
     ArrayList<Product> products = new ArrayList<>();

     Electronics e1 = new Electronics(301, "Laptop", 80000, 2);
     Clothing c1 = new Clothing(302, "Jacket", 4000, "M");
     Groceries g1 = new Groceries(303, "Milk", 60, 2);

     products.add(e1);
     products.add(c1);
     products.add(g1);

     displayFinalPrice(products);
 }
}
