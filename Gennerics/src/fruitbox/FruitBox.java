package fruitbox;

public class FruitBox<T extends Fruit> {

    private java.util.ArrayList<T> list = new java.util.ArrayList<>();

    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public void displayFruits() {
        System.out.println("Fruits in box: " + list);
    }
}