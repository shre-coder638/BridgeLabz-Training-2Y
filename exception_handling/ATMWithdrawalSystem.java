package exception_handling;
import java.util.*;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATM {
    private int balance;

    
    public ATM(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                "Withdrawal failed! You tried to withdraw ₹" + amount + 
                ", but your available balance is only ₹" + balance + "."
            );
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! You withdrew ₹" + amount);
            System.out.println("Remaining balance: ₹" + balance);
        }
    }
}


public class ATMWithdrawalSystem {
	public static void main(String[] args) {
		ATM atm = new ATM(10000); 
		Scanner sc = new Scanner(System.in);

        try {
        	System.out.println("Enter withdrawal ammount.");
        	int a = sc.nextInt();        	
            atm.withdraw(a); 
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("\nTransaction complete.");
				
	}
}
