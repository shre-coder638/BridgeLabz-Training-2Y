package com.ExceptionPropagation;

import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	     try {
	         System.out.print("Enter file name to open: ");
	         String fileName = sc.nextLine();

	         FileHandler fh = new FileHandler(fileName);
	     } 
	     catch (FileMissingException e) {
	         System.out.println("Error: " + e.getMessage());
	     } 
	     finally {
	         System.out.println("File operation complete.");
	         sc.close();
	     }
	 }
}
