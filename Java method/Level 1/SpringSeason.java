import java.util.Scanner;

public class SpringSeason {

    public static boolean Season(int a, int b) {
        if ((a >= 3 && a <= 6) && ( b <= 20)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the day: ");
        int n2 = scanner.nextInt();
        boolean result = Season(n1, n2);
    
        System.out.printf("%b", result);
        
        scanner.close();
    }
}