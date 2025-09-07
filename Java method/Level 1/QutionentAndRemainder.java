import java.util.Scanner;

public class QutionentAndRemainder {

    public static String Cal(int a, int b) {
        int l = a/b;
        int s = a%b;
    
        return "The qutionent is: " + l + "\nThe remainder is: " + s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        String result = Cal(n1, n2);
        
        System.out.println(result);
        scanner.close();
    }
}