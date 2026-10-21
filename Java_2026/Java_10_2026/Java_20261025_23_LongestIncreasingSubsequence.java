import java.util.Arrays;

public class Java_20261025_23_LongestIncreasingSubsequence {
    static int lis(int[] a) {
        if (a.length == 0) return 0;

        int[] dp = new int[a.length];
        Arrays.fill(dp, 1);
        int best = 1;

        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            best = Math.max(best, dp[i]);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(lis(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        // 4
    }
}


