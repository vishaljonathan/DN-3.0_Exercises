import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a TaskLinkedList object
        TaskLinkedList taskList = new TaskLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask Management System:");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Search Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    // Add Task
                    System.out.print("Enter Task ID: ");
                    int taskId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline left-over
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter Task Status: ");
                    String status = scanner.nextLine();

                    taskList.addTask(new Task(taskId, taskName, status));
                    System.out.println("Task added successfully.");
                    break;

                case 2:
                    // Delete Task
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean isDeleted = taskList.deleteTask(deleteId);
                    if (isDeleted) {
                        System.out.println("Task deleted successfully.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    // Traverse Tasks
                    System.out.println("All Tasks:");
                    taskList.traverseTasks();
                    break;

                case 4:
                    // Search Task
                    System.out.print("Enter Task ID to search: ");
                    int searchId = scanner.nextInt();
                    Task foundTask = taskList.searchTask(searchId);
                    if (foundTask != null) {
                        System.out.println("Task found: " + foundTask);
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting Task Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
