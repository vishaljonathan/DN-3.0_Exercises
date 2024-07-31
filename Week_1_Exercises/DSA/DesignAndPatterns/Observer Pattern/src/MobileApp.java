// MobileApp.java
public class MobileApp implements Observer {
    private StockMarket stockMarket;

    public MobileApp(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        stockMarket.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Mobile App Notification: Stock price changed to " + stockMarket.getStockPrice());
    }
}
