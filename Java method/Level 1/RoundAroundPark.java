import java.util.Scanner;

public class RoundAroundPark {

    public static double numberOfRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        double rounds = 5000.0 / perimeter;
        return rounds;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st side: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the 2nd side: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter the 3rd side: ");
        int n3 = scanner.nextInt();
        
    double result = numberOfRounds(n1, n2, n3);
    System.out.printf("The athlete needs to complete %.2f rounds to finish a 5km run.\n", result);
        
        scanner.close();
    }
}