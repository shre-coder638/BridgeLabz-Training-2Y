import java.util.Scanner;

public class WordLengthTable {
    // Method to split text into words using charAt()
    public static String[] splitText(String text) {
        int n = text.length();
        String[] words = new String[n]; // Over-allocate, will trim later
        int wordCount = 0;
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    words[wordCount++] = currentWord.toString();
                    currentWord.setLength(0);
                }
            }
        }
        if (currentWord.length() > 0) {
            words[wordCount++] = currentWord.toString();
        }
        // Trim the array to actual word count
        String[] result = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            result[i] = words[i];
        }
        return result;
    }

    // Method to find string length without using length()
    public static int getLength(String str) {
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
            table[i][1] = String.valueOf(getLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] table = getWordLengthTable(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            String word = table[i][0];
            int length = Integer.parseInt(table[i][1]);
            System.out.println(word + "\t" + length);
        }
    }
}