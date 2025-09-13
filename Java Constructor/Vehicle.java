public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.0; // Default fee

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter owner name: ");
            String owner = scanner.nextLine();
            System.out.print("Enter vehicle type: ");
            String type = scanner.nextLine();
            Vehicle v = new Vehicle(owner, type);
            v.displayVehicleDetails();

            System.out.print("Do you want to update registration fee? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter new registration fee: ");
                double newFee = scanner.nextDouble();
                Vehicle.updateRegistrationFee(newFee);
                v.displayVehicleDetails();
            }
            scanner.close();
        }
}
