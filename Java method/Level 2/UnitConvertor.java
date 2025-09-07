import java.util.Scanner;

public class UnitConvertor {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select conversion type:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        int choice = scanner.nextInt();

        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();
        double result = 0;

        switch (choice) {
            case 1:
                result = convertFahrenheitToCelsius(value);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", value, result);
                break;
            case 2:
                result = convertCelsiusToFahrenheit(value);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", value, result);
                break;
            case 3:
                result = convertPoundsToKilograms(value);
                System.out.printf("%.2f Pounds is %.2f Kilograms%n", value, result);
                break;
            case 4:
                result = convertKilogramsToPounds(value);
                System.out.printf("%.2f Kilograms is %.2f Pounds%n", value, result);
                break;
            case 5:
                result = convertGallonsToLiters(value);
                System.out.printf("%.2f Gallons is %.2f Liters%n", value, result);
                break;
            case 6:
                result = convertLitersToGallons(value);
                System.out.printf("%.2f Liters is %.2f Gallons%n", value, result);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
        
    }
}
