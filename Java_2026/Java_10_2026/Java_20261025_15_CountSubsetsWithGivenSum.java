public class Java_20261025_15_CountSubsetsWithGivenSum {
    static long count(int[] a, int target) {
        long[] dp = new long[target + 1];
        dp[0] = 1;

        for (int x : a) {
            for (int s = target; s >= x; s--)
                dp[s] += dp[s - x];
        }

        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 3, 3}, 6)); // 3
    }
}


