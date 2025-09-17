import java.util.Scanner;

public class Course {
    // Instance variables
    private String courseName;
    private int duration;
    private double fee;

    // Class variable
    private static String instituteName;

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    // Main method to take input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter institute name: ");
        String instName = sc.nextLine();
        updateInstituteName(instName);

        System.out.print("Enter course name: ");
        String courseName = sc.nextLine();
        System.out.print("Enter duration (months): ");
        int duration = sc.nextInt();
        System.out.print("Enter fee: ");
        double fee = sc.nextDouble();

        Course course = new Course(courseName, duration, fee);
        System.out.println("\nCourse Details:");
        course.displayCourseDetails();
        sc.close();
    }
}
