package onlineshopping;

import java.util.*;

public class Cataloug {
    private final List<Product<? extends Category>> products = new ArrayList<>();

    public void add(Product<? extends Category> p) { products.add(p); }
    public void remove(Product<? extends Category> p) { products.remove(p); }

    public void displayAll() {
        System.out.println("Catalog contents:");
        for (Product<? extends Category> p : products) {
            System.out.println(" - " + p);
        }
    }

    public List<Product<? extends Category>> getProducts() {
        return new ArrayList<>(products);
    }
}