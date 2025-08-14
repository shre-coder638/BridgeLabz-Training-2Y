import java.util.Scanner;


public class Perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        int length = scanner.nextInt();
        System.out.println("Enter width of the rectangle:");
        int width = scanner.nextInt();

        // Calculate the perimeter
        int perimeter = 2 * (length + width);

        // Print the result
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
    
}
