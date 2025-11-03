package exception_handling;


import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String message) {
        super(message);
    }
}

class Transaction {
    private int balance = 5000;

    public void processTransaction(int amount)
            throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {

        Random rand = new Random();
        int result = rand.nextInt(3); 

        if (amount < 0) {
            throw new NegativeAmountException("Transaction failed: Negative amount entered!");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Transaction failed: Insufficient balance!");
        } else if (result == 2) {
            throw new NetworkFailureException("Transaction failed: Network connection lost!");
        } else {
            balance -= amount;
            System.out.println("Transaction successful! Amount debited: ₹" + amount);
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}
public class BankingSystem {
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
