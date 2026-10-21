public class Java_20261025_27_DistinctSubsequences {
    static long count(String s, String t) {
        long[] dp = new long[t.length() + 1];
        dp[0] = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = t.length(); j >= 1; j--) {
                if (s.charAt(i) == t.charAt(j - 1))
                    dp[j] += dp[j - 1];
            }
        }

        return dp[t.length()];
    }

    public static void main(String[] args) {
        System.out.println(count("rabbbit", "rabbit")); // 3
    }
}


