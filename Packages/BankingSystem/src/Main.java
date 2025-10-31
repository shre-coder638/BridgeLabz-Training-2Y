import bank.util.*;     
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();

        double si = InterestCalculator.calculateSimpleInterest(principal, rate, time);

        double ci = InterestCalculator.calculateCompoundInterest(principal, rate, time);

        System.out.println("=== Banking System Interest Calculation ===");
        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("");
        System.out.println("Simple Interest: ₹" + si);
        System.out.println("Compound Interest: ₹" + ci);
        sc.close();
 }}
