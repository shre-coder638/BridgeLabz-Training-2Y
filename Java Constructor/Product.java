import java.util.Scanner;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product() {
        totalProducts++;
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void inputProductDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        this.productName = scanner.nextLine();
        System.out.print("Enter price: ");
        this.price = scanner.nextDouble();
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.inputProductDetails();
        p1.displayProductDetails();
        Product.displayTotalProducts();

        Product p2 = new Product();
        p2.inputProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
