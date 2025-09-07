import java.util.Scanner;

public class FactorsTasks {
    // Method to find factors and return as array
    public static int[] getFactors(int num) {
        int count = 0;
        // First loop: count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int idx = 0;
        // Second loop: store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[idx++] = i;
        }
        return factors;
    }

    // Method to find greatest factor
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to find product of factors
    public static int productOfFactors(int[] factors) {
        int prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    // Method to find product of cubes of factors
    public static double productOfCubes(int[] factors) {
        double prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }

    // Method to take input from user
    public static int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        return num;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        int num = inputNumber();
        int[] factors = getFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
    }
}
