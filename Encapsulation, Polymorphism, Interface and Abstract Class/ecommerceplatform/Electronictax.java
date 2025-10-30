package ecommerceplatform;

class ElectronicsTax implements Taxable {
    @Override
    public double calculateTax(double price) {
        return price * 0.15; 
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 15%";
    }
}

class ClothingTax implements Taxable {
    @Override
    public double calculateTax(double price) {
        return price * 0.05; 
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}