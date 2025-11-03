package exception_handling;

import java.util.*;

class AccountNotFoundException extends Exception {
 public AccountNotFoundException(String message) {
     super(message);
 }
}

class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

class BankTransaction {
 Random rand = new Random();

public void verifyAccount(String accountNumber) throws AccountNotFoundException {
     if (rand.nextBoolean()) {
         throw new AccountNotFoundException("Account " + accountNumber + " not found!");
     }
     System.out.println("Account " + accountNumber + " verified successfully.");
 }

public void processTransaction(double amount) throws InsufficientFundsException {
     if (rand.nextBoolean()) {
         throw new InsufficientFundsException("Insufficient funds for transaction of ₹" + amount);
     }
     System.out.println("Transaction of ₹" + amount + " processed successfully.");
 }

 public void executeTransaction(String accountNumber, double amount) throws Exception {
     verifyAccount(accountNumber);
     processTransaction(amount);
     System.out.println("Transaction completed successfully!");
 }
}

public class BankTransctionManager {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     BankTransaction bt = new BankTransaction();

     try {
         System.out.print("Enter account number: ");
         String accountNumber = sc.nextLine();

         System.out.print("Enter amount to transfer: ");
         double amount = sc.nextDouble();

         bt.executeTransaction(accountNumber, amount);
     } 
     catch (AccountNotFoundException e) {
         System.out.println(e.getMessage());
     } 
     catch (InsufficientFundsException e) {
         System.out.println(e.getMessage());
     } 
     catch (Exception e) {
         System.out.println("Unexpected error: " + e.getMessage());
     } 
     finally {
         System.out.println("Transaction complete.");
         sc.close();
     }
 }
}
