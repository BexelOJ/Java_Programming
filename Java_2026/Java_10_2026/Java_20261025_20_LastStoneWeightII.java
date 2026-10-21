public class Java_20261025_20_LastStoneWeightII {
    static int lastStoneWeight(int[] stones) {
        int sum = 0;
        for (int x : stones) sum += x;

        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int stone : stones) {
            for (int s = target; s >= stone; s--)
                dp[s] |= dp[s - stone];
        }

        for (int s = target; s >= 0; s--)
            if (dp[s]) return sum - 2 * s;

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
        // 1
    }
}


