package com.FlightBookingSystem;

public class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String msg) {
        super(msg);
    }
}