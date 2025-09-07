public class NumberChecker4 {
    // Check if a number is a perfect number
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum == n;
    }

    // Check if a number is an abundant number
    public static boolean isAbundant(int n) {
        if (n < 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum > n;
    }

    // Check if a number is a deficient number
    public static boolean isDeficient(int n) {
        if (n < 1) return false;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum < n;
    }

    // Check if a number is a strong number
    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    private static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] inputs = sc.nextLine().split("\\s+");
        for (String input : inputs) {
            try {
                int n = Integer.parseInt(input);
                System.out.println("Number: " + n);
                System.out.println("Perfect: " + isPerfect(n));
                System.out.println("Abundant: " + isAbundant(n));
                System.out.println("Deficient: " + isDeficient(n));
                System.out.println("Strong: " + isStrong(n));
                System.out.println("----------------------");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + input);
            }
        }
        sc.close();
    }
}
