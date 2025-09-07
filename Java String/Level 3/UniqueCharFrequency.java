import java.util.Scanner;

public class UniqueCharFrequency {
    // Method to find unique characters using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[uniqueCount++] = current;
            }
        }

        // Create a new array with only unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }
        return result;
    }

    // Method to find frequency of unique characters and return as 2D String array
    public static String[][] charFrequencies(String text) {
        int[] freq = new int[256]; // ASCII character frequency

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencies = charFrequencies(input);

        System.out.println("Unique characters and their frequencies:");
        for (String[] pair : frequencies) {
            System.out.println(pair[0] + ": " + pair[1]);
        }
    }
}