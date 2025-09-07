import java.util.Random;
import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix of given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // Random numbers from 0 to 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract matrix B from matrix A
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            System.out.println("Multiplication not possible due to incompatible dimensions.");
            return null;
        }

        int[][] result = new int[rowsA][colsB];

        for(int i = 0; i < rowsA; i++) {
            for(int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for(int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        if (matrix == null) return;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for the first matrix
        System.out.print("Enter rows and columns for Matrix A: ");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        // Input dimensions for the second matrix
        System.out.print("Enter rows and columns for Matrix B: ");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        // Generate random matrices
        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        System.out.println("\nMatrix A:");
        displayMatrix(matrixA);

        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);

        // Perform Addition
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nAddition of A and B:");
            displayMatrix(addMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nAddition not possible due to incompatible dimensions.");
        }

        // Perform Subtraction
        if (rowsA == rowsB && colsA == colsB) {
            System.out.println("\nSubtraction of A and B:");
            displayMatrix(subtractMatrices(matrixA, matrixB));
        } else {
            System.out.println("\nSubtraction not possible due to incompatible dimensions.");
        }

        // Perform Multiplication
        System.out.println("\nMultiplication of A and B:");
        int[][] multipliedMatrix = multiplyMatrices(matrixA, matrixB);
        displayMatrix(multipliedMatrix);

        scanner.close();
    }
}
