// Base Class
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // calling base constructor
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // reuse base details
        System.out.println("Team Size: " + teamSize);
        System.out.println("-----------------------");
    }
}

// Subclass Developer
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("-----------------------");
    }
}

// Subclass Intern
class Intern extends Employee {
    String duration; // e.g., "6 months"

    public Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
        System.out.println("-----------------------");
    }
}

// Driver Class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating objects
        Employee e1 = new Manager("Akshay", 101, 75000, 5);
        Employee e2 = new Developer("Rahul", 102, 60000, "Java");
        Employee e3 = new Intern("Sneha", 103, 20000, "6 months");

        // Polymorphic calls
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
