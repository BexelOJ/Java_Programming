public class Java_20261025_13_SubsetSumProblem {
    static boolean subsetSum(int[] a, int target) {
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int x : a) {
            for (int s = target; s >= x; s--) {
                dp[s] |= dp[s - x];
            }
        }
        return dp[target];
    }

    public static void main(String[] args) {
        System.out.println(subsetSum(new int[]{3, 34, 4, 12, 5, 2}, 9));
    }
}


