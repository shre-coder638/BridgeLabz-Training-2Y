package college.department;

import static java.lang.Math.*;  

public class Department {
    private String deptName;
    private int numStudents;
    private int numFaculty;

    public Department(String deptName, int numStudents, int numFaculty) {
        this.deptName = deptName;
        this.numStudents = numStudents;
        this.numFaculty = numFaculty;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Students: " + numStudents);
        System.out.println("Faculties: " + numFaculty);
        System.out.println("Student-Faculty Ratio: " + round((double) numStudents / numFaculty)); 
    }
}
