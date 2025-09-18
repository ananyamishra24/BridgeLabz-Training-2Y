import java.util.Random;
import java.util.Scanner;

public class MatrixManipulation {

    // Generate a random matrix of given rows and columns
    public static double[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers 0-9
            }
        }
        return matrix;
    }

    // Display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    // Transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // Determinant of 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
             - matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
             + matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
    }

    // Inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Inverse not possible, determinant is 0.");
            return null;
        }
        double[][] inverse = {
            { matrix[1][1]/det, -matrix[0][1]/det },
            { -matrix[1][0]/det, matrix[0][0]/det }
        };
        return inverse;
    }

    // Inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Inverse not possible, determinant is 0.");
            return null;
        }

        double[][] inv = new double[3][3];
        inv[0][0] = (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]) / det;
        inv[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]) / det;
        inv[0][2] = (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]) / det;
        inv[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]) / det;
        inv[1][1] = (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]) / det;
        inv[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]) / det;
        inv[2][0] = (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]) / det;
        inv[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]) / det;
        inv[2][2] = (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]) / det;

        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        if (n != 2 && n != 3) {
            System.out.println("Only 2x2 or 3x3 matrices are supported.");
            return;
        }

        // Generate random matrix
        double[][] matrix = generateRandomMatrix(n, n);

        System.out.println("\nMatrix:");
        displayMatrix(matrix);

        // Transpose
        double[][] transposed = transpose(matrix);
        System.out.println("\nTranspose:");
        displayMatrix(transposed);

        // Determinant
        double det = (n == 2) ? determinant2x2(matrix) : determinant3x3(matrix);
        System.out.printf("\nDeterminant: %.2f\n", det);

        // Inverse
        double[][] inverse = (n == 2) ? inverse2x2(matrix) : inverse3x3(matrix);
        if (inverse != null) {
            System.out.println("\nInverse:");
            displayMatrix(inverse);
        }

        sc.close();
    }
}
