// University Student Management - Student Class Example
class Student {
    // Static variable shared across all students
    static String universityName = "GLA University";
    static int totalStudents = 0;

    // Final variable ensures roll number cannot be modified once assigned
    final int rollNumber;
    String name;
    String grade;

    // Constructor using "this" to initialize values
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;

        // Increment total student count whenever a new student is created
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled in " + universityName + ": " + totalStudents);
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) { // Using instanceof check
            this.grade = newGrade;
            System.out.println("Grade updated for Roll No. " + rollNumber + " to: " + grade);
        }
    }

    // Method to display student details
    public void displayStudent() {
        if (this instanceof Student) { // Using instanceof check
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("------------------------------");
        }
    }
}

// Driver class
public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student(101, "Akshay", "A");
        Student s2 = new Student(102, "Rahul", "B");
        Student s3 = new Student(103, "Priya", "A");

        // Display details of students
        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        // Update grade of a student
        s2.updateGrade("A+");

        // Display updated details
        s2.displayStudent();

        // Show total students enrolled
        Student.displayTotalStudents();
    }
}
