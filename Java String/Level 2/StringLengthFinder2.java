import java.util.Scanner;

public class StringLengthFinder2 {
    // Method to find length without using length()
    public static int getLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    // Method to split string into words without using split()
    public static String[] customSplit(String str) {
        int n = getLengthWithoutLengthMethod(str);
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (str.charAt(i) == ' ') {
                inWord = false;
            }
        }
        String[] words = new String[wordCount];
        int start = -1, wordIdx = 0;
        for (int i = 0; i <= n; i++) {
            if (i < n && str.charAt(i) != ' ') {
                if (start == -1) start = i;
            } else {
                if (start != -1) {
                    words[wordIdx++] = str.substring(start, i);
                    start = -1;
                }
            }
        }
        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int customLength = getLengthWithoutLengthMethod(input);
        int builtInLength = input.length();
        System.out.println("Length (custom method): " + customLength);
        System.out.println("Length (built-in method): " + builtInLength);

        String[] customWords = customSplit(input);
        String[] splitWords = input.split(" ");

        System.out.println("Custom split:");
        for (String w : customWords) System.out.println(w);
        System.out.println("Built-in split:");
        for (String w : splitWords) System.out.println(w);

        boolean areEqual = compareStringArrays(customWords, splitWords);
        System.out.println("Are both splits equal? " + areEqual);
    }
}
