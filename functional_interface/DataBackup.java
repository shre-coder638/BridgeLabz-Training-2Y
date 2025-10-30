package functional_interface;


@FunctionalInterface
interface BackupSerializable {
    void backup();
    
    default void showBackupStatus() {
        System.out.println("Backup process completed successfully.");
    }
}

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class DataBackup {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, 75000.0);
        Student stu = new Student("Bob", 12, 89.5);

        BackupSerializable empBackup = () -> {
            System.out.println("Backing up Employee data...");
            System.out.println("Name: " + emp.name + ", ID: " + emp.id + ", Salary: " + emp.salary);
        };

        BackupSerializable stuBackup = () -> {
            System.out.println("Backing up Student data...");
            System.out.println("Name: " + stu.name + ", Roll No: " + stu.rollNo + ", Marks: " + stu.marks);
        };

        System.out.println("\n=== DATA BACKUP PROCESS ===");
        empBackup.backup();
        empBackup.showBackupStatus();

        System.out.println();
        stuBackup.backup();
        stuBackup.showBackupStatus();
    }
}
