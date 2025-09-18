interface Reservable {
    void reserveItem(String borrower);
    String checkAvailability();
}

abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrower;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected String getBorrower() {
        return borrower;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
        System.out.println("Availability: " + checkAvailability());
        System.out.println("--------------------------------");
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrower = borrower;
            System.out.println(title + " reserved by " + borrower);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    @Override
    public String checkAvailability() {
        return isReserved ? "Reserved by " + borrower : "Available";
    }
}

class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine("M201", "Tech Monthly", "Editorial Team");
        LibraryItem item3 = new DVD("D301", "Inception", "Christopher Nolan");

        LibraryItem[] items = {item1, item2, item3};

        for (LibraryItem item : items) {
            item.getItemDetails();
        }

        item1.reserveItem("Akshay");
        item2.reserveItem("Rahul");
        item3.reserveItem("Neha");

        for (LibraryItem item : items) {
            item.getItemDetails();
        }
    }
}
