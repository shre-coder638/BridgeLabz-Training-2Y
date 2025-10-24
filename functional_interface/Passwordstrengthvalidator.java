package functional_interface;
import java.util.Scanner;

interface SecurityUtils {

static boolean isStrongPassword(String password) {
     boolean hasUpper = false;
     boolean hasLower = false;
     boolean hasDigit = false;
     boolean hasSpecial = false;

     if (password.length() < 8) {
         System.out.println("Password must be at least 8 characters long.");
         return false;
     }

     for (char ch : password.toCharArray()) {
         if (Character.isUpperCase(ch)) hasUpper = true;
         else if (Character.isLowerCase(ch)) hasLower = true;
         else if (Character.isDigit(ch)) hasDigit = true;
         else if ("!@#$%^&*()_+-=[]{}|;:,.<>?".indexOf(ch) >= 0) hasSpecial = true;
     }

     if (hasUpper && hasLower && hasDigit && hasSpecial) {
         return true;
     } else {
         System.out.println("Password must contain:");
         if (!hasUpper) System.out.println(" - at least one uppercase letter");
         if (!hasLower) System.out.println(" - at least one lowercase letter");
         if (!hasDigit) System.out.println(" - at least one digit");
         if (!hasSpecial) System.out.println(" - at least one special character");
         return false;
     }
 }
}

public class Passwordstrengthvalidator {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("=== INSURANCE PORTAL PASSWORD VALIDATOR ===");
     System.out.print("Enter password to validate: ");
     String password = sc.nextLine();

     if (SecurityUtils.isStrongPassword(password)) {
         System.out.println("Password is strong and accepted.");
     } else {
         System.out.println("Please choose a stronger password.");
     }

     sc.close();
 }
}




