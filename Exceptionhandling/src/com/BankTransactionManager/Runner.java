package com.BankTransactionManager;

import java.util.Scanner;

public class Runner {
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