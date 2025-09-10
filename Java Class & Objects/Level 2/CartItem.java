import java.util.Scanner;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        final int MAX_ITEMS = 100;
        CartItem[] cart = new CartItem[MAX_ITEMS];
        int itemCount = 0;
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n1. Add item\n2. Remove item\n3. Display total cost\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    if (itemCount >= MAX_ITEMS) {
                        System.out.println("Cart is full!");
                        break;
                    }
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    sc.nextLine(); // consume newline
                    cart[itemCount++] = new CartItem(name, price, qty);
                    System.out.println("Item added to cart.");
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < itemCount; i++) {
                        if (cart[i].getItemName().equalsIgnoreCase(removeName)) {
                            // Shift items left
                            for (int j = i; j < itemCount - 1; j++) {
                                cart[j] = cart[j + 1];
                            }
                            cart[itemCount - 1] = null;
                            itemCount--;
                            found = true;
                            System.out.println("Item removed from cart.");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found in cart.");
                    }
                    break;
                case 3:
                    double total = 0;
                    for (int i = 0; i < itemCount; i++) {
                        total += cart[i].getTotalCost();
                    }
                    System.out.println("Total cost: Rs. " + total);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
