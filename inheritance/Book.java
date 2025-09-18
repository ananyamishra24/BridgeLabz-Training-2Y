// Superclass Book
class Book {
    String title;
    int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author (inherits Book)
class Author extends Book {
    String name;
    String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call Book constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo(); // reuse Book details
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
        System.out.println("----------------------------");
    }
}

// Driver Class
public class LibraryManagementDemo {
    public static void main(String[] args) {
        // Create objects
        Author a1 = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald",
                               "American novelist widely regarded as one of the greatest writers of the 20th century.");
        Author a2 = new Author("1984", 1949, "George Orwell",
                               "English novelist, essayist, journalist and critic.");

        // Display info
        a1.displayInfo();
        a2.displayInfo();
    }
}
