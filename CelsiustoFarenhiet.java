import java.util.Scanner;

public class CelsiustoFarenhiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter temperature in Celsius:");

        double celsius = scanner.nextInt();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        scanner.close();
    }
}