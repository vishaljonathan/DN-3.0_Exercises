// WebApp.java
public class WebApp implements Observer {
    private StockMarket stockMarket;

    public WebApp(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        stockMarket.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Web App Notification: Stock price changed to " + stockMarket.getStockPrice());
    }
}