package com.ATMWithdrawalSystem;

import java.util.Scanner;


public class Runner {
	public static void main(String[] args) {
		ATM atm = new ATM(10000); 
		Scanner sc = new Scanner(System.in);

        try {
        	System.out.println("Enter withdrawal amount: ");
        	int a = sc.nextInt();        	
            atm.withdraw(a); 
        } catch (InsufficientFundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }finally {
        System.out.println("\nTransaction complete.");
        }        
        sc.close();
	}
}