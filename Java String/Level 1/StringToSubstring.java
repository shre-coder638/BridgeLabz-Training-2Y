import java.util.Scanner;

public class StringToSubstring {

    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Substring using charAt()
        String sub1 = customSubstring(text, start, end);

        // Substring using built-in method
        String sub2 = "";
        if (start >= 0 && end <= text.length() && start < end) {
            sub2 = text.substring(start, end);
        } else {
            System.out.println("Invalid indices for substring method.");
        }

        // Compare substrings
        boolean areEqual = compareStrings(sub1, sub2);

        // Display results
        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}