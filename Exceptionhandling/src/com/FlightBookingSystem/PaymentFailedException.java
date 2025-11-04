package com.FlightBookingSystem;

public class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}