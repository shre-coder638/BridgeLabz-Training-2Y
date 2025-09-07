import java.util.Scanner;

public class NumberFormatExceptionDemo {
    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException and generic RuntimeException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text to parse as integer: ");
        String input = sc.nextLine();

        // This will generate and show the exception (program stops abruptly)
        generateException(input);

        // This will handle the exception gracefully
        handleException(input);
        sc.close();
    }
}
