import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    // Formula method to find sum of n natural numbers
    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            return;
        }

        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);

        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results do not match. Please check your code.");
        }
    }
}