import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle (in inches): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle (in inches): ");
        double height = sc.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 sq inch = 6.4516 sq cm

        double heightCm = height * 2.54; // 1 inch = 2.54 cm
        double heightFeet = height / 12.0;
        double heightInches = height;

        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", heightCm, heightFeet, heightInches);
    }
}