package com.BankingTransactionSystem;

import java.util.Random;

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
