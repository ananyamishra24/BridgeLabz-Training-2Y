import java.util.Scanner;

public class LineAndDistance {

    // Method to calculate Euclidean distance
    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find slope and y-intercept of the line
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2]; // [slope, y-intercept]
        if (x2 == x1) { // vertical line
            equation[0] = Double.POSITIVE_INFINITY;
            equation[1] = Double.NaN;
        } else {
            double m = (y2 - y1) / (x2 - x1);
            double b = y1 - m * x1;
            equation[0] = m;
            equation[1] = b;
        }
        return equation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter point 1 (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter point 2 (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = euclideanDistance
