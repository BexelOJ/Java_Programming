public class Java_20261025_38_MinimumFallingPathSum {
    static int minFallingPathSum(int[][] a) {
        int n = a.length;
        int[][] dp = new int[n][n];

        for (int c = 0; c < n; c++)
            dp[0][c] = a[0][c];

        for (int r = 1; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int best = dp[r - 1][c];

                if (c > 0)
                    best = Math.min(best, dp[r - 1][c - 1]);

                if (c + 1 < n)
                    best = Math.min(best, dp[r - 1][c + 1]);

                dp[r][c] = a[r][c] + best;
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int x : dp[n - 1]) answer = Math.min(answer, x);

        return answer;
    }

    public static void main(String[] args) {
        int[][] a = {
            {2, 1, 3},
            {6, 5, 4},
            {7, 8, 9}
        };

        System.out.println(minFallingPathSum(a)); // 13
    }
}


