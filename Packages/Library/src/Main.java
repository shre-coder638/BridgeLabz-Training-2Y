import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Introduction to Java", "James Gosling", "ISBN12345");
        System.out.println("New Book Added");
        b1.displayDetails();

        System.out.println();

        Member m1 = new Member("Aarav Mehta", 101);
        System.out.println("New Member Registered");
        m1.displayDetails();

        System.out.println();

        Transaction t1 = new Transaction();
        System.out.println("Book Issue Transaction");
        t1.issueBook(b1, m1);

        System.out.println();
        b1.displayDetails();  
    }
}
