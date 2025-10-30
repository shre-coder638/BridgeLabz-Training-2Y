package ecommerceplatform;

interface Taxable {
    double calculateTax(double price);
    String getTaxDetails();
}