package functional_interface;
import java.util.Scanner;


interface Vehicle {
 void rent();
 void returnVehicle();
}


class Car implements Vehicle {
 private boolean isRented = false;

 public void rent() {
     if (!isRented) {
         System.out.println("Car has been rented successfully!");
         isRented = true;
     } else {
         System.out.println("Car is already rented!");
     }
 }

 public void returnVehicle() {
     if (isRented) {
         System.out.println("Car has been returned. Thank you!");
         isRented = false;
     } else {
         System.out.println("Car was not rented yet!");
     }
 }
}


class Bike implements Vehicle {
 private boolean isRented = false;

 public void rent() {
     if (!isRented) {
         System.out.println("Bike has been rented successfully!");
         isRented = true;
     } else {
         System.out.println("Bike is already rented!");
     }
 }

 public void returnVehicle() {
     if (isRented) {
         System.out.println("Bike has been returned. Thank you!");
         isRented = false;
     } else {
         System.out.println("Bike was not rented yet!");
     }
 }
}

class Bus implements Vehicle {
 private boolean isRented = false;

 public void rent() {
     if (!isRented) {
         System.out.println("Bus has been rented successfully!");
         isRented = true;
     } else {
         System.out.println("Bus is already rented!");
     }
 }

 public void returnVehicle() {
     if (isRented) {
         System.out.println("Bus has been returned. Thank you!");
         isRented = false;
     } else {
         System.out.println("Bus was not rented yet!");
     }
 }
}

public class Multi_vehicle_rental_system {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Vehicle car = new Car();
     Vehicle bike = new Bike();
     Vehicle bus = new Bus();

     int choice;
     do {
         System.out.println("\n=== MULTI-VEHICLE RENTAL SYSTEM ===");
         System.out.println("1. Rent Car");
         System.out.println("2. Return Car");
         System.out.println("3. Rent Bike");
         System.out.println("4. Return Bike");
         System.out.println("5. Rent Bus");
         System.out.println("6. Return Bus");
         System.out.println("7. Exit");
         System.out.print("Enter your choice: ");

         choice = sc.nextInt();

         switch (choice) {
             case 1: car.rent(); break;
             case 2: car.returnVehicle(); break;
             case 3: bike.rent(); break;
             case 4: bike.returnVehicle(); break;
             case 5: bus.rent(); break;
             case 6: bus.returnVehicle(); break;
             case 7: System.out.println("Thank you for using the Vehicle Rental System!"); break;
             default: System.out.println("Invalid choice! Please try again.");
         }
     } while (choice != 7);

     sc.close();
 }
}
