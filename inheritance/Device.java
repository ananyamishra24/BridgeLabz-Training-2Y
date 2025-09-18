// Superclass Device
class Device {
    String deviceId;
    String status;  // e.g., "ON" or "OFF"

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display status (can be overridden)
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat
class Thermostat extends Device {
    int temperatureSetting;  // temperature in °C

    // Constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);  // call Device constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus
    @Override
    public void displayStatus() {
        super.displayStatus();  // show base details
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println("-----------------------------");
    }
}

// Driver Class
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create a Thermostat object
        Thermostat t1 = new Thermostat("THERMO123", "ON", 24);
        Thermostat t2 = new Thermostat("THERMO456", "OFF", 18);

        // Display device status
        t1.displayStatus();
        t2.displayStatus();
    }
}
