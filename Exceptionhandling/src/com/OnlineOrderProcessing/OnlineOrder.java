package com.OnlineOrderProcessing;

import java.util.Random;

public class OnlineOrder {
	 public void placeOrder() throws OutOfStockException, PaymentFailedException {
	     Random r = new Random();
	     int result = r.nextInt(3);
	     switch(result){
	       case 0:
	    	   throw new OutOfStockException("The product is out of stock!");
		case 1:
	    	   throw new PaymentFailedException("Payment processing failed!");
		default:   
	    	 System.out.println("Order placed successfully!");
	     }
	 }

}
