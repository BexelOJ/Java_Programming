public class Java_20261025_19_TargetSumProblem {
    static long countWays(int[] nums, int target) {
        int sum = 0;
        for (int x : nums) sum += x;

        if (Math.abs(target) > sum || (sum + target) % 2 != 0)
            return 0;

        int positiveTarget = (sum + target) / 2;
        long[] dp = new long[positiveTarget + 1];
        dp[0] = 1;

        for (int x : nums) {
            for (int s = positiveTarget; s >= x; s--)
                dp[s] += dp[s - x];
        }

        return dp[positiveTarget];
    }

    public static void main(String[] args) {
        System.out.println(countWays(new int[]{1, 1, 1, 1, 1}, 3)); // 5
    }
}


