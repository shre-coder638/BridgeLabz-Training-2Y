package ride_hailing;

class Bike extends Vehicle {
    private double discountRate = 0.9; 

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return (distance * getRatePerKm()) * discountRate;
    }
}
