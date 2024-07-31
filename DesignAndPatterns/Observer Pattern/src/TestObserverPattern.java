// TestObserverPattern.java
public class TestObserverPattern {
    public static void main(String[] args) {
        // Create a StockMarket (Concrete Subject)
        StockMarket stockMarket = new StockMarket();

        // Create Observers
        MobileApp mobileApp = new MobileApp(stockMarket);
        WebApp webApp = new WebApp(stockMarket);

        // Update the stock price
        stockMarket.setStockPrice(100.50); // Both observers will be notified

        // Change stock price
        stockMarket.setStockPrice(105.75); // Both observers will be notified
    }
}
