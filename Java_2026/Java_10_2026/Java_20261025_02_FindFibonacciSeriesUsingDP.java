import java.util.Arrays;

public class Java_20261025_02_FindFibonacciSeriesUsingDP {
    static int[] fibonacciSeries(int n) {
        int[] dp = new int[n];

        if (n > 0) dp[0] = 0;
        if (n > 1) dp[1] = 1;

        for (int i = 2; i < n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];

        return dp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibonacciSeries(10)));
    }
}


