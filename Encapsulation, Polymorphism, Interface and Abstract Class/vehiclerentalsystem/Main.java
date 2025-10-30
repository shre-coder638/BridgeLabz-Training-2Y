package vehiclerentalsystem;

import java.util.ArrayList;

public class Main {

 public static void displayRentalSummary(ArrayList<Vehicle> vehicles) {
     System.out.println("\n=== Vehicle Rental Summary ===");

     for (Vehicle v : vehicles) {
         v.displayDetails();

         int days = 5; 
         double rentalCost = v.calculateRentalCost(days);
         double insuranceCost = 0;
         String insuranceDetails = "No insurance details";


         if (v instanceof Car) {
             Insurable ins = new CarInsurance("CAR-INS-123");
             insuranceCost = ins.calculateInsurance(v.getRentalRate());
             insuranceDetails = ins.getInsuranceDetails();
         } else if (v instanceof Bike) {
             Insurable ins = new BikeInsurance("BIKE-INS-456");
             insuranceCost = ins.calculateInsurance(v.getRentalRate());
             insuranceDetails = ins.getInsuranceDetails();
         } else if (v instanceof Truck) {
             Insurable ins = new TruckInsurance("TRUCK-INS-789");
             insuranceCost = ins.calculateInsurance(v.getRentalRate());
             insuranceDetails = ins.getInsuranceDetails();
         }

         System.out.println("Days Rented: " + days);
         System.out.println("Rental Cost: " + rentalCost);
         System.out.println("Insurance Cost: " + insuranceCost);
         System.out.println(insuranceDetails);
         System.out.println("Total Cost: " + (rentalCost + insuranceCost));
     }
 }

 public static void main(String[] args) {
     ArrayList<Vehicle> vehicles = new ArrayList<>();

     Car c1 = new Car("CAR123", 2000, 5);
     Bike b1 = new Bike("BIKE456", 800, true);
     Truck t1 = new Truck("TRUCK789", 3500, 12.5);

     vehicles.add(c1);
     vehicles.add(b1);
     vehicles.add(t1);

     displayRentalSummary(vehicles);
 }
}
