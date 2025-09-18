// Base Class
class Course {
    protected String courseName;
    protected int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass 1: OnlineCourse
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayInfo() {
        System.out.println("Course: " + courseName + 
                           ", Duration: " + duration + " weeks" +
                           ", Platform: " + platform +
                           ", Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass 2: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // percentage %

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayInfo() {
        System.out.println("Course: " + courseName +
                           ", Duration: " + duration + " weeks" +
                           ", Platform: " + platform +
                           ", Recorded: " + (isRecorded ? "Yes" : "No") +
                           ", Fee: ₹" + fee +
                           ", Discount: " + discount + "%" +
                           ", Final Fee after discount: ₹" + calculateFinalFee());
    }
}

// Main class
public class CourseHierarchy {
    public static void main(String[] args) {
        Course c1 = new Course("Data Structures", 8);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 6, "Coursera", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Machine Learning", 12, "edX", true, 10000, 20);

        // Polymorphism demonstration
        Course[] courses = {c1, c2, c3};

        for (Course c : courses) {
            c.displayInfo();
            System.out.println("-------------------");
        }
    }
}
