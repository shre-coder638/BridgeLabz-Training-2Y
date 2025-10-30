package ecommerceplatform;

abstract class Product {
 private int productId;
 private String name;
 private double price;

 public Product(int productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }

 public int getProductId() { return productId; }
 public String getName() { return name; }
 public double getPrice() { return price; }

 public void setProductId(int productId) { this.productId = productId; }
 public void setName(String name) { this.name = name; }
 public void setPrice(double price) { this.price = price; }

public abstract double calculateDiscount();

public void displayDetails() {
     System.out.println("Product ID: " + productId);
     System.out.println("Name: " + name);
     System.out.println("Base Price: " + price);
 }
}
