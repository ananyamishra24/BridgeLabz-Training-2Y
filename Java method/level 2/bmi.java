import java.util.Scanner;

public class bmi {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0; // convert cm to meters
        return weight / (heightMeters * heightMeters);
    }

    // Method to return BMI Status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array: 10 rows (people), 3 cols (weight, height, bmi)
        double[][] data = new double[10][3];
        String[] bmiStatus = new String[10]; // to store BMI status

        // Taking input for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");
            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();

            // Calculate BMI and store in 3rd column
            data[i][2] = calculateBMI(data[i][0], data[i][1]);

            // Get status
            bmiStatus[i] = getBMIStatus(data[i][2]);
        }

        // Display results
        System.out.println("\n--- BMI Results ---");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", 
                data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        sc.close();
    }
}

