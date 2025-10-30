package librarysytem;

class DVD extends LibraryItem {
    private double durationInHours;

    public DVD(String itemId, String title, String author, double durationInHours) {
        super(itemId, title, author);
        this.durationInHours = durationInHours;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}