package vehiclerentalsystem;

class CarInsurance implements Insurable {
	    private String policyNumber;

	    public CarInsurance(String policyNumber) {
	        this.policyNumber = policyNumber;
	    }

	    @Override
	    public double calculateInsurance(double rentalRate) {
	        return rentalRate * 0.12; 
	    }

	    @Override
	    public String getInsuranceDetails() {
	        return "Car Insurance Policy: " + policyNumber + " (12%)";
	    }
	}

class BikeInsurance implements Insurable {
    private String policyNumber;

    public BikeInsurance(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateInsurance(double rentalRate) {
        return rentalRate * 0.05; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + policyNumber + " (5%)";
    }
}

class TruckInsurance implements Insurable {
    private String policyNumber;

    public TruckInsurance(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateInsurance(double rentalRate) {
        return rentalRate * 0.20;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + policyNumber + " (20%)";
    }
}
