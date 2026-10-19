
public class Java_20261020_45_FindTwoDimensionalPrefixSum {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;
        long[][] prefix = new long[rows + 1][cols + 1];

        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                prefix[r][c] = matrix[r - 1][c - 1]
                        + prefix[r - 1][c]
                        + prefix[r][c - 1]
                        - prefix[r - 1][c - 1];
            }
        }

        System.out.println("2D prefix-sum matrix:");

        for (int r = 0; r <= rows; r++) {
            for (int c = 0; c <= cols; c++) {
                System.out.printf("%4d", prefix[r][c]);
            }
            System.out.println();
        }
    }
}



