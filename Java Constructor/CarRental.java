
import java.util.Scanner;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    // Method to calculate total cost (example: $50 per day)
    private double calculateTotalCost() {
        double ratePerDay = 50.0;
        return rentalDays * ratePerDay;
    }

    // Getters
    public String getCustomerName() { return customerName; }
    public String getCarModel() { return carModel; }
    public int getRentalDays() { return rentalDays; }
    public double getTotalCost() { return totalCost; }

    // Main method for user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter number of rental days: ");
        int days = scanner.nextInt();

        CarRental rental = new CarRental(name, model, days);
        System.out.println("\nRental Details:");
        System.out.println("Customer Name: " + rental.getCustomerName());
        System.out.println("Car Model: " + rental.getCarModel());
        System.out.println("Rental Days: " + rental.getRentalDays());
        System.out.println("Total Cost: $" + rental.getTotalCost());
    }
}