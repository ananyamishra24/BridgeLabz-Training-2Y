import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double baseCm = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / (2.54 * 2.54); // Convert cm² to in²

        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);
    }
}

