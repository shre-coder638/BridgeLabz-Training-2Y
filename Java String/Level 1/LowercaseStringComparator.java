import java.util.Scanner;

public class LowercaseStringComparator {
    // Custom method to convert a string to lowercase using charAt()
    static String manualLowercase(String input) {
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < input.length(); idx++) {
            char c = input.charAt(idx);
            // If character is uppercase alphabet, convert to lowercase
            if (c >= 'A' && c <= 'Z') {
                sb.append((char)(c + ('a' - 'A')));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Custom method to compare two strings character by character
    static boolean areStringsEqual(String first, String second) {
        if (first.length() != second.length()) return false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String userInput = sc.nextLine();

        String builtInLower = userInput.toLowerCase();
        String manualLower = manualLowercase(userInput);

        boolean comparisonResult = areStringsEqual(builtInLower, manualLower);

        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Manual lowercase: " + manualLower);
        System.out.println("Are both lowercase strings equal? " + comparisonResult);
    }
}