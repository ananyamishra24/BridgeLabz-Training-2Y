// Vehicle Registration System
class Vehicle {
    // Static variable shared across all vehicles
    static double registrationFee = 5000.0;

    // Final variable to uniquely identify each vehicle
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    // Constructor using "this" to initialize variables
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }

    // Method to display vehicle details with instanceof check
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Vehicle Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
            System.out.println("----------------------------------");
        }
    }
}

// Driver class
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle v1 = new Vehicle("UP32AB1234", "Akshay", "Car");
        Vehicle v2 = new Vehicle("DL08CD5678", "Rahul", "Bike");

        // Display details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(6000.0);

        // Display again after fee update
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
