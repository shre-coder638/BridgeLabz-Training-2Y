import java.util.Scanner;

class Circle {
    private double radius;

    public void inputRadius() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.printf("Area of Circle: %.2f\n", calculateArea());
        System.out.printf("Circumference of Circle: %.2f\n", calculateCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.inputRadius();
        c.display();
    }
}
