import java.util.Scanner;

public class unitconverter1 {

    // Convert Yards to Feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert Feet to Yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert Meters to Inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert Inches to Meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert Inches to Centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Choose a conversion (1-5): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = convertYardsToFeet(value);
                System.out.println(value + " yards = " + result + " feet");
                break;
            case 2:
                result = convertFeetToYards(value);
                System.out.println(value + " feet = " + result + " yards");
                break;
            case 3:
                result = convertMetersToInches(value);
                System.out.println(value + " meters = " + result + " inches");
                break;
            case 4:
                result = convertInchesToMeters(value);
                System.out.println(value + " inches = " + result + " meters");
                break;
            case 5:
                result = convertInchesToCentimeters(value);
                System.out.println(value + " inches = " + result + " centimeters");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
