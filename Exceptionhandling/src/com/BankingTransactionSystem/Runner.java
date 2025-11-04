package com.BankingTransactionSystem;

import java.util.Scanner;

public class Runner {
	 public static void main(String[] args) {
	     Transaction order = new Transaction();
	     Scanner sc = new Scanner(System.in);

	     try {
	    	 
	    	 System.out.println("Enter the amount:");
	         int a = sc.nextInt();
	    	 order.processTransaction(a);
	     } 
	     catch (InsufficientFundsException e) {
	         System.out.println("Error: " + e.getMessage());
	     } 
	     catch (NegativeAmountException e) {
	    	 System.out.println("Error: " + e.getMessage());
	     }
	     catch(NetworkFailureException e) {
	    	 System.out.println("Error: " + e.getMessage());
         }finally {
        	 System.out.println("Thank you for shopping with us!");
         }
	    sc.close();
	 }
	}
