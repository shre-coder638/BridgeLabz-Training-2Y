            
import java.util.Scanner;
class Height_converter{
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in cm: ");
        int height = input.nextInt();
        int heightInFeet = height / 30;
        int heightInInches = height % 30 * 12 / 30;

       System.out.println("Your Height in cm is " + height + " Your height in feet is " + heightInFeet + " feet and " + " inches is " + heightInInches);
    }
}
