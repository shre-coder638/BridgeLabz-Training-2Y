import java.util.Scanner;

public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void inputAndCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to check for palindrome: ");
        String userInput = scanner.nextLine();
        PalindromeChecker checker = new PalindromeChecker(userInput);
        checker.displayResult();
    }

    public static void main(String[] args) {
        inputAndCheck();
    }
}
