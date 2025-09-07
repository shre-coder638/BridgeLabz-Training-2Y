import java.util.Scanner;

public class StringUppercaseCompare {
    // Method to convert lowercase letters to uppercase using charAt and ASCII logic
    public static String toUpperCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String upperManual = toUpperCaseManual(input);
        String upperBuiltIn = input.toUpperCase();

        boolean areEqual = compareStrings(upperManual, upperBuiltIn);

        System.out.println("Manual Uppercase: " + upperManual);
        System.out.println("Built-in Uppercase: " + upperBuiltIn);
        System.out.println("Are both uppercase results equal? " + areEqual);
    }
}