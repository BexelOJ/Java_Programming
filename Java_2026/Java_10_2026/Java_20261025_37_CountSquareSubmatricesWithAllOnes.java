public class Java_20261025_37_CountSquareSubmatricesWithAllOnes {
    static int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m][n];
        int total = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] == 1) {
                    if (r == 0 || c == 0) {
                        dp[r][c] = 1;
                    } else {
                        dp[r][c] = 1 + Math.min(
                            dp[r - 1][c - 1],
                            Math.min(dp[r - 1][c], dp[r][c - 1])
                        );
                    }
                    total += dp[r][c];
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 1, 1, 1}
        };

        System.out.println(countSquares(matrix)); // 15
    }
}


