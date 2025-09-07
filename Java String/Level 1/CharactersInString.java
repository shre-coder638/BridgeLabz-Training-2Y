import java.util.Scanner;

public class CharactersInString {

    // Custom method to extract characters from a string (without toCharArray)
    public static char[] extractCharacters(String input) {
        int length = input.length();
        char[] result = new char[length];
        int idx = 0;
        for (char ch : input.toCharArray()) {
            result[idx++] = ch;
        }
        return result;
    }

    // Method to compare two character arrays
    public static boolean arraysMatch(char[] first, char[] second) {
        if (first == null || second == null || first.length != second.length) return false;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Type your string: ");
        String userInput = scanner.next();

        // Use custom method
        char[] customChars = extractCharacters(userInput);

        // Use built-in method
        char[] builtinChars = userInput.toCharArray();

        // Compare arrays
        boolean isSame = arraysMatch(customChars, builtinChars);

        // Display results
        System.out.print("Characters from custom method: ");
        for (char c : customChars) System.out.print(c + " ");
        System.out.println();

        System.out.print("Characters from toCharArray(): ");
        for (char c : builtinChars) System.out.print(c + " ");
        System.out.println();

        System.out.println("Are both arrays identical? " + isSame);
    }
}