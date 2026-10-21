public class Java_20261025_11_ZeroOneKnapsackProblem {
    static int knapsack(int[] wt, int[] val, int capacity) {
        int[] dp = new int[capacity + 1];

        for (int i = 0; i < wt.length; i++) {
            for (int w = capacity; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - wt[i]] + val[i]);
            }
        }
        return dp[capacity];
    }

    public static void main(String[] args) {
        System.out.println(knapsack(
            new int[]{1, 3, 4, 5},
            new int[]{1, 4, 5, 7}, 7)); // 9
    }
}


