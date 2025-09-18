// Abstract class FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

// Interface Discountable
interface Discountable {
    double applyDiscount(double totalAmount);
    String getDiscountDetails();
}

// VegItem subclass
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.9; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied on Veg Item.";
    }
}

// NonVegItem subclass
class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra 50 charge for non-veg
    }

    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.85; // 15% discount
    }

    @Override
    public String getDiscountDetails() {
        return "15% discount applied on Non-Veg Item.";
    }
}

// Main class
public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        double total = item.calculateTotalPrice();

        if (item instanceof Discountable) {
            Discountable discountItem = (Discountable) item;
            System.out.println(discountItem.getDiscountDetails());
            total = discountItem.applyDiscount(total);
        }

        System.out.println("Final Price: " + total + "\n");
    }

    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        processOrder(veg);
        processOrder(nonVeg);
    }
}
