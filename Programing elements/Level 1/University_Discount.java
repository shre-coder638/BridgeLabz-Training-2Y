// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
import java.util.Scanner;
class University_Discount{
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fees: ");
        int Fees = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        int discountpercent = input.nextInt();
        int discountedamount = Fees * discountpercent / 100;
        int discountedPrice = Fees - discountedamount;


       System.out.println("The discount amount is INR " + discountedamount
        + " and final discounted fee is INR " + discountedPrice);   
    }
}
