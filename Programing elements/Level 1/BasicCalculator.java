// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
import java.util.Scanner;
class BasicCalculator{
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();
        int add = n1 + n2;
        int subtract = n1 - n2;
        int multiply = n1 * n2;
        int divide = n1 / n2;

       System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + n1 + " and " + n2 + " is " + add + ", " + subtract + ", " + multiply + ", and " + divide);
    }
}
