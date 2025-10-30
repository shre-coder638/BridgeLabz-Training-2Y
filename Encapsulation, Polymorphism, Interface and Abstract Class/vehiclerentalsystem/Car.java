package vehiclerentalsystem;

class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String vehicleNumber, double rentalRate, int seatingCapacity) {
        super(vehicleNumber, "Car", rentalRate);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}