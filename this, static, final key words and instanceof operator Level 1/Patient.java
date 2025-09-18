// Patient Class
class Patient {
    // Static variable shared among all patients
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    // Final variable for unique patient ID
    final int patientID;
    String name;
    int age;
    String ailment;

    // Constructor using "this" to initialize values
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // increment patient count when object is created
    }

    // Static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("------ Patient Details ------");
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("-----------------------------");
        }
    }
}

// Driver Class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patients
        Patient p1 = new Patient(101, "Akshay", 22, "Fever");
        Patient p2 = new Patient(102, "Rahul", 30, "Back Pain");

        // Display details
        p1.displayPatientDetails();
        p2.displayPatientDetails();

        // Show total patients
        Patient.getTotalPatients();
    }
}
