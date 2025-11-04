package com.LibraryManagementSystem;

import java.util.*;

public class Runner {
	public static void main(String[] args) {
	     Library lib = new Library();
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Choose:");
	     System.out.println("1. BookNotAvailableException/UserLimitExceededException");
	     System.out.println("2. InvalidReturnException");
	     int a =  sc.nextInt();
	     switch(a) {
	     case 1:
	    	 try {
		         lib.borrowBook("Java");
		         lib.borrowBook("Java"); 
		     } catch (BookNotAvailableException | UserLimitExceededException e) {
		         System.out.println("Error: " + e.getMessage());
		     }
	     case 2:

	     try {
	         lib.returnBook("PHP");
	     } catch (InvalidReturnException e) {
	         System.out.println("Error: " + e.getMessage());
	     }
	     }
	     sc.close();
	 }

}
