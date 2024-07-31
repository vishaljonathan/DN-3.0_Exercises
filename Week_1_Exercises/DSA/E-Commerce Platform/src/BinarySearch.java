import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareTo(targetName);

            if (comparison == 0) {
                return products[mid]; // Product found
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null; // Product not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Product[] products = new Product[numProducts];

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Category: ");
            String category = scanner.nextLine();

            products[i] = new Product(productId, productName, category);
        }

        // Sorting the products array by productName
        Arrays.sort(products, (a, b) -> a.getProductName().compareTo(b.getProductName()));

        // Accepting input for search
        System.out.println("Enter the product name you want to search for:");
        String targetName = scanner.nextLine();

        // Binary Search
        Product result = binarySearch(products, targetName);
        if (result != null) {
            System.out.println("Product found: " + result);
        } else {
            System.out.println("Product not found.");
        }
    }
}
