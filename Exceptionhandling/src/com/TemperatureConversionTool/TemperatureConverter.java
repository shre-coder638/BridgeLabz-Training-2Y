package com.TemperatureConversionTool;

public class TemperatureConverter {

	 public static double convert(double temp, char unit) throws InvalidTemperatureException {
	     if (unit == 'C' || unit == 'c') {
	         if (temp < -273.15)
	             throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
	         return (temp * 9 / 5) + 32;  
	     } else if (unit == 'F' || unit == 'f') {
	         if (temp < -459.67)
	             throw new InvalidTemperatureException("Temperature below absolute zero is not possible!");
	         return (temp - 32) * 5 / 9;  
	     } else {
	         System.out.println("Invalid unit! Use C for Celsius or F for Fahrenheit.");
	         return Double.NaN;
	     }
	 }
	}