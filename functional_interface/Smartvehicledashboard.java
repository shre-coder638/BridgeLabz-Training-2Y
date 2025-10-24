package functional_interface;
@FunctionalInterface
interface VehicleDashboard {
    void displaySpeed(int speed);  
    
    default void displayBattery(int batteryPercent) {
        System.out.println("Battery status not available for this vehicle.");
    }
}

public class Smartvehicledashboard {
    public static void main(String[] args) {

        VehicleDashboard car = speed ->
                System.out.println("Car Speed: " + speed + " km/h");

        VehicleDashboard bike = speed ->
                System.out.println("Bike Speed: " + speed + " km/h");

        VehicleDashboard electricCar = new VehicleDashboard() {
            @Override
            public void displaySpeed(int speed) {
                System.out.println("Electric Car Speed: " + speed + " km/h");
            }

            @Override
            public void displayBattery(int batteryPercent) {
                System.out.println("Battery Level: " + batteryPercent + "%");
            }
        };

        System.out.println("\n=== SMART VEHICLE DASHBOARD ===");
        car.displaySpeed(80);
        bike.displaySpeed(65);
        electricCar.displaySpeed(90);

        System.out.println("\n=== BATTERY STATUS ===");
        car.displayBattery(0);        
        bike.displayBattery(0);       
        electricCar.displayBattery(85); 
    }
}
