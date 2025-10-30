package functional_interface;
import java.util.Scanner;



interface SmartDevice {
 void turnOn();
 void turnOff();
}


class Light implements SmartDevice {
 public void turnOn() {
     System.out.println("Light is now ON");
 }
 public void turnOff() {
     System.out.println("Light is now OFF");
 }
}


class AirConditioner implements SmartDevice {
 public void turnOn() {
     System.out.println("Air Conditioner is now ON");
 }
 public void turnOff() {
     System.out.println("Air Conditioner is now OFF");
 }
}


class TV implements SmartDevice {
 public void turnOn() {
     System.out.println("TV is now ON");
 }
 public void turnOff() {
     System.out.println("TV is now OFF");
 }
}

public class SmartDeviceControl {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     SmartDevice light = new Light();
     SmartDevice ac = new AirConditioner();
     SmartDevice tv = new TV();

     int choice;
     do {
         System.out.println("\n=== SMART HOME CONTROL SYSTEM ===");
         System.out.println("1. Turn ON Light");
         System.out.println("2. Turn OFF Light");
         System.out.println("3. Turn ON Air Conditioner");
         System.out.println("4. Turn OFF Air Conditioner");
         System.out.println("5. Turn ON TV");
         System.out.println("6. Turn OFF TV");
         System.out.println("7. Exit");
         System.out.print("Enter your choice: ");
         
         choice = sc.nextInt();

         switch (choice) {
             case 1: light.turnOn(); break;
             case 2: light.turnOff(); break;
             case 3: ac.turnOn(); break;
             case 4: ac.turnOff(); break;
             case 5: tv.turnOn(); break;
             case 6: tv.turnOff(); break;
             case 7: System.out.println("Exiting Smart Home Controller..."); break;
             default: System.out.println("Invalid choice. Try again!");
         }

     } while (choice != 7);
     
     sc.close();
 }
}
