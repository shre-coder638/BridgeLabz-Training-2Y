package com.MovieTicketBooking;


public class Runner {
	public static void main(String[] args) {
	     MovieBooking booking = new MovieBooking();

	     try {
	         booking.bookSeat("A2"); 
	     } catch (Exception e) {
	         System.out.println("Error: " + e.getMessage());
	     }

	     try {
	         booking.bookSeat("A2"); 
	     } catch (Exception e) {
	         System.out.println("Error: " + e.getMessage());
	     }


	     try {
	         booking.bookSeat("B1");
	     } catch (Exception e) {
	         System.out.println("Error: " + e.getMessage());
	     }

	     System.out.println("Booking process completed.");
	 }
}
