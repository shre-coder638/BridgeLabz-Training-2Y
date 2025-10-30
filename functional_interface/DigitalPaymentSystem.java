package functional_interface;

import java.util.Scanner;

interface Payment {
 void pay(double amount);
}

class UPI implements Payment {
 public void pay(double amount) {
     System.out.println("Paid rupees" + amount + " using UPI.");
 }
}


class CreditCard implements Payment {
 public void pay(double amount) {
     System.out.println("Paid rupees" + amount + " using Credit Card.");
 }
}


class Wallet implements Payment {
 public void pay(double amount) {
     System.out.println("Paid rupees" + amount + " using Wallet balance.");
 }
}


public class DigitalPaymentSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Payment upi = new UPI();
     Payment card = new CreditCard();
     Payment wallet = new Wallet();

     int choice;
     double amount;

     do {
         System.out.println("\n=== DIGITAL PAYMENT INTERFACE ===");
         System.out.println("1. Pay using UPI");
         System.out.println("2. Pay using Credit Card");
         System.out.println("3. Pay using Wallet");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter amount: ");
                 amount = sc.nextDouble();
                 upi.pay(amount);
                 break;
             case 2:
                 System.out.print("Enter amount: ");
                 amount = sc.nextDouble();
                 card.pay(amount);
                 break;
             case 3:
                 System.out.print("Enter amount: ");
                 amount = sc.nextDouble();
                 wallet.pay(amount);
                 break;
             case 4:
                 System.out.println("Transaction system closed. Thank you!");
                 break;
             default:
                 System.out.println("Invalid choice. Try again!");
         }
     } while (choice != 4);

     sc.close();
 }
}
