// AdapterPatternDemo.java
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Create instances of the payment gateways
        PayPal payPal = new PayPal();
        Stripe stripe = new Stripe();

        // Create adapters for the payment gateways
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        // Process payments using the adapters
        System.out.println("Using PayPal Adapter:");
        payPalAdapter.processPayment(100.0);

        System.out.println("Using Stripe Adapter:");
        stripeAdapter.processPayment(150.0);
    }
}
