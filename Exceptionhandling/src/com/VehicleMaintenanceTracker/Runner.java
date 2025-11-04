package com.VehicleMaintenanceTracker;

import java.time.LocalDate;
import java.util.Scanner;


public class Runner {
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
