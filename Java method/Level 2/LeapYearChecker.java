import java.util.Scanner;

public class LeapYearChecker {
    // Method to check for Leap Year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Not in Gregorian calendar
        }
        // Condition a: divisible by 4 and not divisible by 100
        // Condition b: divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}