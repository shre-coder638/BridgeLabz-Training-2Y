package exception_handling;

import java.util.*;

class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

class FlightBooking {

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

public class FlightBookingSystem {
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
