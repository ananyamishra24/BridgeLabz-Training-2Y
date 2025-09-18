// Base Class
class Order {
    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed. Order ID: " + orderId + ", Date: " + orderDate;
    }
}

// Subclass 1: ShippedOrder
class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped. Order ID: " + orderId + 
               ", Date: " + orderDate + 
               ", Tracking Number: " + trackingNumber;
    }
}

// Subclass 2: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered. Order ID: " + orderId +
               ", Date: " + orderDate +
               ", Tracking Number: " + trackingNumber +
               ", Delivery Date: " + deliveryDate;
    }
}

// Main class to test
public class RetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-09-14");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-09-12", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-09-10", "TRK67890", "2025-09-13");

        // Demonstrating polymorphism
        Order[] orders = {order, shippedOrder, deliveredOrder};
        
        for (Order o : orders) {
            System.out.println(o.getOrderStatus());
        }
    }
}
