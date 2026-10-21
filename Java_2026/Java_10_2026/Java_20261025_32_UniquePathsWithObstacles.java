public class Java_20261025_32_UniquePathsWithObstacles {
    static long uniquePaths(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        long[] dp = new long[n];
        dp[0] = grid[0][0] == 0 ? 1 : 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    dp[c] = 0;
                } else if (c > 0) {
                    dp[c] += dp[c - 1];
                }
            }
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        System.out.println(uniquePaths(grid)); // 2
    }
}


