public class Java_20261025_40_DungeonGame {
    static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length, n = dungeon[0].length;
        int[][] dp = new int[m + 1][n + 1];

        for (int[] row : dp)
            java.util.Arrays.fill(row, Integer.MAX_VALUE);

        dp[m][n - 1] = 1;
        dp[m - 1][n] = 1;

        for (int r = m - 1; r >= 0; r--) {
            for (int c = n - 1; c >= 0; c--) {
                int need = Math.min(dp[r + 1][c], dp[r][c + 1])
                    - dungeon[r][c];

                dp[r][c] = Math.max(1, need);
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] dungeon = {
            {-2, -3,  3},
            {-5, -10, 1},
            {10,  30, -5}
        };

        System.out.println(calculateMinimumHP(dungeon)); // 7
    }
}


