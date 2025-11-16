package onlineshopping;

public class Product<C extends Category> {
    private final String title;
    private final C category;
    private double price;

    public Product(String title, C category, double price) {
        if (price < category.minPrice() || price > category.maxPrice()) {
            throw new IllegalArgumentException(
                "Price " + price + " out of range for " + category.getName()
            );
        }
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() { return title; }
    public C getCategory() { return category; }
    public double getPrice() { return price; }

    public void setPrice(double newPrice) {
        if (newPrice < category.minPrice() || newPrice > category.maxPrice()) {
            throw new IllegalArgumentException("Price out of allowed range for category.");
        }
        this.price = newPrice;
    }

    public String toString() {
        return String.format("%s [%s] - %.2f", title, category.getName(), price);
    }
}