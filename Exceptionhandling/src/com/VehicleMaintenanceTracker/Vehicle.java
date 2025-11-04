package com.VehicleMaintenanceTracker;

import java.time.LocalDate;

public class Vehicle {
    private LocalDate serviceDate;
    private int mileage;

    public Vehicle(LocalDate serviceDate, int mileage) {
        this.serviceDate = serviceDate;
        this.mileage = mileage;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        LocalDate today = LocalDate.now();

        if (mileage < 0) {
            throw new InvalidMileageException("Invalid mileage! Mileage cannot be negative.");
        }

        if (serviceDate.isBefore(today)) {
            throw new ServiceOverdueException("Service overdue! Please schedule maintenance immediately.");
        }

        System.out.println("Vehicle is in good condition. No service required yet.");
    }
}
