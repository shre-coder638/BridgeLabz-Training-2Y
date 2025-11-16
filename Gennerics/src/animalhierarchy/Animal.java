package animalhierarchy;


public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Some animal sound");
    }

    public String toString() {
        return name;
    }
}