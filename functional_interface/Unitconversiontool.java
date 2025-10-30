package functional_interface;
import java.util.Scanner;



interface UnitConversion {

 static double kmToMiles(double km) {
     return km * 0.621371;
 }


 static double milesToKm(double miles) {
     return miles * 1.60934;
 }

 static double kgToLbs(double kg) {
     return kg * 2.20462;
 }

 static double lbsToKg(double lbs) {
     return lbs * 0.453592; 
 }
}

//Step 2: Main class to use the static methods
public class Unitconversiontool {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int choice;
     double input;

     do {
         System.out.println("\n=== UNIT CONVERSION TOOL ===");
         System.out.println("1. Kilometers to Miles");
         System.out.println("2. Miles to Kilometers");
         System.out.println("3. Kilograms to Pounds");
         System.out.println("4. Pounds to Kilograms");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter distance in kilometers: ");
                 input = sc.nextDouble();
                 System.out.println("= " + UnitConversion.kmToMiles(input) + " miles");
                 break;

             case 2:
                 System.out.print("Enter distance in miles: ");
                 input = sc.nextDouble();
                 System.out.println("= " + UnitConversion.milesToKm(input) + " kilometers");
                 break;

             case 3:
                 System.out.print("Enter weight in kilograms: ");
                 input = sc.nextDouble();
                 System.out.println("= " + UnitConversion.kgToLbs(input) + " pounds");
                 break;

             case 4:
                 System.out.print("Enter weight in pounds: ");
                 input = sc.nextDouble();
                 System.out.println("= " + UnitConversion.lbsToKg(input) + " kilograms");
                 break;

             case 5:
                 System.out.println("Exiting Unit Conversion Tool. Goodbye!");
                 break;

             default:
                 System.out.println("Invalid choice. Please try again.");
         }

     } while (choice != 5);

     sc.close();
 }
}
