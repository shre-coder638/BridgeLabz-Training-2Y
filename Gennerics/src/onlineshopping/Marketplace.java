package onlineshopping;

public class Marketplace {
    public static void main(String[] args) {
        Book fiction = new Book("Fiction", 50, 2000);
        Clothing casual = new Clothing("Casual", 100, 5000);
        Gadget phone = new Gadget("Phone", 5000, 200000);

        Product<Book> b1 = new Product<>("The Alchemist", fiction, 300);
        Product<Clothing> c1 = new Product<>("T-Shirt", casual, 800);
        Product<Gadget> g1 = new Product<>("Smartphone X", phone, 70000);

        Cataloug catalog = new Cataloug();
        catalog.add(b1);
        catalog.add(c1);
        catalog.add(g1);

        catalog.displayAll();

        System.out.println("\nApplying discounts:");
        Pricing.applyDiscount(b1, 10);   
        Pricing.applyDiscount(c1, 20);   
        Pricing.applyDiscount(g1, 5);    

        catalog.displayAll();
    }
}