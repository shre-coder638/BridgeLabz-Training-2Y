import java.util.Scanner;

public class CustomStringTrim {

    // Method to find start and end indices after trimming spaces using charAt()
    public static int[] trimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean customCompare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = t.nextLine();
        int[] indices = trimIndices(input);
        String trimmedCustom = customSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();

        boolean areEqual = customCompare(trimmedCustom, trimmedBuiltIn);

        System.out.println("Original: '" + input + "'");
        System.out.println("Custom Trimmed: '" + trimmedCustom + "'");
        System.out.println("Built-in Trimmed: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);
    }
}