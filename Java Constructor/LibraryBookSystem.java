import java.util.Scanner;

public class LibraryBookSystem {
    private String title;
    private String author;
    private int price;
    private int availability;

    public LibraryBookSystem(String title, String author, int price, int availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Copy constructor
    public LibraryBookSystem(LibraryBookSystem other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.availability = other.availability;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailability() {
        return availability;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter price:");
        int price = scanner.nextInt();
        System.out.println("Enter availability:");
        int availability = scanner.nextInt();

        LibraryBookSystem originalbook = new LibraryBookSystem(title, author, price, availability);
        LibraryBookSystem copiedbook = new LibraryBookSystem(originalbook);

        System.out.println("Book:");
        System.out.println("Title: " + originalbook.getTitle());
        System.out.println("Author: " + originalbook.getAuthor());
        System.out.println("Price: " + originalbook.getPrice());
        System.out.println("Availability: " + originalbook.getAvailability());
        scanner.close();
    }
}