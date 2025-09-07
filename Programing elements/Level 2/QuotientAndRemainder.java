
import java.util.Scanner;
class QuotientAndRemainder{
    public static void main(String[] args) {
     
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = input.nextInt();
        int quotient = n1 / n2;
        int remainder = n1 % n2;

       System.out.println("The quotient is " + quotient + " and the remainder is " + remainder + " of two numbers " + n1 + " and " + n2);
    }
}
