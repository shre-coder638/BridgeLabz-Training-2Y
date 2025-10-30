package ride_hailing;

class Auto extends Vehicle {
    private double minimumFare = 30;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distance) {
        double fare = distance * getRatePerKm();
        return fare < minimumFare ? minimumFare : fare;
    }
}