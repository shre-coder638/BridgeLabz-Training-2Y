import java.util.Scanner;


class Person {
    private String guestName;
    private String address;
    private int nights;

    public Person(String guestName, String address, int nights) {
        this.guestName = guestName;
        this.address = address;
        this.nights = nights;
    }

    public Person(Person p) {
        this.guestName = p.guestName;
        this.address = p.address;
        this.nights = p.nights;
    }

    public String getName() {
        return guestName;
    }

    public String getAddress() {
        return address;
    }

    public int getNights() {
        return nights;
    }
}

public class HotelBookingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter nights:");
        int nights = scanner.nextInt();

        Person originalPerson = new Person(name, address, nights);
        Person copiedPerson = new Person(originalPerson);

        System.out.println("Booking accepted:");
        System.out.println("Name: " + originalPerson.getName());
        System.out.println("Address: " + originalPerson.getAddress());
        System.out.println("Nights: " + originalPerson.getNights());
        scanner.close();
    }
}