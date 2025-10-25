import college.student.Student;
import college.faculty.Faculty;

public class Main {
    public static void main(String[] args) {
       
        Student s1 = new Student("Aarav Mehta", 101);
        s1.displayStudentDetails();

        System.out.println("----------------------");

        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");
        f1.displayFacultyDetails();
    }
}
