// TestProxyPattern.java
public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded and displayed when first requested
        image1.display();

        // Image will be displayed directly from cache without loading again
        image1.display();

        // Image will be loaded and displayed when first requested
        image2.display();

        // Image will be displayed directly from cache without loading again
        image2.display();
    }
}
