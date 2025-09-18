// Superclass: Person
class Person1 {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    void performDuties(); // abstract method
}

// Subclass: Chef (inherits Person, implements Worker)
class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes. Specialty: " + specialty);
    }
}

// Subclass: Waiter (inherits Person, implements Worker)
class Waiter extends Person implements Worker {
    private int tableAssigned;

    public Waiter(String name, int id, int tableAssigned) {
        super(name, id);
        this.tableAssigned = tableAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at table " + tableAssigned);
    }
}

// Driver Class
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating objects
        Worker w1 = new Chef("Ravi", 101, "Italian Cuisine");
        Worker w2 = new Waiter("Sneha", 102, 5);

        // Displaying duties
        w1.performDuties();
        w2.performDuties();

        // Optional: display info using instanceof check
        if (w1 instanceof Person) {
            ((Person) w1).displayInfo();
        }
        if (w2 instanceof Person) {
            ((Person) w2).displayInfo();
        }
    }
}
