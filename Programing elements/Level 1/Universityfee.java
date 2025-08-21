// Creating Class with name DisplayResult indicating the purpose is to display 
// result. Notice the class name is a Noun.
class Universityfee {
    public static void main(String[] args) {
     
        // Create a string variable name and assign value Sam
        int Fees = 125000;
        int discount = 10;
        int discountedamount = Fees * discount / 100;
        int discountedPrice = Fees - discountedamount;


       System.out.println("The discount amount is INR " + discountedamount
        + " and final discounted fee is INR " + discountedPrice);
       
    }
}
