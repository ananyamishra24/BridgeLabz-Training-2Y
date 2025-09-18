import java.util.ArrayList;
import java.util.List;
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis; 
    private List<String> medicalHistory; 

    public Patient(String patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.medicalHistory = new ArrayList<>();
    }

    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getDiagnosis() {
        return "Diagnosis (Restricted Access): " + diagnosis;
    }

    public void addToMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    public List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); 
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(String patientId, String name, int age, String diagnosis, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String record) {
        addToMedicalHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + getName() + ": " + getMedicalHistory());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, String diagnosis, double consultationFee) {
        super(patientId, name, age, diagnosis);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addToMedicalHistory(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + getName() + ": " + getMedicalHistory());
    }
}

public class HospitalPatientManagement {
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        System.out.println("Billing Amount: " + patient.calculateBill());
        if (patient instanceof MedicalRecord) {
            ((MedicalRecord) patient).viewRecords();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Patient inPatient = new InPatient("P101", "Rahul Sharma", 45, "Pneumonia", 5, 2000);
        Patient outPatient = new OutPatient("P102", "Anita Verma", 30, "Fever", 500);

        inPatient.getPatientDetails();
        ((MedicalRecord) inPatient).addRecord("Admitted for Pneumonia treatment.");
        ((MedicalRecord) inPatient).addRecord("Antibiotics prescribed.");

        outPatient.getPatientDetails();
        ((MedicalRecord) outPatient).addRecord("Consulted for fever.");
        ((MedicalRecord) outPatient).addRecord("Paracetamol prescribed.");

        processPatient(inPatient);
        processPatient(outPatient);
    }
}
