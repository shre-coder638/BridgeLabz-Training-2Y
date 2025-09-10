import java.util.Scanner;

public class RemoveSpecificCharacter {
    public static String removeCharacter(String str, char ch) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char toRemove = scanner.next().charAt(0);

        String modified = removeCharacter(input, toRemove);
        System.out.println("Modified String: \"" + modified + "\"");
    }
}