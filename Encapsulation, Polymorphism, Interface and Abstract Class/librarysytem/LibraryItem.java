package librarysytem;

abstract class LibraryItem {
 
	private String itemId;
 private String title;
 private String author;
 private String borrowerName; 
 
 public LibraryItem(String itemId, String title, String author) {
     this.itemId = itemId;
     this.title = title;
     this.author = author;
     this.borrowerName = null; }

 public String getItemId() { return itemId; }
 public String getTitle() { return title; }
 public String getAuthor() { return author; }

protected void setBorrowerName(String borrowerName) {
     this.borrowerName = borrowerName;
 }

protected String getBorrowerName() {
     return borrowerName;
 }

public abstract int getLoanDuration();

public void getItemDetails() {
     System.out.println("Item ID: " + itemId);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Loan Duration: " + getLoanDuration() + " days");
     System.out.println("Borrower: " + (borrowerName != null ? borrowerName : "None"));
 }
}
