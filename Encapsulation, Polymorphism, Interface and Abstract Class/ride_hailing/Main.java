package ride_hailing;


import java.util.ArrayList;

public class Main {

 public static void calculateFares(ArrayList<Vehicle> vehicles, double distance) {
     System.out.println("\n=== RIDE FARE SUMMARY ===");

     for (Vehicle v : vehicles) {
         v.getVehicleDetails();
         double fare = v.calculateFare(distance);
         System.out.println("Distance: " + distance + " km");
         System.out.println("Calculated Fare: ₹" + fare);

         GPS gps = null;
         if (v instanceof Car) {
             gps = new CarGPS();
         } else if (v instanceof Bike) {
             gps = new BikeGPS();
         } else if (v instanceof Auto) {
             gps = new AutoGPS();
         }

         if (gps != null) {
             gps.updateLocation("Downtown City Center");
             System.out.println("Current GPS Location: " + gps.getCurrentLocation());
         }

     }
 }

 public static void main(String[] args) {
     ArrayList<Vehicle> vehicleList = new ArrayList<>();

     Car car1 = new Car("C001", "Alice", 15.0);
     Bike bike1 = new Bike("B002", "Bob", 8.0);
     Auto auto1 = new Auto("A003", "Charlie", 10.0);

     vehicleList.add(car1);
     vehicleList.add(bike1);
     vehicleList.add(auto1);

     calculateFares(vehicleList, 12.5);
 }
}
