import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> library = new ArrayList<>();

        // Adding some books to the library
        library.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.add(new Book(2, "1984", "George Orwell"));
        library.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
        library.add(new Book(4, "The Catcher in the Rye", "J.D. Salinger"));
        library.add(new Book(5, "Moby Dick", "Herman Melville"));

        // Sorting the books by title for binary search
        library.sort((b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        System.out.println("Library Search System");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Choose a search method (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        System.out.print("Enter the book title to search: ");
        String title = scanner.nextLine();

        Book foundBook = null;
        switch (choice) {
            case 1:
                foundBook = Library.linearSearchByTitle(library, title);
                break;
            case 2:
                foundBook = Library.binarySearchByTitle(library, title);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }
    }
}