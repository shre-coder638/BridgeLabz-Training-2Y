package onlineshopping;

public class Gadget implements Category {
    private final String name;
    private final double min, max;

    public Gadget(String name, double min, double max) {
        this.name = name;
        this.min = min;
        this.max = max;
    }

    public String getName() { return name; }
    public double minPrice() { return min; }
    public double maxPrice() { return max; }

    public String toString() { return "Gadget(" + name + ")"; }
}