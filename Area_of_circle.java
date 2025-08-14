import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
}
