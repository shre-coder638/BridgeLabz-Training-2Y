package onlinefoodddeliverysystem;

class NonVegItem extends FoodItem {
    private double additionalCharge = 25; 

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }
}