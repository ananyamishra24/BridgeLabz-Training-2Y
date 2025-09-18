abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.currentLocation = currentLocation;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    protected void setCurrentLocation(String newLocation) {
        this.currentLocation = newLocation;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId + ", Driver: " + driverName + 
                           ", Rate/km: " + ratePerKm + ", Location: " + currentLocation);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8;
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm, currentLocation);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() {
        return super.getCurrentLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}

public class RideHailingApp {
    public static void processRide(Vehicle vehicle, double distance) {
        vehicle.getVehicleDetails();
        double fare = vehicle.calculateFare(distance);
        System.out.println("Fare for distance " + distance + " km: " + fare);
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle car = new Car("C101", "Amit Sharma", 15, "Connaught Place");
        Vehicle bike = new Bike("B201", "Rohit Singh", 10, "Rajiv Chowk");
        Vehicle auto = new Auto("A301", "Sunil Kumar", 12, "Karol Bagh");

        processRide(car, 12.5);
        processRide(bike, 8.0);
        processRide(auto, 5.0);

        ((GPS)car).updateLocation("India Gate");
        System.out.println("Car new location: " + ((GPS)car).getCurrentLocation());
    }
}
