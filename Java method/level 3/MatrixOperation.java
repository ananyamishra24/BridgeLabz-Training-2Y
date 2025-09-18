import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to generate a random matrix of given rows and columns
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers between 0 and 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for dimensions of matrices
        System.out.print("Enter number of rows for matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter number of columns for matrix A: ");
        int colsA = sc.nextInt();
        System.out.print("Enter number of rows for matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter number of columns for matrix B: ");
        int colsB = sc.nextInt();

        // Generate random matrices
        int[][] matrixA = generateRandomMatrix(rowsA, colsA);
        int[][] matrixB = generateRandomMatrix(rowsB, colsB);

        // Display generated matrices
        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Perform addition if dimensions match
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nAddition of matrices:");
            displayMatrix(addMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nAddition not possible due to dimension mismatch.");
        }

        // Perform subtraction if dimensions match
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nSubtraction of matrices (A - B):");
            displayMatrix(subtractMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nSubtraction not possible due to dimension mismatch.");
        }

        // Perform multiplication if dimensions are compatible
        if (colsA == rowsB) {
            System.out.println("\nMultiplication of matrices (A x B):");
            displayMatrix(multiplyMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nMultiplication not possible due to dimension mismatch.");
        }

        sc.close();
    }
}
