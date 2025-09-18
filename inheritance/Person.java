// Superclass: Person
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("-------------------------");
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        displayInfo();
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        displayInfo();
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}

// Driver Class
public class SchoolSystem {
    public static void main(String[] args) {
        // Creating objects
        Teacher t1 = new Teacher("Mrs. Sharma", 40, "Mathematics");
        Student s1 = new Student("Akshay", 16, "10th Grade");
        Staff st1 = new Staff("Mr. Kumar", 35, "Administration");

        // Display roles
        t1.displayRole();
        s1.displayRole();
        st1.displayRole();
    }
}
