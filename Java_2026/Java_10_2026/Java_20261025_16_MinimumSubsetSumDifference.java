public class Java_20261025_16_MinimumSubsetSumDifference {
    static int minDifference(int[] a) {
        int total = 0;
        for (int x : a) total += x;

        boolean[] dp = new boolean[total / 2 + 1];
        dp[0] = true;

        for (int x : a) {
            for (int s = total / 2; s >= x; s--)
                dp[s] |= dp[s - x];
        }

        for (int s = total / 2; s >= 0; s--)
            if (dp[s]) return total - 2 * s;

        return total;
    }

    public static void main(String[] args) {
        System.out.println(minDifference(new int[]{1, 6, 11, 5})); // 1
    }
}


