package vehiclerentalsystem;

class Bike extends Vehicle {
    private boolean hasHelmet;

    public Bike(String vehicleNumber, double rentalRate, boolean hasHelmet) {
        super(vehicleNumber, "Bike", rentalRate);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; 
    }
}