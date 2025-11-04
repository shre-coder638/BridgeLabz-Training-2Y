package com.MovieTicketBooking;

public class MovieBooking {
	 String[] seats = {"A1", "A2", "A3", "A4", "A5"};
	 boolean[] isBooked = {false, false, false, false, false};

	public void bookSeat(String seatNumber)
	         throws InvalidSeatException, SeatAlreadyBookedException {

	     for (int i = 0; i < seats.length; i++) {
	         if (seats[i].equalsIgnoreCase(seatNumber)) {
	             if (isBooked[i]) {
	                 throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked!");
	             } else {
	                 isBooked[i] = true;
	                 System.out.println("Seat " + seatNumber + " booked successfully!");
	                 return;
	             }
	         }
	     }
	     throw new InvalidSeatException("Seat " + seatNumber + " does not exist!");
	 }
	}