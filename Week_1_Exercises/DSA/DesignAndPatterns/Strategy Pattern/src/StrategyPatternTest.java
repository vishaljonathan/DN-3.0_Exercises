// StrategyPatternTest.java
public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Paying with Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("1234567812345678");
        context.setPaymentStrategy(creditCard);
        context.executePayment(100);

        // Paying with PayPal
        PaymentStrategy payPal = new PayPalPayment("user@example.com");
        context.setPaymentStrategy(payPal);
        context.executePayment(200);
    }
}
