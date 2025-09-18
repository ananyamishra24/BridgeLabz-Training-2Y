
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}


abstract class Product {

    private int productId;
    private String name;
    private double price;


    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

   
    public void printFinalPrice() {
        double discount = calculateDiscount();
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0;
        double finalPrice = price + tax - discount;

        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);

        if (this instanceof Taxable) {
            System.out.println("Tax Details: " + ((Taxable) this).getTaxDetails());
        }

        System.out.println("Final Price: " + finalPrice);
        System.out.println("---------------------------");
    }
}

class Electronics extends Product implements Taxable {
    private double taxRate = 0.18;

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics GST: " + (taxRate * 100) + "%";
    }
}


class Clothing extends Product implements Taxable {
    private double taxRate = 0.05; 

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST: " + (taxRate * 100) + "%";
    }
}


class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
 
}


public class ECommercePlatform {
    public static void main(String[] args) {
       
        Product p1 = new Electronics(201, "Laptop", 60000);
        Product p2 = new Clothing(202, "Jacket", 4000);
        Product p3 = new Groceries(203, "Rice Bag", 1500);

      
        Product[] products = { p1, p2, p3 };

        for (Product product : products) {
            product.printFinalPrice();
        }
    }
}
