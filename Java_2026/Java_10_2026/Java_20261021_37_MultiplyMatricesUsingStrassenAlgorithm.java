
import java.util.Arrays;

public class Java_20261021_37_MultiplyMatricesUsingStrassenAlgorithm {

    static int[][] multiply(int[][] a, int[][] b) {
        int n = a.length;

        if (n == 1) {
            return new int[][] {{a[0][0] * b[0][0]}};
        }

        int half = n / 2;

        int[][] a11 = split(a, 0, 0, half);
        int[][] a12 = split(a, 0, half, half);
        int[][] a21 = split(a, half, 0, half);
        int[][] a22 = split(a, half, half, half);

        int[][] b11 = split(b, 0, 0, half);
        int[][] b12 = split(b, 0, half, half);
        int[][] b21 = split(b, half, 0, half);
        int[][] b22 = split(b, half, half, half);

        int[][] m1 = multiply(add(a11, a22), add(b11, b22));
        int[][] m2 = multiply(add(a21, a22), b11);
        int[][] m3 = multiply(a11, subtract(b12, b22));
        int[][] m4 = multiply(a22, subtract(b21, b11));
        int[][] m5 = multiply(add(a11, a12), b22);
        int[][] m6 = multiply(subtract(a21, a11), add(b11, b12));
        int[][] m7 = multiply(subtract(a12, a22), add(b21, b22));

        int[][] c11 = add(subtract(add(m1, m4), m5), m7);
        int[][] c12 = add(m3, m5);
        int[][] c21 = add(m2, m4);
        int[][] c22 = add(subtract(add(m1, m3), m2), m6);

        int[][] result = new int[n][n];

        join(result, c11, 0, 0);
        join(result, c12, 0, half);
        join(result, c21, half, 0);
        join(result, c22, half, half);

        return result;
    }

    static int[][] split(int[][] matrix, int row, int col, int size) {
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix[row + i][col + j];
            }
        }

        return result;
    }

    static int[][] add(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int n = a.length;
        int[][] result = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    static void join(int[][] result, int[][] part, int row, int col) {
        for (int i = 0; i < part.length; i++) {
            for (int j = 0; j < part.length; j++) {
                result[row + i][col + j] = part[i][j];
            }
        }
    }

    static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        if (!isPowerOfTwo(a.length)
                || a.length != b.length) {
            System.out.println("Matrices must have equal square dimensions "
                    + "that are powers of two.");
            return;
        }

        int[][] result = multiply(a, b);

        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}



