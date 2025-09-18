import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class ZaraBonus {

    // Method to generate salary and years of service for 10 employees
    public static double[][] generateSalaryAndService(int employees) {
        double[][] data = new double[employees][2]; // [salary, years of service]
        Random rand = new Random();

        for (int i = 0; i < employees; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary: 10000 - 99999
            data[i][1] = 1 + rand.nextInt(10);         // Years of service: 1-10
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] oldData) {
        int employees = oldData.length;
        double[][] newData = new double[employees][3]; // [oldSalary, bonus, newSalary]

        for (int i = 0; i < employees; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;

            newData[i][0] = oldSalary;
            newData[i][1] = bonus;
            newData[i][2] = newSalary;
        }
        return newData;
    }

    // Method to calculate totals and display table
    public static void displayResults(double[][] newData) {
        DecimalFormat df = new DecimalFormat("0.00");
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("Emp\tOld Salary\tBonus\t\tNew Salary");
        for (int i = 0; i < newData.length; i++) {
            double oldSalary = newData[i][0];
            double bonus = newData[i][1];
            double newSalary = newData[i][2];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.println((i+1) + "\t" + df.format(oldSalary) + "\t\t" 
                               + df.format(bonus) + "\t\t" + df.format(newSalary));
        }

        System.out.println("\nTotal\t" + df.format(totalOldSalary) + "\t\t" 
                           + df.format(totalBonus) + "\t\t" + df.format(totalNewSalary));
    }

    public static void main(String[] args) {
        int employees = 10;

        // Step 1: Generate salary and service
        double[][] oldData = generateSalaryAndService(employees);

        // Step 2: Calculate bonus and new salary
        double[][] newData = calculateBonusAndNewSalary(oldData);

        // Step 3: Display results in tabular format
        displayResults(newData);
    }
}
