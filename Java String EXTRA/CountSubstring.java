import java.util.Scanner;

public class CountSubstring {
    public static int countSubstringOccurrences(String str, String sub) {
    int count = 0;
    int idx = 0;
    while ((idx = str.indexOf(sub, idx)) != -1) {
        count++;
        idx += sub.length();
    }
    return count;
  }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Enter the substring to count:");
        String sub = sc.nextLine();
        System.out.println("Occurrences: " + countSubstringOccurrences(s, sub));
        sc.close();

    }    
}