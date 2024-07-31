import java.util.HashMap;
import java.util.Scanner;

public class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
    }

    // Method to update a product in the inventory
    public void updateProduct(String productId, String productName, int quantity, double price) {
        Product product = products.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to delete a product from the inventory
    public void deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Method to retrieve a product from the inventory
    public Product getProduct(String productId) {
        return products.get(productId);
    }
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit)
        {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice)
            {
                case 1:
                    System.out.print("Enter Product ID: ");
                    String addId = scanner.nextLine();
                    System.out.print("Enter Product Name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter Quantity: ");
                    int addQuantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double addPrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over

                    Product newProduct = new Product(addId, addName, addQuantity, addPrice);
                    inventory.addProduct(newProduct);
                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Product ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter new Product Name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter new Quantity: ");
                    int updateQuantity = scanner.nextInt();
                    System.out.print("Enter new Price: ");
                    double updatePrice = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over

                    inventory.updateProduct(updateId, updateName, updateQuantity, updatePrice);
                    System.out.println("Product updated successfully!");
                    break;

                case 3:
                    System.out.print("Enter Product ID to delete: ");
                    String deleteId = scanner.nextLine();
                    inventory.deleteProduct(deleteId);
                    System.out.println("Product deleted successfully!");
                    break;

                case 4:
                    System.out.print("Enter Product ID to display: ");
                    String displayId = scanner.nextLine();
                    Product product = inventory.getProduct(displayId);
                    if (product != null)
                    {
                        System.out.println("Product ID: " + product.getProductId());
                        System.out.println("Product Name: " + product.getProductName());
                        System.out.println("Quantity: " + product.getQuantity());
                        System.out.println("Price: $" + product.getPrice());
                    }
                    else
                    {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}

