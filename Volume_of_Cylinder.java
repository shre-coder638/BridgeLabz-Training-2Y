import java.util.Scanner;

public class Volume_of_Cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the cylinder:");
        double radius = scanner.nextDouble();

        System.out.println("Enter height of the cylinder:");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);
    }
}