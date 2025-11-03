package exception_handling;

import java.util.Scanner;
import java.time.LocalDate;

class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String message) {
        super(message);
    }
}

class InvalidMileageException extends Exception {
    public InvalidMileageException(String message) {
        super(message);
    }
}

class Vehicle {
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

public class VehicleMaintainance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
        	System.out.print("Enter vehicle mileage: ");
            int mileage = sc.nextInt();
            System.out.print("Enter next service year: ");
            int year = sc.nextInt();
            System.out.print("Enter next service month: ");
            int month = sc.nextInt();
            System.out.print("Enter next service day: ");
            int day = sc.nextInt();

            LocalDate serviceDate = LocalDate.of(year, month, day);

            Vehicle vehicle = new Vehicle(serviceDate, mileage);

            vehicle.checkMaintenance();
        } 
        catch (InvalidMileageException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (ServiceOverdueException e) {
            System.out.println("Alert: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Invalid input! Please enter valid values.");
        } 
        finally {
            System.out.println("Maintenance check complete.");
        }
        sc.close();
    }
}
