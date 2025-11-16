package genericcart;

public class ShoppingCart {

	 public static void main(String[] args) {

	     Cart<Electronics> electronicsCart = new Cart<>();
	     electronicsCart.addItem(new Electronics("Laptop"));
	     electronicsCart.addItem(new Electronics("Smartphone"));
	     electronicsCart.displayItems();

	     System.out.println();

	     Cart<Clothing> clothingCart = new Cart<>();
	     clothingCart.addItem(new Clothing("T-Shirt"));
	     clothingCart.addItem(new Clothing("Jeans"));
	     clothingCart.displayItems();

	     System.out.println();
	 }
	}
