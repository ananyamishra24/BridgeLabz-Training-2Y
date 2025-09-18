import java.util.Scanner;

public class CollinearPoints {

    // Check collinear using slope formula
    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Slope of AB = (y2 - y1)/(x2 - x1)
        // Slope of BC = (y3 - y2)/(x3 - x2)
        // Slope of AC = (y3 - y1)/(x3 - x1)
        // To avoid division by zero, we use cross multiplication:
        // (y2 - y1)*(x3 - x2) == (y3 - y2)*(x2 - x1)
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Check collinear using area of triangle formula
    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area = 0.5 * | x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2) |
        double area = 0.5 * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of 3 points:");

        System.out.print("Point A (x1 y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Point B (x2 y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print("Point C (x3 y3): ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        // Check using slope
        boolean collinearSlope = areCollinearSlope(x1, y1, x2, y2, x3, y3);
        // Check using area
        boolean collinearArea = areCollinearArea(x1, y1, x2, y2, x3, y3);

        System.out.println("\nUsing slope method: " + (collinearSlope ? "Collinear" : "Not Collinear"));
        System.out.println("Using area method: " + (collinearArea ? "Collinear" : "Not Collinear"));
    }
}
