package animalhierarchy;

import java.util.*;

public class Runner {
	public static void printAnimals(List<? extends Animal> animals) {
        for (Animal a : animals) {
            System.out.println(a);
            a.sound();
        }
    }

    public static void main(String[] args) {

        List<Dog> dogList = Arrays.asList(
                new Dog("Bruno"),
                new Dog("Rocky")
        );

        List<Cat> catList = Arrays.asList(
                new Cat("Kitty"),
                new Cat("Snow")
        );

        System.out.println("Dogs:");
        printAnimals(dogList);   

        System.out.println("\nCats:");
        printAnimals(catList);   
    }
}