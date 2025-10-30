package onlinefoodddeliverysystem;

class VegItem extends FoodItem {
    private double packagingCharge = 10;
    
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + packagingCharge;
    }
}