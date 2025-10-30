package librarysytem;

interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}