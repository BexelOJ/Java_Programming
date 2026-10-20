
import java.util.Arrays;

public class Java_20261022_39_MaximumProfitInJobScheduling {

    static class Job {
        int start, end, profit;

        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public static int maxProfit(
            int[] start, int[] end, int[] profit) {

        int n = start.length;
        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(start[i], end[i], profit[i]);
        }

        Arrays.sort(jobs,
            (a, b) -> Integer.compare(a.end, b.end));

        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            ends[i] = jobs[i].end;
        }

        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            Job job = jobs[i - 1];

            int low = 0, high = i - 1;
            int compatible = 0;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (ends[mid] <= job.start) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            // Number of earlier jobs ending <= this job's start.
            compatible = low;
            if (compatible < i - 1 &&
                    ends[compatible] <= job.start) {
                compatible++;
            }

            int take = job.profit + dp[compatible];
            int skip = dp[i - 1];

            dp[i] = Math.max(take, skip);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int[] start = {1, 2, 3, 3};
        int[] end = {3, 4, 5, 6};
        int[] profit = {50, 10, 40, 70};

        System.out.println(
            "Maximum profit: " + maxProfit(start, end, profit)
        );
    }
}



