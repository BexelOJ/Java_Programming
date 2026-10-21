public class Java_20261025_41_MatrixChainMultiplication {
    static int minMultiplications(int[] dimensions) {
        int n = dimensions.length - 1;
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    long cost = (long) dp[i][k] + dp[k + 1][j]
                        + (long) dimensions[i] * dimensions[k + 1]
                        * dimensions[j + 1];

                    if (cost < dp[i][j])
                        dp[i][j] = (int) cost;
                }
            }
        }

        return n <= 1 ? 0 : dp[0][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(
            minMultiplications(new int[]{40, 20, 30, 10, 30})
        ); // 26000
    }
}


