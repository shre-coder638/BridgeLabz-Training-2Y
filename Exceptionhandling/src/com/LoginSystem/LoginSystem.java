package com.LoginSystem;


public class LoginSystem {
	static void validate(String user, String pass) throws InvalidCredentialsException {
	     String validUser = "admin";
	     String validPass = "12345";

	     if (!user.equals(validUser) || !pass.equals(validPass)) {
	         throw new InvalidCredentialsException("Invalid username or password!");
	     }
	 }
}