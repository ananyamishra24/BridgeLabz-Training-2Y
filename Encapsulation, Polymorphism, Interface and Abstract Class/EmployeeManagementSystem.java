
interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}


abstract class Employee implements Department {
   
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: " + calculateSalary());
        System.out.println("----------------------------");
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}


class FullTimeEmployee extends Employee {
    private double fixedAllowance;

    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedAllowance) {
        super(employeeId, name, baseSalary);
        this.fixedAllowance = fixedAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedAllowance;
    }
}


class PartTimeEmployee extends Employee {
    private int workHours;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        
        Employee emp1 = new FullTimeEmployee(101, "Akshay", 30000, 10000);
        emp1.assignDepartment("IT");

        Employee emp2 = new PartTimeEmployee(102, "Rahul", 10000, 80, 200);
        emp2.assignDepartment("HR");

        Employee emp3 = new FullTimeEmployee(103, "Neha", 35000, 12000);
        emp3.assignDepartment("Finance");

        Employee[] employees = { emp1, emp2, emp3 };


        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
