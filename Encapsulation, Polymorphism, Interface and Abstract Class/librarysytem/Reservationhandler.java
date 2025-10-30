package librarysytem;


class BookReservation implements Reservable {
 private boolean isAvailable = true;

 @Override
 public boolean reserveItem(String borrowerName) {
     if (isAvailable) {
         isAvailable = false;
         System.out.println("Book reserved successfully for: " + borrowerName);
         return true;
     }
     System.out.println("Book is already reserved.");
     return false;
 }

 @Override
 public boolean checkAvailability() {
     return isAvailable;
 }
}

class MagazineReservation implements Reservable {
 private boolean isAvailable = true;

 @Override
 public boolean reserveItem(String borrowerName) {
     if (isAvailable) {
         isAvailable = false;
         System.out.println("Magazine reserved successfully for: " + borrowerName);
         return true;
     }
     System.out.println("Magazine is already reserved.");
     return false;
 }

 @Override
 public boolean checkAvailability() {
     return isAvailable;
 }
}

class DVDReservation implements Reservable {
 private boolean isAvailable = true;

 @Override
 public boolean reserveItem(String borrowerName) {
     if (isAvailable) {
         isAvailable = false;
         System.out.println("DVD reserved successfully for: " + borrowerName);
         return true;
     }
     System.out.println("DVD is already reserved.");
     return false;
 }

 @Override
 public boolean checkAvailability() {
     return isAvailable;
 }
}
