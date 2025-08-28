// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
import java.util.Scanner;
class IntOperation{
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the second number: ");
        int c = input.nextInt();
        int o1 = a + b *c;
        int o2 = a * b + c;
        int o3 = c + a / b;
        int o4 = a % b + c;

       System.out.println("The results of Int Operations are " + o1 + ", " + o2 + ", " + o3 + ", and " + o4);
    }
}
