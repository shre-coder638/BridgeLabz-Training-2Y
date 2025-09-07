import java.util.Scanner;

public class StringLengthFinder3 {

    // Method to split text into words using charAt(), without using split()
    public static String[] splitTextIntoWords(String text) {
        int n = text.length();
        String[] words = new String[n]; // Over-allocate, will trim later
        int wordCount = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    words[wordCount++] = word.toString();
                    word.setLength(0);
                }
            }
        }
        // Add last word if any
        if (word.length() > 0) {
            words[wordCount++] = word.toString();
        }
        // Trim array to actual word count
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // End of string
        }
        return count;
    }

    // Method to create 2D array of word and its length
    public static String[][] getWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return table;
    }

    // Method to find shortest and longest word
    public static int[] findShortestAndLongest(String[][] table) {
        int minLen = Integer.MAX_VALUE, maxLen = Integer.MIN_VALUE;
        int minIdx = -1, maxIdx = -1;
        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < minLen) {
                minLen = len;
                minIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text:");
        String text = sc.nextLine();

        String[] words = splitTextIntoWords(text);
        String[][] table = getWordLengthTable(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("Word\tLength");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }

        System.out.println("Shortest word: " + table[result[0]][0]);
        System.out.println("Longest word: " + table[result[1]][0]);
    }
}