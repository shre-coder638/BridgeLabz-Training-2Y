package functional_interface;

@FunctionalInterface
interface SensitiveData {
    void encrypt();  
    default void tagAsSensitive() {
        System.out.println("This data is marked as SENSITIVE and should be encrypted.");
    }
}


class UserData {
    String username;
    String password;

    UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void display() {
        System.out.println("Username: " + username + ", Password: " + password);
    }
}

public class Sensitivedatatagging {
    public static void main(String[] args) {
        UserData user = new UserData("admin", "12345");

        System.out.println("=== ORIGINAL DATA ===");
        user.display();

         SensitiveData encryptor = () -> {
            System.out.println("\nEncrypting sensitive data...");
            String encryptedPass = user.password.replaceAll(".", "*");
            System.out.println("Encrypted Password: " + encryptedPass);
        };

        
        System.out.println("\n=== TAGGING & ENCRYPTION ===");
        encryptor.tagAsSensitive();
        encryptor.encrypt();
    }
}
