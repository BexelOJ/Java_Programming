public class Java_20261025_12_UnboundedKnapsackProblem {
    static int knapsack(int[] wt, int[] val, int capacity) {
        int[] dp = new int[capacity + 1];

        for (int i = 0; i < wt.length; i++) {
            for (int w = wt[i]; w <= capacity; w++) {
                dp[w] = Math.max(dp[w], dp[w - wt[i]] + val[i]);
            }
        }
        return dp[capacity];
    }

    public static void main(String[] args) {
        System.out.println(knapsack(
            new int[]{2, 3, 4},
            new int[]{4, 5, 7}, 7)); // 13
    }
}


