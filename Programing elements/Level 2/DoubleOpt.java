// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
import java.util.Scanner;
class DoubleOpt{
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        System.out.print("Enter the second number: ");
        double c = input.nextDouble();
        double o1 = a + b *c;
        double o2 = a * b + c;
        double o3 = c + a / b;
        double o4 = a % b + c;

       System.out.println("The results of Double Operations are " + o1 + ", " + o2 + ", " + o3 + ", and " + o4);
    }
}
