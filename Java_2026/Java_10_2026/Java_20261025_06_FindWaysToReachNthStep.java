public class Java_20261025_06_FindWaysToReachNthStep {
    static long ways(int n) {
        if (n < 0) return 0;

        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];

            if (i >= 2) dp[i] += dp[i - 2];
            if (i >= 3) dp[i] += dp[i - 3];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(ways(4)); // 7
    }
}


