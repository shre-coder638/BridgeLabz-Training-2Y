import java.util.Scanner;


public class DistanceConvertor {
    // Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
        // Convert Fahrenheit to Celsius
        public static double convertFahrenheitToCelsius(double fahrenheit) {
            double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
            return fahrenheit2celsius;
        }

        // Convert Celsius to Fahrenheit
        public static double convertCelsiusToFahrenheit(double celsius) {
            double celsius2fahrenheit = (celsius * 9 / 5) + 32;
            return celsius2fahrenheit;
        }

        // Convert pounds to kilograms
        public static double convertPoundsToKilograms(double pounds) {
            double pounds2kilograms = 0.453592;
            return pounds * pounds2kilograms;
        }

        // Convert kilograms to pounds
        public static double convertKilogramsToPounds(double kilograms) {
            double kilograms2pounds = 2.20462;
            return kilograms * kilograms2pounds;
        }

        // Convert gallons to liters
        public static double convertGallonsToLiters(double gallons) {
            double gallons2liters = 3.78541;
            return gallons * gallons2liters;
        }

        // Convert liters to gallons
        public static double convertLitersToGallons(double liters) {
            double liters2gallons = 0.264172;
            return liters * liters2gallons;
        }
        // Convert Fahrenheit to Celsius
        public static double convertFahrenheitToCelsius(double fahrenheit) {
            double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
            return fahrenheit2celsius;
        }

        // Convert Celsius to Fahrenheit
        public static double convertCelsiusToFahrenheit(double celsius) {
            double celsius2fahrenheit = (celsius * 9 / 5) + 32;
            return celsius2fahrenheit;
        }

        // Convert pounds to kilograms
        public static double convertPoundsToKilograms(double pounds) {
            double pounds2kilograms = 0.453592;
            return pounds * pounds2kilograms;
        }

        // Convert kilograms to pounds
        public static double convertKilogramsToPounds(double kilograms) {
            double kilograms2pounds = 2.20462;
            return kilograms * kilograms2pounds;
        }

        // Convert gallons to liters
        public static double convertGallonsToLiters(double gallons) {
            double gallons2liters = 3.78541;
            return gallons * gallons2liters;
        }

        // Convert liters to gallons
        public static double convertLitersToGallons(double liters) {
            double liters2gallons = 0.264172;
            return liters * liters2gallons;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select conversion type:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = convertKmToMiles(value);
                System.out.printf("%.2f kilometers is %.2f miles.%n", value, result);
                break;
            case 2:
                result = convertMilesToKm(value);
                System.out.printf("%.2f miles is %.2f kilometers.%n", value, result);
                break;
            case 3:
                result = convertMetersToFeet(value);
                System.out.printf("%.2f meters is %.2f feet.%n", value, result);
                break;
            case 4:
                result = convertFeetToMeters(value);
                System.out.printf("%.2f feet is %.2f meters.%n", value, result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

}
