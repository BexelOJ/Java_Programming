
import java.util.Arrays;
import java.util.Comparator;

public class Java_20261022_11_JobSequencingWithDeadlines {

    static class Job {
        char id;
        int deadline, profit;

        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('B', 1, 19),
            new Job('C', 2, 27),
            new Job('D', 1, 25),
            new Job('E', 3, 15)
        };

        Arrays.sort(jobs,
            Comparator.comparingInt((Job j) -> j.profit).reversed());

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        char[] slots = new char[maxDeadline + 1];
        int count = 0;
        int profit = 0;

        for (Job job : jobs) {
            for (int slot = Math.min(job.deadline, maxDeadline);
                 slot >= 1; slot--) {
                if (slots[slot] == '\0') {
                    slots[slot] = job.id;
                    count++;
                    profit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Job sequence:");
        for (int i = 1; i <= maxDeadline; i++) {
            if (slots[i] != '\0') {
                System.out.println("Slot " + i + ": " + slots[i]);
            }
        }

        System.out.println("Jobs completed: " + count);
        System.out.println("Maximum profit: " + profit);
    }
}


