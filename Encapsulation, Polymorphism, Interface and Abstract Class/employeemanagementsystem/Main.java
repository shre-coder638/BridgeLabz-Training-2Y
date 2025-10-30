package employeemanagementsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Alice", 50000, 10000);
        emp1.assignDepartment("Finance");

        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Bob", 20000, 80, 150);
        emp2.assignDepartment("IT");

        employees.add(emp1);
        employees.add(emp2);

        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}