import java.util.Scanner;

public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        itemCode = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Price: " + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.inputDetails();
        item.displayDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();
        double total = item.calculateTotalCost(qty);
        System.out.println("Total Cost for " + qty + " items: " + total);
    }
}