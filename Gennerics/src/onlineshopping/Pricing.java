package onlineshopping;

public class Pricing {
    public static <P extends Product<?>> void applyDiscount(P product, double percent) {
        if (percent < 0 || percent > 100) { 
        	throw new IllegalArgumentException("Invalid discount percent");
        }
        double discounted = product.getPrice() * (1 - percent / 100.0);
        double finalPrice = Math.max(discounted, product.getCategory().minPrice());
        product.setPrice(finalPrice);
    }
}