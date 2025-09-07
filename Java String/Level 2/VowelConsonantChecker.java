import java.util.Scanner;

public class VowelConsonantChecker {

    // Method to check character type
    public static String getCharType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to process string and return 2D array
    public static String[][] findVowelsConsonants(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = getCharType(ch);
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.printf("%-10s%-15s%n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : arr) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findVowelsConsonants(input);
        displayTable(result);
    }
}