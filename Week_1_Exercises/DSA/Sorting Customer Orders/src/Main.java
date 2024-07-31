import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the number of orders
        System.out.print("Enter the number of orders: ");
        int numberOfOrders = scanner.nextInt();
        scanner.nextLine();

        Order[] orders = new Order[numberOfOrders];

        // Accept details for each order
        for (int i = 0; i < numberOfOrders; i++) {
            System.out.print("Enter Order ID: ");
            int orderId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Enter Total Price: ");
            double totalPrice = scanner.nextDouble();
            scanner.nextLine();

            orders[i] = new Order(orderId, customerName, totalPrice);
        }

        // Choose sorting algorithm
        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                BubbleSort.bubbleSort(orders);
                break;
            case 2:
                QuickSort.quickSort(orders, 0, orders.length - 1);
                break;
            default:
                System.out.println("Invalid choice. Please select either 1 or 2.");
                return;
        }

        // Print sorted orders
        System.out.println("Sorted Orders:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.orderId + ", Customer Name: " + order.customerName + ", Total Price: " + order.totalPrice);
        }

        scanner.close();
    }
}
