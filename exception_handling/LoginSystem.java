package exception_handling;


import java.util.Scanner;

class InvalidCredentialsException extends Exception {
 public InvalidCredentialsException(String message) {
     super(message);
 }
}

class IDcheck {
 public void validate(String user, String pass) throws InvalidCredentialsException {
     String validUser = "admin";
     String validPass = "12345";

     if (!user.equals(validUser) || !pass.equals(validPass)) {
         throw new InvalidCredentialsException("Invalid username or password!");
     }
 }
}

public class LoginSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     IDcheck login = new IDcheck();

     try {
         System.out.print("Enter username: ");
         String user = sc.nextLine();

         System.out.print("Enter password: ");
         String pass = sc.nextLine();

         login.validate(user, pass);
         System.out.println("Login successful!");
     } 
     catch (InvalidCredentialsException e) {
         System.out.println("Error: " + e.getMessage());
     }

     sc.close();
 }
}
