public class Java_20261025_29_WildcardMatching {
    static boolean matches(String s, String p) {
        int n = s.length(), m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;

        for (int j = 1; j <= m; j++)
            if (p.charAt(j - 1) == '*')
                dp[0][j] = dp[0][j - 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char ch = p.charAt(j - 1);

                if (ch == '*')
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                else if (ch == '?' || ch == s.charAt(i - 1))
                    dp[i][j] = dp[i - 1][j - 1];
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        System.out.println(matches("adceb", "*a*b")); // true
    }
}


