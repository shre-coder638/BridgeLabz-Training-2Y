package college.main;

import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== College Management System ===\n");


        Student s1 = new Student("Aarav Mehta", 101, "Computer Science");
        Student s2 = new Student("Priya Sharma", 102, "Electronics");


        Faculty f1 = new Faculty("Dr. Rakesh Kumar", "Operating Systems");
        Faculty f2 = new Faculty("Prof. Neha Singh", "Data Structures");


        Department d1 = new Department("Computer Science", 120, 10);
        Department d2 = new Department("Electronics", 90, 8);

        System.out.println("--- Student Details ---");
        s1.displayStudentInfo();
        System.out.println();
        s2.displayStudentInfo();

        System.out.println("\n--- Faculty Details ---");
        f1.displayFacultyInfo();
        System.out.println();
        f2.displayFacultyInfo();

        System.out.println("\n--- Department Details ---");
        d1.displayDepartmentInfo();
        System.out.println();
        d2.displayDepartmentInfo();

        System.out.println("\nCollege Report Generated Successfully!");
    }
}
