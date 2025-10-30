package ride_hailing;

abstract class Vehicle {

 private String vehicleId;
 private String driverName;
 private double ratePerKm;

 public Vehicle(String vehicleId, String driverName, double ratePerKm) {
     this.vehicleId = vehicleId;
     this.driverName = driverName;
     this.ratePerKm = ratePerKm;
 }

  public String getVehicleId() { return vehicleId; }
 public String getDriverName() { return driverName; }
 public double getRatePerKm() { return ratePerKm; }

 protected void setRatePerKm(double ratePerKm) {
     this.ratePerKm = ratePerKm;
 }

public abstract double calculateFare(double distance);

public void getVehicleDetails() {
     System.out.println("Vehicle ID: " + vehicleId);
     System.out.println("Driver Name: " + driverName);
     System.out.println("Rate per Km: " + ratePerKm);
 }
}
