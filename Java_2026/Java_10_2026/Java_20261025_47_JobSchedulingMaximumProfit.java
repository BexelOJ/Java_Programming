import java.util.Arrays;
import java.util.Comparator;

public class Java_20261025_47_JobSchedulingMaximumProfit {
    static class Job {
        int start, end, profit;

        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    static int maxProfit(int[] start, int[] end, int[] profit) {
        int n = start.length;
        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++)
            jobs[i] = new Job(start[i], end[i], profit[i]);

        Arrays.sort(jobs, Comparator.comparingInt(j -> j.end));

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            Job current = jobs[i - 1];

            int low = 0, high = i - 1;

            while (low < high) {
                int mid = (low + high) / 2;

                if (jobs[mid].end <= current.start)
                    low = mid + 1;
                else
                    high = mid;
            }

            int compatible = low;
            if (compatible < i - 1 &&
                jobs[compatible].end > current.start)
                compatible--;

            if (i == 1) compatible = -1;

            int include = current.profit +
                dp[compatible + 1];

            dp[i] = Math.max(dp[i - 1], include);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(
            new int[]{1, 2, 3, 3},
            new int[]{3, 4, 5, 6},
            new int[]{50, 10, 40, 70}
        )); // 120
    }
}


