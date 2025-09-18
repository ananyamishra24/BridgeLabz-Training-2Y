interface Insurable {
    double calculateInsurance(int days);
    String getInsuranceDetails();
}

abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    public String getInsurancePolicyNumber() {
        return "Policy-" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }

    public abstract double calculateRentalCost(int days);

    public void displayDetails(int days) {
        double rentalCost = calculateRentalCost(days);
        double insuranceCost = calculateInsurance(days);
        double totalCost = rentalCost + insuranceCost;

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
        System.out.println("Insurance Policy (Hidden): " + getInsurancePolicyNumber());
        System.out.println("Rental Cost for " + days + " days: " + rentalCost);
        System.out.println("Insurance Cost: " + insuranceCost);
        System.out.println("Insurance Details: " + getInsuranceDetails());
        System.out.println("Total Cost: " + totalCost);
        System.out.println("--------------------------------");
    }
}

class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return days * 200;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance: Rs.200/day";
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9;
    }

    @Override
    public double calculateInsurance(int days) {
        return days * 100;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: Rs.100/day";
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getRentalRate() * days;
        if (days > 7) {
            cost *= 0.95;
        }
        return cost;
    }

    @Override
    public double calculateInsurance(int days) {
        return days * 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: Rs.500/day";
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Car("UP32 AB1234", 1500, "CARPOLICY123456");
        Vehicle v2 = new Bike("UP32 XY9876", 500, "BIKEPOLICY654321");
        Vehicle v3 = new Truck("UP32 TR4567", 3000, "TRUCKPOLICY112233");

        Vehicle[] vehicles = {v1, v2, v3};

        int rentalDays = 10;
        for (Vehicle v : vehicles) {
            v.displayDetails(rentalDays);
        }
    }
}
