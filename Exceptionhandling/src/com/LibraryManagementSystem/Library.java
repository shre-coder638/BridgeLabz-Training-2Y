package com.LibraryManagementSystem;


public class Library {
	 String[] books = {"Java", "Python", "C++"};
	 boolean[] available = {true, true, true};
	 int borrowedCount = 0;

	public void borrowBook(String bookTitle)
	         throws BookNotAvailableException, UserLimitExceededException {
	     if (borrowedCount >= 5)
	         throw new UserLimitExceededException("You cannot borrow more than 5 books!");

	     for (int i = 0; i < books.length; i++) {
	         if (books[i].equalsIgnoreCase(bookTitle)) {
	             if (!available[i])
	                 throw new BookNotAvailableException("The book '" + bookTitle + "' is not available!");

	             available[i] = false;
	             borrowedCount++;
	             System.out.println("You borrowed: " + books[i]);
	             return;
	         }
	     }
	     System.out.println("Book not found!");
	 }
	
	public void returnBook(String bookTitle) throws InvalidReturnException {
	     for (int i = 0; i < books.length; i++) {
	         if (books[i].equalsIgnoreCase(bookTitle)) {
	             if (available[i])
	                 throw new InvalidReturnException("You didn’t borrow this book!");

	             available[i] = true;
	             borrowedCount--;
	             System.out.println("You returned: " + books[i]);
	             return;
	         }
	     }
	     System.out.println("Book not found!");
	 }
	}
