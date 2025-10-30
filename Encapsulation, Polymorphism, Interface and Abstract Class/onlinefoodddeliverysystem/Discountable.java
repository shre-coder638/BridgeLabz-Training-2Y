package onlinefoodddeliverysystem;

interface Discountable {
    double applyDiscount(double totalPrice);
    String getDiscountDetails();
}