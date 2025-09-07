import java.util.Scanner;

public class PositiveNegativeZero {

    public static String orientation(int a) {
        if (a > 0) {
            return "Positive";
        } else if (a < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n1 = scanner.nextInt();
        String result = orientation(n1);
    
        System.out.printf("The number is " + result);
        
        scanner.close();
    }
}