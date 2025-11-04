package com.VehicleMaintenanceTracker;

public class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}