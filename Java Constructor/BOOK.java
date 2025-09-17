
public class BOOK{
    private String title;
    private String author;
    private double price;

    // Parameterized Constructor
    BOOK(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // Default Constructor
    BOOK(){
        title = "";
        author = "";
        price = 0.0;
    }

    void displayOrderDetails() {
     System.out.println("Title: " + title);
     System.out.println("Author: "+ author);
     System.out.println("Price: "+ price);
    }
    public static void main(String[] args) {
        BOOK book1 = new BOOK("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        BOOK book2 = new BOOK("Lord of Mysteries", "Cuttlefish That Loves Diving", 15.49);

        System.out.println("Book 1 Details:");
        book1.displayOrderDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayOrderDetails();
    }
} 