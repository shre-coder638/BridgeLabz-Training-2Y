package company.main;

import company.payroll.*;
import company.hr.Employee;

public class Main {
 public static void main(String[] args) {
     Employee emp = new Employee(101, "Aarav Mehta", "HR", 50000);

     System.out.println("=== Employee Details Before Bonus ===");
     emp.displayDetails();

     System.out.println("\n=== Processing Payroll ===");
     Payroll payroll = new Payroll();
     payroll.calculateBonus(emp);

     System.out.println("\n=== Employee Details After Bonus ===");
     emp.displayDetails();
 }
}