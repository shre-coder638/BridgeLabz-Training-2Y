import java.util.Scanner;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayInfo() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        while (true) {
            System.out.print("Enter Manager ID: ");
            if (sc.hasNextInt()) {
                id = sc.nextInt();
                sc.nextLine(); // consume newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer for Manager ID.");
                sc.nextLine(); // consume invalid input
            }
        }

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        Manager mgr = new Manager(id, dept, sal);
        System.out.println("\nManager Details:");
        mgr.displayInfo();

        System.out.print("\nEnter new salary: ");
        double newSal = sc.nextDouble();
        mgr.setSalary(newSal);
        System.out.println("\nUpdated Manager Details:");
        mgr.displayInfo();
        sc.close();
    }
}