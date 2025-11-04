package com.TemperatureConversionTool;

import java.util.Scanner;

public class Runner {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	     try {
	         System.out.print("Enter temperature value: ");
	         double temp = sc.nextDouble();

	         System.out.print("Enter unit (C/F): ");
	         char unit = sc.next().charAt(0);

	         double result = TemperatureConverter.convert(temp, unit);

	         if (!Double.isNaN(result)) {
	             if (unit == 'C' || unit == 'c')
	                 System.out.println("Converted Temperature: " + result + "°F");
	             else
	                 System.out.println("Converted Temperature: " + result + "°C");
	         }
	     }
	     catch (InvalidTemperatureException e) {
	         System.out.println("Error: " + e.getMessage());
	     }
	     catch (Exception e) {
	         System.out.println("Invalid input! Please enter a numeric value.");
	     }
	     finally {
	         sc.close();
	         System.out.println("Conversion process completed.");
	     }
	 }
	}