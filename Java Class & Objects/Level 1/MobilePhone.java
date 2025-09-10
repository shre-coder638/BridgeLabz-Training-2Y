public class MobilePhone {
    private String brand;
    private String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of phones: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        MobilePhone[] phones = new MobilePhone[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for phone " + (i + 1) + ":");
            System.out.print("Brand: ");
            String brand = sc.nextLine();
            System.out.print("Model: ");
            String model = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline
            phones[i] = new MobilePhone(brand, model, price);
        }
        System.out.println("\nPhone Details:");
        for (MobilePhone phone : phones) {
            phone.displayDetails();
            System.out.println();
        }
        sc.close();
    }
}