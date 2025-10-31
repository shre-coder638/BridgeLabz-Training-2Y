package company.payroll;

import company.hr.Employee;  

public class Payroll {
    public void calculateBonus(Employee e) {
        double bonus = e.getSalary() * 0.10;
        double total = e.getSalary() + bonus;
        e.setSalary(total);
        System.out.println("Bonus of 10% added. New Salary: " + total);
    }
}