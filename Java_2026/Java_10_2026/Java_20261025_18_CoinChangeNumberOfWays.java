public class Java_20261025_18_CoinChangeNumberOfWays {
    static long countWays(int[] coins, int amount) {
        long[] dp = new long[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int s = coin; s <= amount; s++)
                dp[s] += dp[s - coin];
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(countWays(new int[]{1, 2, 5}, 5)); // 4
    }
}


