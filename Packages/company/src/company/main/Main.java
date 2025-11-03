package company.main;

import company.payroll.*;
import company.hr.Employee;

public class Main {
 public static void main(String[] args) {
     Employee emp = new Employee(101, "Aarav Mehta", "HR", 50000);

     System.out.println("Employee Details Before Bonus");
     emp.displayDetails();

     System.out.println("\nProcessing Payroll");
     Payroll payroll = new Payroll();
     payroll.calculateBonus(emp);

     System.out.println("\nEmployee Details After Bonus");
     emp.displayDetails();
 }
}