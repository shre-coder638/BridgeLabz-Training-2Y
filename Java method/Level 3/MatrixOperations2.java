import java.util.Random;

public class MatrixOperations2 {

    // a. Create a random matrix
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); // values 0–9
            }
        }
        return matrix;
    }

    // b. Transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // c. Determinant of 2x2
    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // d. Determinant of 3x3
    public static int determinant3x3(int[][] m) {
        if (m.length != 3 || m[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3");
        }
        int det = m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        return det;
    }

    // e. Inverse of 2x2
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular, no inverse exists");
        }
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    // f. Inverse of 3x3
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) {
            throw new ArithmeticException("Matrix is singular, no inverse exists");
        }
        double[][] inv = new double[3][3];

        // Cofactor matrix & adjoint
        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double) det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double) det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double) det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double) det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double) det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double) det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double) det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double) det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double) det;

        return inv;
    }

    // g. Display matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f ", val);
            }
            System.out.println();
        }
    }

    // ------------------- Main Method -------------------
    public static void main(String[] args) {
        int[][] M2 = createMatrix(2, 2);
        System.out.println("Random 2x2 Matrix:");
        displayMatrix(M2);
        System.out.println("Determinant 2x2: " + determinant2x2(M2));
        System.out.println("Inverse 2x2:");
        displayMatrix(inverse2x2(M2));

        int[][] M3 = createMatrix(3, 3);
        System.out.println("\nRandom 3x3 Matrix:");
        displayMatrix(M3);
        System.out.println("Determinant 3x3: " + determinant3x3(M3));
        System.out.println("Inverse 3x3:");
        displayMatrix(inverse3x3(M3));

        System.out.println("\nTranspose of 3x3 Matrix:");
        displayMatrix(transposeMatrix(M3));
    }
}
