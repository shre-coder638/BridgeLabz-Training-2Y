package com.OnlineOrderProcessing;

public class Runner {
	 public static void main(String[] args) {
	     OnlineOrder order = new OnlineOrder();

	     try {
	         order.placeOrder();
	     } 
	     catch (OutOfStockException e) {
	         System.out.println("Order Error: " + e.getMessage());
	     } 
	     catch (PaymentFailedException e) {
	         System.out.println("Order Error: " + e.getMessage());
	     }

	     System.out.println("Thank you for shopping with us!");
	 }

}
