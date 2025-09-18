class Employee {
    // Static members
    private static String companyName = "Tech Solutions Pvt. Ltd.";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id;          // Final → cannot be changed once assigned
    private String designation;

    // Constructor using "this" to resolve ambiguity
    public Employee(String name, int id, String designation) {
        this.name = name;          // "this" resolves naming conflict
        this.id = id;              // Final assigned once
        this.designation = designation;
        totalEmployees++;          // Increment total employees
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID (final): " + id);
        System.out.println("Designation: " + designation);
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Static method to update company name
    public static void setCompanyName(String newName) {
        companyName = newName;
    }
}

// Driver class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create Employee objects
        Employee e1 = new Employee("Akshay", 101, "Software Engineer");
        Employee e2 = new Employee("Rahul", 102, "Project Manager");

        // Display employee details
        e1.displayEmployeeDetails();
        System.out.println("-------------------");
        e2.displayEmployeeDetails();

        System.out.println("===================");
        // Show total employees
        Employee.displayTotalEmployees();

        // Update company name
        Employee.setCompanyName("NextGen Tech Ltd.");

        System.out.println("\nAfter Changing Company Name:");
        e1.displayEmployeeDetails();
        System.out.println("-------------------");
        e2.displayEmployeeDetails();
    }
}
