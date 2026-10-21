public class Java_20261025_43_PalindromePartitioningMinimumCuts {
    static int minCut(String s) {
        int n = s.length();
        if (n <= 1) return 0;

        boolean[][] palindrome = new boolean[n][n];
        int[] cuts = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            cuts[i] = n - i - 1;

            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) &&
                    (j - i <= 2 || palindrome[i + 1][j - 1])) {

                    palindrome[i][j] = true;

                    if (j == n - 1)
                        cuts[i] = 0;
                    else
                        cuts[i] = Math.min(cuts[i], 1 + cuts[j + 1]);
                }
            }
        }

        return cuts[0];
    }

    public static void main(String[] args) {
        System.out.println(minCut("aab")); // 1
    }
}


