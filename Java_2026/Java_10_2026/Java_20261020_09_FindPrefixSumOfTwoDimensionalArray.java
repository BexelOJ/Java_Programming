
public class Java_20261020_09_FindPrefixSumOfTwoDimensionalArray {

    public static long[][] buildPrefixSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = rows == 0 ? 0 : matrix[0].length;

        long[][] prefix = new long[rows + 1][cols + 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                prefix[i + 1][j + 1] =
                        matrix[i][j]
                        + prefix[i][j + 1]
                        + prefix[i + 1][j]
                        - prefix[i][j];
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        long[][] prefix = buildPrefixSum(matrix);

        System.out.println("2D Prefix Sum:");

        for (int i = 1; i < prefix.length; i++) {
            for (int j = 1; j < prefix[i].length; j++) {
                System.out.printf("%4d", prefix[i][j]);
            }
            System.out.println();
        }
    }
}




