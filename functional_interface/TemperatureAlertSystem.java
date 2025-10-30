package functional_interface;
import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double threshold = 40.0;


        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        System.out.println("=== TEMPERATURE ALERT SYSTEM ===");
        System.out.print("Enter current temperature (°C): ");
        double currentTemp = sc.nextDouble();


        if (isHighTemperature.test(currentTemp)) {
            System.out.println("ALERT! Temperature " + currentTemp + "°C exceeds threshold of " + threshold + "°C.");
        } else {
            System.out.println("Temperature " + currentTemp + "°C is within the safe limit.");
        }

        sc.close();
    }
}
