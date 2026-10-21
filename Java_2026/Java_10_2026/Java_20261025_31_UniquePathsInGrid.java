public class Java_20261025_31_UniquePathsInGrid {
    static long uniquePaths(int m, int n) {
        long[] dp = new long[n];
        java.util.Arrays.fill(dp, 1);

        for (int r = 1; r < m; r++)
            for (int c = 1; c < n; c++)
                dp[c] += dp[c - 1];

        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7)); // 28
    }
}


