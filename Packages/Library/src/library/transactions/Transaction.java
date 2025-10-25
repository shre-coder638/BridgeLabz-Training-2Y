package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    public void issueBook(Book book, Member member) {
        if (!book.isIssued()) {
            book.markAsIssued();
            System.out.println(book.getTitle() + " has been issued to " + member.getName() + ".");
        } else {
            System.out.println("Book is already issued!");
        }
    }

    public void returnBook(Book book, Member member) {
        if (book.isIssued()) {
            book.markAsReturned();
            System.out.println(book.getTitle() + " has been returned by " + member.getName() + ".");
        } else {
            System.out.println("Book was not issued.");
        }
    }
}
