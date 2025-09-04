class Universityfee {
    public static void main(String[] args) {
     
        int Fees = 125000;
        int discount = 10;
        int discountedamount = Fees * discount / 100;
        int discountedPrice = Fees - discountedamount;


       System.out.println("The discount amount is INR " + discountedamount
        + " and final discounted fee is INR " + discountedPrice);
       
    }
}
