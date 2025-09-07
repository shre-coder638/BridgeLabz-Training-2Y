import java.util.Scanner;

public class NestedLoopCharFrequency {
    // Method to find frequency of characters using nested loops
    public static String[] charFrequencies(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue; // Skip already counted
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark as counted
                }
            }
        }

        // Count unique (non-'0') characters
        int uniqueCount = 0;
        for (char c : chars) {
            if (c != '0') uniqueCount++;
        }

        // Prepare 1D String array for result
        String[] result = new String[uniqueCount];
        int idx = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[idx++] = chars[i] + ": " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequencies = charFrequencies(input);

        System.out.println("Character frequencies:");
        for (String s : frequencies) {
            System.out.println(s);
        }
    }
}