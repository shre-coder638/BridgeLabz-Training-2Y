package com.FlightBookingSystem;

import java.util.Scanner;


public class Runner {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightBooking booking = new FlightBooking();

        try {
            System.out.print("Enter seat number: ");
            String seatNo = sc.nextLine();

            System.out.print("Enter payment amount: ");
            double amount = sc.nextDouble();

            booking.bookTicket(seatNo, amount);
        } 
        catch (SeatUnavailableException e) {
            System.out.println(e.getMessage());
        } 
        catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } 
        finally {
            System.out.println("Thank you for booking with us!");
            sc.close();
        }
    }

}
