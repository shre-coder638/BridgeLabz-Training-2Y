import java.util.Scanner;

public class PalindromeCheck {
    // Logic 1: Compare start and end indexes
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays and reverse
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        int len = text.length();
        char[] rev = new char[len];
        for (int i = 0; i < len; i++) {
            rev[i] = text.charAt(len - 1 - i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeArray(input);

        System.out.println("Palindrome check (Iterative): " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Palindrome check (Recursive): " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Palindrome check (Array/Reverse): " + (result3 ? "Palindrome" : "Not Palindrome"));
    }
}