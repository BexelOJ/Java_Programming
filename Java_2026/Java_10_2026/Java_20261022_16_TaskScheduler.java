
public class Java_20261022_16_TaskScheduler {

    public static int leastInterval(char[] tasks, int n) {
        int[] frequency = new int[26];

        for (char task : tasks) {
            frequency[task - 'A']++;
        }

        int maxFrequency = 0;
        for (int count : frequency) {
            maxFrequency = Math.max(maxFrequency, count);
        }

        int maxCount = 0;
        for (int count : frequency) {
            if (count == maxFrequency) {
                maxCount++;
            }
        }

        int intervals =
            (maxFrequency - 1) * (n + 1) + maxCount;

        return Math.max(tasks.length, intervals);
    }

    public static void main(String[] args) {
        char[] tasks = {
            'A', 'A', 'A', 'B', 'B', 'B'
        };

        int cooldown = 2;

        System.out.println(
            "Minimum intervals: " +
            leastInterval(tasks, cooldown)
        );
    }
}



