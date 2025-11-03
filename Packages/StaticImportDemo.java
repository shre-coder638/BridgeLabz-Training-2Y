package package_assignment;

import static java.lang.Math.*;  

public class StaticImportDemo {
    public static void main(String[] args) {

        double num1 = 25.0;
        double num2 = -10.5;
        double base = 2;
        double exponent = 5;

        System.out.println("Demonstrating Static Import from java.lang.Math\n");

        System.out.println("Square root of " + num1 + " = " + sqrt(num1));
        System.out.println("Power (" + base + "^" + exponent + ") = " + pow(base, exponent));
        System.out.println("Absolute value of " + num2 + " = " + abs(num2));
        System.out.println("Maximum of 15 and 30 = " + max(15, 30));
        System.out.println("Minimum of 15 and 30 = " + min(15, 30));
    }
}