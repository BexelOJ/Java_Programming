public class Java_20261025_10_MinimumCostPathInGrid {
    static int minCost(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        int[][] dp = new int[rows][cols];

        dp[0][0] = grid[0][0];

        for (int r = 1; r < rows; r++)
            dp[r][0] = dp[r - 1][0] + grid[r][0];

        for (int c = 1; c < cols; c++)
            dp[0][c] = dp[0][c - 1] + grid[0][c];

        for (int r = 1; r < rows; r++) {
            for (int c = 1; c < cols; c++) {
                dp[r][c] = grid[r][c] +
                    Math.min(dp[r - 1][c], dp[r][c - 1]);
            }
        }

        return dp[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        };

        System.out.println(minCost(grid)); // 7
    }
}


