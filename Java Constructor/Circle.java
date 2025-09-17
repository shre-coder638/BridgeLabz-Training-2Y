import java.util.Scanner;


public class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Default radius value
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();
        Circle circle = new Circle(r);
        System.out.println(circle.getRadius());
        scanner.close();
    }
    
}