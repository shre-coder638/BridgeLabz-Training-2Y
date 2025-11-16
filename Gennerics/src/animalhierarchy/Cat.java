package animalhierarchy;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    public void sound() {
        System.out.println(name + " meows");
    }
}