import java.util.Scanner;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for required parameters
        System.out.print("Enter CPU: ");
        String cpu = scanner.nextLine();

        System.out.print("Enter RAM: ");
        String ram = scanner.nextLine();

        // Creating a Computer.Builder with required parameters
        Computer.Builder computerBuilder = new Computer.Builder(cpu, ram);

        // Get input for optional parameters
        System.out.print("Enter Storage (default: 256GB SSD): ");
        String storage = scanner.nextLine();
        if (!storage.isEmpty()) {
            computerBuilder.setStorage(storage);
        }

        System.out.print("Enter Graphics Card (default: Integrated): ");
        String graphicsCard = scanner.nextLine();
        if (!graphicsCard.isEmpty()) {
            computerBuilder.setGraphicsCard(graphicsCard);
        }

        System.out.print("Does it have WiFi? (yes/no, default: yes): ");
        String hasWiFiInput = scanner.nextLine();
        if (!hasWiFiInput.isEmpty()) {
            boolean hasWiFi = hasWiFiInput.equalsIgnoreCase("yes");
            computerBuilder.setHasWiFi(hasWiFi);
        }

        // Build the computer object
        Computer computer = computerBuilder.build();

        // Display the configured Computer object
        System.out.println("\nConfigured Computer:");
        System.out.println("CPU: " + computer.getCPU());
        System.out.println("RAM: " + computer.getRAM());
        System.out.println("Storage: " + computer.getStorage());
        System.out.println("Graphics Card: " + computer.getGraphicsCard());
        System.out.println("WiFi: " + (computer.hasWiFi() ? "Yes" : "No"));

        scanner.close();
    }
}
