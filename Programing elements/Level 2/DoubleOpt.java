
import java.util.Scanner;
class DoubleOpt{
    public static void main(String[] args) {
     
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
