package onlinefoodddeliverysystem;

import java.util.ArrayList;

public class Main {

public static void processOrder(ArrayList<FoodItem> items) {
     System.out.println("\n=== ORDER SUMMARY ===");

     for (FoodItem item : items) {
         item.getItemDetails();

         double totalPrice = item.calculateTotalPrice();
         double discountedPrice = totalPrice;
         String discountInfo = "No discount applied";

         if (item instanceof VegItem) {
             Discountable discount = new VegDiscount();
             discountedPrice = discount.applyDiscount(totalPrice);
             discountInfo = discount.getDiscountDetails();
         } else if (item instanceof NonVegItem) {
             Discountable discount = new NonVegDiscount();
             discountedPrice = discount.applyDiscount(totalPrice);
             discountInfo = discount.getDiscountDetails();
         }

         System.out.println("Total Price (before discount): " + totalPrice);
         System.out.println(discountInfo);
         System.out.println("Final Price (after discount): " + discountedPrice);

     }
 }

 public static void main(String[] args) {
     ArrayList<FoodItem> orderList = new ArrayList<>();

     VegItem veg1 = new VegItem("Paneer Butter Masala", 180, 2);
     NonVegItem nonveg1 = new NonVegItem("Chicken Biryani", 250, 1);
     VegItem veg2 = new VegItem("Veg Burger", 120, 3);

     orderList.add(veg1);
     orderList.add(nonveg1);
     orderList.add(veg2);

 
     processOrder(orderList);
 }
}
