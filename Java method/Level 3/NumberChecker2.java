import java.util.Scanner;

public class NumberChecker2 {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check if a number is a palindrome using the digits
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) { // Duck number can't start with 0
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Main method to call and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter the 3rd number: ");
        int number3 = scanner.nextInt();
        

        System.out.println("Count of digits in " + number1 + ": " + countDigits(number1));
        int[] digits1 = getDigitsArray(number1);
        System.out.print("Digits array: ");
        for (int d : digits1) System.out.print(d + " ");
        System.out.println();

        int[] reversed1 = reverseArray(digits1);
        System.out.print("Reversed array: ");
        for (int d : reversed1) System.out.print(d + " ");
        System.out.println();

        System.out.println("Arrays equal: " + arraysEqual(digits1, reversed1));
        System.out.println(number1 + " is palindrome: " + isPalindrome(number1));
        System.out.println(number2 + " is duck number: " + isDuckNumber(number2));
        System.out.println(number3 + " is duck number: " + isDuckNumber(number3));
    }
}
