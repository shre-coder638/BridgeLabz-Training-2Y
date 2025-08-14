import java.util.Scanner;

public class Calculate_Simple_Interest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter Rate of interest:");
        double rate = scanner.nextDouble();

        System.out.println("Enter Time (in years):");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest for Principal " + principal + ", Rate " + rate + "% and Time " + time + " years is: " + simpleInterest);
    }
}