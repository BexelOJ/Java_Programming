public class Java_20261025_42_BurstBalloons {
    static int maxCoins(int[] nums) {
        int n = nums.length;
        int[] a = new int[n + 2];
        a[0] = a[n + 1] = 1;

        System.arraycopy(nums, 0, a, 1, n);

        int[][] dp = new int[n + 2][n + 2];

        for (int len = 1; len <= n; len++) {
            for (int left = 1; left + len - 1 <= n; left++) {
                int right = left + len - 1;

                for (int k = left; k <= right; k++) {
                    int coins = a[left - 1] * a[k] * a[right + 1]
                        + dp[left][k - 1]
                        + dp[k + 1][right];

                    dp[left][right] = Math.max(dp[left][right], coins);
                }
            }
        }

        return dp[1][n];
    }

    public static void main(String[] args) {
        System.out.println(maxCoins(new int[]{3, 1, 5, 8})); // 167
    }
}


