package functional_interface;
import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function<String, Integer> getLength = msg -> msg.length();

        int limit = 100;

        System.out.println("=== STRING LENGTH CHECKER ===");
        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        int length = getLength.apply(message);

        System.out.println("Message length: " + length);
        if (length > limit) {
            System.out.println("ALERT: Message exceeds the character limit of " + limit + "!");
        } else {
            System.out.println("Message is within the safe limit.");
        }

        sc.close();
    }
}
