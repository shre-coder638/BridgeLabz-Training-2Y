import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // Accessing index beyond the length of the string
        // This will throw StringIndexOutOfBoundsException
        System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String str) {
        try {
            System.out.println("Character at index " + str.length() + ": " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // This will generate and show the exception
        generateException(input);

        // This will handle the exception
        handleException(input);
    }
}
