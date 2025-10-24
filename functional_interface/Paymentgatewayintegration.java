package functional_interface;

@FunctionalInterface
interface PaymentProcessor {
    void processPayment(double amount);
    
    default void refund(double amount) {
        System.out.println("Refund feature not supported for this provider.");
    }
}

public class Paymentgatewayintegration {
    public static void main(String[] args) {

        PaymentProcessor paypal = amount -> System.out.println("Paid ₹" + amount + " using PayPal.");
        PaymentProcessor stripe = amount -> System.out.println("Paid ₹" + amount + " using Stripe.");
        PaymentProcessor razorpay = amount -> System.out.println("Paid ₹" + amount + " using Razorpay.");

        PaymentProcessor paypalWithRefund = new PaymentProcessor() {

        	public void processPayment(double amount) {
                System.out.println("Paid ₹" + amount + " using PayPal.");
            }

            public void refund(double amount) {
                System.out.println("Refunded ₹" + amount + " via PayPal.");
            }
        };

        System.out.println("\n=== PAYMENT PROCESSING ===");
        paypal.processPayment(500);
        stripe.processPayment(800);
        razorpay.processPayment(1000);

        System.out.println("\n=== REFUND PROCESSING ===");
        paypalWithRefund.refund(200); 
        stripe.refund(150);           
    }
}
