public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Specialization: " + specialization);
    }
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter roll number: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            System.out.print("Enter specialization: ");
            String spec = scanner.nextLine();

            PostgraduateStudent pg = new PostgraduateStudent(roll, name, cgpa, spec);
            pg.displayDetails();

            System.out.print("Do you want to update CGPA? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter new CGPA: ");
                double newCgpa = scanner.nextDouble();
                pg.setCGPA(newCgpa);
                System.out.println("Updated details:");
                pg.displayDetails();
            }
            scanner.close();
        }
}
