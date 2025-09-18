import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit scores for PCM
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < students; i++) {
            scores[i][0] = 50 + (int)(Math.random() * 51); // Physics 50-100
            scores[i][1] = 50 + (int)(Math.random() * 51); // Chemistry 50-100
            scores[i][2] = 50 + (int)(Math.random() * 51); // Maths 50-100
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // total, average, percentage

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("StuID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i+1) + "\t"); // Student ID
            for (int j = 0; j < 3; j++) System.out.print(scores[i][j] + "\t");
            for (int j = 0; j < 3; j++) System.out.print(results[i][j] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Step 1: Generate random scores
        int[][] scores = generateScores(students);

        // Step 2: Calculate total, average, percentage
        double[][] results = calculateResults(scores);

        // Step 3: Display scorecard
        displayScorecard(scores, results);
    }
}
