package librarysytem;

class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String itemId, String title, String author, int numberOfPages) {
        super(itemId, title, author);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}