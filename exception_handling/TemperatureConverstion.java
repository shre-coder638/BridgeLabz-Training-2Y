package exception_handling;

import java.util.Scanner;

class InvalidTemperatureException extends Exception {
 public InvalidTemperatureException(String message) {
     super(message);
 }
}


class TemperatureConverter {

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

public class TemperatureConverstion {
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
