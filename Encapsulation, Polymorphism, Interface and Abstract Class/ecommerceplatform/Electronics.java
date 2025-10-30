package ecommerceplatform;

class Electronics extends Product {
    private int warrantyYears;

    public Electronics(int productId, String name, double price, int warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }
}