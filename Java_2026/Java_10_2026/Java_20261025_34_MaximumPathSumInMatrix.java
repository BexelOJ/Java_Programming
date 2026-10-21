public class Java_20261025_34_MaximumPathSumInMatrix {
    static int maxPathSum(int[][] a) {
        int m = a.length, n = a[0].length;
        int[][] dp = new int[m][n];

        for (int c = 0; c < n; c++)
            dp[0][c] = a[0][c];

        for (int r = 1; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int best = dp[r - 1][c];

                if (c > 0)
                    best = Math.max(best, dp[r - 1][c - 1]);

                if (c + 1 < n)
                    best = Math.max(best, dp[r - 1][c + 1]);

                dp[r][c] = a[r][c] + best;
            }
        }

        int answer = Integer.MIN_VALUE;
        for (int x : dp[m - 1]) answer = Math.max(answer, x);

        return answer;
    }

    public static void main(String[] args) {
        int[][] a = {
            {10, 10, 2},
            {1,   5, 1},
            {0,  3, 9}
        };

        System.out.println(maxPathSum(a));
    }
}


