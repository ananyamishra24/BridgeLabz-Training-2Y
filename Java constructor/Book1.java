// Book class definition
class Book1 {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Default availability
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("-------------");
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

// Test class
public class LibraryTest {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("1984", "George Orwell", 250.0);
        Book book2 = new Book("Effective Java", "Joshua Bloch", 450.0);

        // Display details
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();

        System.out.println();

        // Borrowing books
        book1.borrowBook();
        book1.borrowBook(); // Trying to borrow again

        System.out.println();

        // Returning book
        book1.returnBook();
        book1.returnBook(); // Trying to return again

        System.out.println();

        // Display updated details
        book1.displayDetails();
    }
}
