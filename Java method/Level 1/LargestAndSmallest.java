import java.util.Scanner;

public class LargestAndSmallest {

    public static String Compare(int a, int b, int c) {
        int l = 0;
        int s = 0;
        if (a >= b && a >= c) {
            l = a;
            if (b >= c) {
                s = c;
            } else {
                s = b;
            }
        } else if (b >= a && b >= c) {
            l = b;
            if (a >= c) {
                s = c;
            } else {
                s = a;
            }
        } else {
            l = c;
            if (a >= b) {
                s = b;
            } else {
                s = a;
            }
        }
    
        return "The largest number is: " + l + "\nThe smallest number is: " + s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.print("Enter the 3rd number: ");
        int n3 = scanner.nextInt();
        String result = Compare(n1, n2, n3);
        
        System.out.println(result);
        scanner.close();
    }
}