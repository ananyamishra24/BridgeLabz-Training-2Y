import java.util.Scanner;

public class unitconverter2 {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Choose a conversion (1-6): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the value to convert: ");
        double value = scanner.nextDouble();

        double result = 0;

        switch (choice) {
            case 1:
                result = convertFahrenheitToCelsius(value);
                System.out.println(value + " °F = " + result + " °C");
                break;
            case 2:
                result = convertCelsiusToFahrenheit(value);
                System.out.println(value + " °C = " + result + " °F");
                break;
            case 3:
                result = convertPoundsToKilograms(value);
                System.out.println(value + " pounds = " + result + " kilograms");
                break;
            case 4:
                result = convertKilogramsToPounds(value);
                System.out.println(value + " kilograms = " + result + " pounds");
                break;
            case 5:
                result = convertGallonsToLiters(value);
                System.out.println(value + " gallons = " + result + " liters");
                break;
            case 6:
                result = convertLitersToGallons(value);
                System.out.println(value + " liters = " + result + " gallons");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
