// Shopping Cart System - Product Class Example
class Product {
    // Static variable shared by all products
    static double discount = 5.0; // Default discount percentage

    // Final variable ensures each product has a unique, unchangeable ID
    final int productID;
    String productName;
    double price;
    int quantity;

    // Constructor using "this" to resolve ambiguity
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to calculate total price after discount
    public double calculateTotal() {
        double total = price * quantity;
        double discountedPrice = total - (total * discount / 100);
        return discountedPrice;
    }

    // Method to display product details
    public void displayProduct() {
        if (this instanceof Product) { // Using instanceof
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total (after " + discount + "% discount): " + calculateTotal());
            System.out.println("------------------------------");
        }
    }
}

// Driver class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Creating product objects
        Product p1 = new Product(101, "Laptop", 50000, 1);
        Product p2 = new Product(102, "Headphones", 2000, 2);

        // Displaying details
        p1.displayProduct();
        p2.displayProduct();

        // Updating discount for all products (static effect)
        Product.updateDiscount(10);

        // Displaying details again after discount update
        p1.displayProduct();
        p2.displayProduct();
    }
}
