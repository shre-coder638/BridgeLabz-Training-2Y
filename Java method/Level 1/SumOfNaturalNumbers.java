import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int Sum(int a) {
        int sum = 0;
        for (int i=1; i<=a; i++) {
            sum += i;
        }
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n1 = scanner.nextInt();
        int result = Sum(n1);
    
        System.out.println("The sum of the first " + n1 + " natural numbers is: " + result);
        
        scanner.close();
    }
}