package onlinefoodddeliverysystem;

class VegDiscount implements Discountable {
 @Override
 public double applyDiscount(double totalPrice) {
     return totalPrice * 0.9; 
 }     
     
 @Override
 public String getDiscountDetails() {
     return "Veg Discount: 10% off";
 }
}

class NonVegDiscount implements Discountable {
 @Override
 public double applyDiscount(double totalPrice) {
     return totalPrice * 0.85; }

 @Override
 public String getDiscountDetails() {
     return "Non-Veg Discount: 15% off";
 }
}
