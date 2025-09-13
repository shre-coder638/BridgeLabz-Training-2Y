public class Book2 {
    public String ISBN;
    protected String title;
    private String author;

    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }
}

class EBook extends Book2 {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayInfo() {
        System.out.println("ISBN: " + ISBN); // public access
        System.out.println("Title: " + title); // protected access
        //System.out.println("Author: " + author); // private, not accessible
    }
}

class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        EBook ebook = new EBook(isbn, title, author);
        ebook.displayInfo();

        System.out.print("Enter new author name to update: ");
        String newAuthor = scanner.nextLine();
        if (newAuthor.trim().isEmpty()) {
            System.out.println("Okay.");
        } else {
        ebook.setAuthor(newAuthor);
        System.out.println("Updated Author: " + ebook.getAuthor());
        }

        scanner.close();
    }
}
