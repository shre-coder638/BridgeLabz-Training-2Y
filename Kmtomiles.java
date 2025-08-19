// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
import java.util.Scanner;
class Kmtomiles {
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in KM: ");
        int Km = input.nextInt();
        double miles = Km * 0.6;
       System.out.println("The total miles is " + miles + " mile for the given " + Km + " km");
       
    }
}
