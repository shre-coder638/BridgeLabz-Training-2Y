package ride_hailing;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}