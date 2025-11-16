package fruitbox;

public class Runner {
	public static void main(String[] args) {
		FruitBox<Fruit> box1 = new FruitBox<>();
        box1.addFruit(new Apple());
        box1.addFruit(new Mango());
        box1.displayFruits();

        FruitBox<Apple> box2 = new FruitBox<>();
        box2.addFruit(new Apple());
        box2.displayFruits();
	}
}