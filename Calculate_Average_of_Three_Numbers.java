import java.util.Scanner;

public class Calculate_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter first number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter first number:");
        int num3 = scanner.nextInt();
        
        int sum = num1 + num2 + num3;
        double average = sum / 3.0;
        System.out.println("The average is: " + average);
    }
}