package functional_interface;


@FunctionalInterface
interface Cloner {
 Object cloneObject(); 

 default void showCloneMessage() {
     System.out.println("Clone created successfully!");
 }
}


class Product {
 String name;
 double price;

 Product(String name, double price) {
     this.name = name;
     this.price = price;
 }

 void display() {
     System.out.println("Product Name: " + name + ", Price: ₹" + price);
 }
}

public class Clonningprototype {
 public static void main(String[] args) {
 
     Product original = new Product("Laptop", 65000.0);

     System.out.println("=== ORIGINAL PRODUCT ===");
     original.display();

    Cloner productCloner = () -> new Product(original.name, original.price);

     Product cloned = (Product) productCloner.cloneObject();

     System.out.println("\n=== CLONED PRODUCT ===");
     cloned.display();

     productCloner.showCloneMessage();
 }
}
