import java.util.*;

public class Java_20261025_35_TriangleMinimumPathSum {
    static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];

        for (int j = 0; j < n; j++)
            dp[j] = triangle.get(n - 1).get(j);

        for (int r = n - 2; r >= 0; r--) {
            for (int c = 0; c <= r; c++) {
                dp[c] = triangle.get(r).get(c) +
                    Math.min(dp[c], dp[c + 1]);
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );

        System.out.println(minimumTotal(triangle)); // 11
    }
}


