import java.util.Scanner;

public class MaxHandshakes {

    public static int Handshakes(int n) {
        int Handshakes = (n * (n - 1)) / 2;
        return Handshakes;    
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int n = scanner.nextInt();
        int result = Handshakes(n);
        System.out.println("Maximum number of handshakes: " + result);
        scanner.close();
    }
}