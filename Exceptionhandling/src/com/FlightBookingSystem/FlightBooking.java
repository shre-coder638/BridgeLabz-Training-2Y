package com.FlightBookingSystem;

import java.util.Random;



public class FlightBooking {

    Random rand = new Random();

    public void checkSeatAvailability(String seatNo) throws SeatUnavailableException {
        if (rand.nextBoolean()) {
            throw new SeatUnavailableException("Seat " + seatNo + " is not available!");
        }
        System.out.println("Seat " + seatNo + " is available.");
    }

    public void processPayment(double amount) throws PaymentFailedException {
        if (rand.nextBoolean()) {
            throw new PaymentFailedException("Payment failed! Please try again.");
        }
        System.out.println("Payment of ₹" + amount + " successful.");
    }

    public void bookTicket(String seatNo, double amount) throws Exception {
        checkSeatAvailability(seatNo);
        processPayment(amount);
        System.out.println("Flight ticket booked successfully!");
    }
}