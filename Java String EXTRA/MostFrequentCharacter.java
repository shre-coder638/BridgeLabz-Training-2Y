import java.util.Scanner;

public class MostFrequentCharacter{
        public static char mostFrequentChar(String str) {
        int[] freq = new int[256]; // For all ASCII characters
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        int max = 0;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }
        return result;
    }
    
    // Usage example:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char mostFrequent = mostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}