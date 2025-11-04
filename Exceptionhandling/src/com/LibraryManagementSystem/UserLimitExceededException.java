package com.LibraryManagementSystem;

public class UserLimitExceededException extends Exception {
	 public UserLimitExceededException(String message) {
	     super(message);
	 }
}