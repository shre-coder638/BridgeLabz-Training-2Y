package vehiclerentalsystem;

class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String vehicleNumber, double rentalRate, double loadCapacity) {
        super(vehicleNumber, "Truck", rentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + (loadCapacity * 10);
    }
}