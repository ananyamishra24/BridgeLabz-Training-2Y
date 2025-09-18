class Book {
    // Static variable shared by all books
    private static String libraryName = "Central City Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn;   // Final: cannot be changed once assigned

    // Constructor using "this" to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;      // this resolves naming conflict
        this.author = author;
        this.isbn = isbn;        // final assigned once
    }

    // Instance method to display book details (with instanceof check)
    public void displayBookDetails() {
        if (this instanceof Book) {   // Using instanceof
            System.out.println("Library Name: " + libraryName);
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN (final): " + isbn);
        } else {
            System.out.println("Invalid object, not a Book instance!");
        }
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    // Static method to update library name
    public static void setLibraryName(String name) {
        libraryName = name;
    }
}

// Driver class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create book objects
        Book b1 = new Book("Java Programming", "Herbert Schildt", "ISBN1001");
        Book b2 = new Book("Effective Java", "Joshua Bloch", "ISBN1002");

        // Display library name
        Book.displayLibraryName();

        System.out.println("---------------------");

        // Display book details
        b1.displayBookDetails();
        System.out.println("---------------------");
        b2.displayBookDetails();

        System.out.println("=====================");

        // Update library name
        Book.setLibraryName("City Public Library");
        System.out.println("After Changing Library Name:");

        b1.displayBookDetails();
        System.out.println("---------------------");
        b2.displayBookDetails();
    }
}
