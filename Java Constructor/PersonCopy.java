import java.util.Scanner;


public class PersonCopy{

    private String name;
    private int age;
    private String address;
    private int height;

    public PersonCopy(String name, int age, String address, int height) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.height = height;
    }
    public PersonCopy(PersonCopy p) {
        this.name = p.name;
        this.age = p.age;
        this.address = p.address;
        this.height = p.height;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public int getHeight() {
        return height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, age, address, height:");
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter height:");
        int height = scanner.nextInt();

        PersonCopy originalPerson = new PersonCopy(name, age, address, height);
        PersonCopy copiedPerson = new PersonCopy(originalPerson);

        System.out.println("Original Person:");
        System.out.println("Name: " + originalPerson.getName());
        System.out.println("Age: " + originalPerson.getAge());
        System.out.println("Address: " + originalPerson.getAddress());
        System.out.println("Height: " + originalPerson.getHeight());

        System.out.println("Copied Person:");
        System.out.println("Name: " + copiedPerson.getName());
        System.out.println("Age: " + copiedPerson.getAge());
        System.out.println("Address: " + copiedPerson.getAddress());
        System.out.println("Height: " + copiedPerson.getHeight());

        scanner.close();
    }




}