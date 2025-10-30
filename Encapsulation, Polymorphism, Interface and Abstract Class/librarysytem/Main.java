package librarysytem;

import java.util.ArrayList;

public class Main {

public static void manageLibraryItems(ArrayList<LibraryItem> items) {
     System.out.println("\n=== LIBRARY ITEMS SUMMARY ===");

     for (LibraryItem item : items) {
         item.getItemDetails();

         Reservable reservation = null;
         if (item instanceof Book) {
             reservation = new BookReservation();
         } else if (item instanceof Magazine) {
             reservation = new MagazineReservation();
         } else if (item instanceof DVD) {
             reservation = new DVDReservation();
         }

         if (reservation != null) {
             System.out.println("Checking availability: " + (reservation.checkAvailability() ? "Available" : "Not Available"));
             reservation.reserveItem("John Doe");
             System.out.println("Checking availability after reservation: " + (reservation.checkAvailability() ? "Available" : "Not Available"));
         }

     }
 }

 public static void main(String[] args) {
     ArrayList<LibraryItem> items = new ArrayList<>();

     Book b1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", 218);
     Magazine m1 = new Magazine("M101", "National Geographic", "Various", "October 2025");
     DVD d1 = new DVD("D501", "Inception", "Christopher Nolan", 2.5);

     items.add(b1);
     items.add(m1);
     items.add(d1);

     manageLibraryItems(items);
 }
}
