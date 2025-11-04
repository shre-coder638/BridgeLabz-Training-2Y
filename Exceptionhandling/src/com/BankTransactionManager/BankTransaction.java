package com.BankTransactionManager;

import java.util.Random;



public class BankTransaction {
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