public class Java_20261025_14_EqualSumPartitionProblem {
    static boolean canPartition(int[] a) {
        int sum = 0;
        for (int x : a) sum += x;

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int x : a) {
            for (int s = target; s >= x; s--)
                dp[s] |= dp[s - x];
        }

        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
    }
}


