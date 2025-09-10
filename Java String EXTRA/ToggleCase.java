import java.util.Scanner;

public class ToggleCase {
   public static String toggleCase(String str) {
    StringBuilder result = new StringBuilder();
    for (char c : str.toCharArray()) {
        if (Character.isUpperCase(c)) {
            result.append(Character.toLowerCase(c));
        } else if (Character.isLowerCase(c)) {
            result.append(Character.toUpperCase(c));
        } else {
            result.append(c);
        }
    }
    return result.toString();
}
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Occurrences: " + toggleCase(s));
        sc.close();

    }    
}