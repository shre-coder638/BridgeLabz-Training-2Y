import java.util.Scanner;

public class CharFrequency {
    // Method to find frequency of characters and return as 2D array
    public static Object[][] getCharFrequencies(String text) {
        int[] freq = new int[256]; // ASCII character frequency

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // Mark as processed
            }
        }

        // Prepare 2D array for characters and their frequencies
        Object[][] result = new Object[uniqueCount][2];
        int idx = 0;
        for (int i = 0; i < text.length(); i++) {
            int ascii = text.charAt(i);
            if (freq[ascii] < 0) {
                result[idx][0] = text.charAt(i);
                result[idx][1] = -freq[ascii];
                freq[ascii] = 0; // Reset to avoid duplicates
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Object[][] frequencies = getCharFrequencies(input);

        System.out.println("Character frequencies:");
        for (Object[] pair : frequencies) {
            System.out.println(pair[0] + ": " + pair[1]);
        }
    }
}