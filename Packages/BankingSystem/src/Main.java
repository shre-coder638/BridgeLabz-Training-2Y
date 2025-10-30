import bank.util.*;    
import static java.lang.Math.*;   

public class Main {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5;
        double time = 2;

        double si = InterestCalculator.calculateSimpleInterest(principal, rate, time);

        double ci = InterestCalculator.calculateCompoundInterest(principal, rate, time);

        System.out.println("=== Banking System Interest Calculation ===");
        System.out.println("Principal: ₹" + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("------------------------------------------");
        System.out.println("Simple Interest: ₹" + si);
        System.out.println("Compound Interest: ₹" + ci);
        System.out.println("------------------------------------------");
        System.out.println("Using static import -> pow(2,3) = " + pow(2,3)); 
}}
