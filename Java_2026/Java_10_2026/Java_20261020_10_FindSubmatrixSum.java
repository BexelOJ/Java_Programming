
public class Java_20261020_10_FindSubmatrixSum {

    public static class MatrixPrefixSum {
        private final long[][] prefix;
        private final int rows;
        private final int cols;

        public MatrixPrefixSum(int[][] matrix) {
            rows = matrix.length;
            cols = rows == 0 ? 0 : matrix[0].length;

            prefix = new long[rows + 1][cols + 1];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    prefix[i + 1][j + 1] =
                            matrix[i][j]
                            + prefix[i][j + 1]
                            + prefix[i + 1][j]
                            - prefix[i][j];
                }
            }
        }

        // Coordinates are inclusive and zero-based.
        public long submatrixSum(
                int row1, int col1, int row2, int col2) {

            if (row1 < 0 || col1 < 0
                    || row2 < row1 || col2 < col1
                    || row2 >= rows || col2 >= cols) {
                throw new IllegalArgumentException(
                        "Invalid submatrix coordinates");
            }

            return prefix[row2 + 1][col2 + 1]
                    - prefix[row1][col2 + 1]
                    - prefix[row2 + 1][col1]
                    + prefix[row1][col1];
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        MatrixPrefixSum ps = new MatrixPrefixSum(matrix);

        System.out.println(
                "Submatrix sum: " + ps.submatrixSum(0, 1, 1, 2));

        System.out.println(
                "Entire matrix sum: " + ps.submatrixSum(0, 0, 2, 3));
    }
}




