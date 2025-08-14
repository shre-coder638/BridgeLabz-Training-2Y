import java.util.Scanner;

public class Power_calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base:");
        int Base = scanner.nextInt();
        System.out.println("Enter power of the exponent:");
        int exponent = scanner.nextInt();

        // Calculate the power
        double result = Math.pow(Base, exponent);
        System.out.println("The result of " + Base + " raised to the power of " + exponent + " is: " + result);
    }
}
