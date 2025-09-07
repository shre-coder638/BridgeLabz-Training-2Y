import java.util.Scanner;


public class NumberChecker3 {
    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check if a number is neon
    public static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == n;
    }

    // Check if a number is spy
    public static boolean isSpy(int n) {
        int sum = 0, product = 1;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // Check if a number is automorphic
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String nStr = String.valueOf(n);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(nStr);
    }

    // Check if a number is buzz
    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.println("Number: " + n);
    System.out.println("Prime: " + isPrime(n));
    System.out.println("Neon: " + isNeon(n));
    System.out.println("Spy: " + isSpy(n));
    System.out.println("Automorphic: " + isAutomorphic(n));
    System.out.println("Buzz: " + isBuzz(n));
    sc.close();
    }
}
