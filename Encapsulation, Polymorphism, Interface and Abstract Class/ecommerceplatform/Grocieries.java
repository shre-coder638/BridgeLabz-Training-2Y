package ecommerceplatform;

class Groceries extends Product {
    private double weight;

    public Groceries(int productId, String name, double price, double weight) {
        super(productId, name, price);
        this.weight = weight;
    }

   public double calculateDiscount() {
        return getPrice() * 0.05;
   }
}