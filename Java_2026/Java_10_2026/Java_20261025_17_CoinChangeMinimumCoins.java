import java.util.Arrays;

public class Java_20261025_17_CoinChangeMinimumCoins {
    static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int s = coin; s <= amount; s++)
                dp[s] = Math.min(dp[s], dp[s - coin] + 1);
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(minCoins(new int[]{1, 2, 5}, 11)); // 3
    }
}


