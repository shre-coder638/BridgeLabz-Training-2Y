package ride_hailing;

class CarGPS implements GPS {
 private String currentLocation = "Unknown";

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
     System.out.println("Car GPS updated to: " + newLocation);
 }
}

class BikeGPS implements GPS {
 private String currentLocation = "Unknown";

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
     System.out.println("Bike GPS updated to: " + newLocation);
 }
}

class AutoGPS implements GPS {
 private String currentLocation = "Unknown";

 @Override
 public String getCurrentLocation() {
     return currentLocation;
 }

 @Override
 public void updateLocation(String newLocation) {
     this.currentLocation = newLocation;
     System.out.println("Auto GPS updated to: " + newLocation);
 }
}
