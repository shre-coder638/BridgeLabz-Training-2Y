import java.util.Scanner;

public class StringLengthFinder {
    // Method to find length without using length()
    public static int getLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        int customLength = getLengthWithoutLengthMethod(input);
        int builtInLength = input.length();

        System.out.println("Length (custom method): " + customLength);
        System.out.println("Length (built-in method): " + builtInLength);
    }
}