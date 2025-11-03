import bank.util.*;     
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double si = InterestCalculator.SI(p, r, t);

        double ci = InterestCalculator.CI(p, r, t);

        System.out.println("Banking System Interest Calculation");
        System.out.println("Principal: " + principal+" Rupees");
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("");
        System.out.println("Simple Interest: " + si+" Rupees");
        System.out.println("Compound Interest: " + ci+" Rupees");
        sc.close();
 }}
