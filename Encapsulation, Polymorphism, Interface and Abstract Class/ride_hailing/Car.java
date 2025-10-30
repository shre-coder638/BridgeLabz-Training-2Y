package ride_hailing;

class Car extends Vehicle {
    private double baseFare = 50;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * getRatePerKm());
    }
}