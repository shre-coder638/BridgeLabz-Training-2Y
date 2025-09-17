import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        movieName = sc.nextLine();
        System.out.print("Enter seat number: ");
        seatNumber = sc.nextInt();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }

    public void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: Rs. " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.inputDetails();
        ticket.displayDetails();
        // Example of booking a ticket using method
        // ticket.bookTicket("Avengers", 12, 250.0);
        // ticket.displayDetails();
    }
}
