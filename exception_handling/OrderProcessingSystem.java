package exception_handling;

import java.util.Random;

class OutOfStockException extends Exception {
 public OutOfStockException(String message) {
     super(message);
 }
}


class PaymentFailedException extends Exception {
 public PaymentFailedException(String message) {
     super(message);
 }
}

class OnlineOrder {
 public void placeOrder() throws OutOfStockException, PaymentFailedException {
     Random r = new Random();
     int result = r.nextInt(3);

     if (result == 0) {
         throw new OutOfStockException("The product is out of stock!");
     } else if (result == 1) {
         throw new PaymentFailedException("Payment processing failed!");
     } else {
         System.out.println("Order placed successfully!");
     }
 }
}

public class OrderProcessingSystem {
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
