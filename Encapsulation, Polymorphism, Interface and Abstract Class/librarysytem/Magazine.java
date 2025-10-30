package librarysytem;

class Magazine extends LibraryItem {
    private String issueMonth;

    public Magazine(String itemId, String title, String author, String issueMonth) {
        super(itemId, title, author);
        this.issueMonth = issueMonth;
    }

    @Override
    public int getLoanDuration() {
        return 7; 
    }
}