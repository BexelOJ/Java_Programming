
import java.util.Arrays;
import java.util.PriorityQueue;

public class Java_20261022_40_MinimumCostToHireKWorkers {

    static class Worker {
        int quality;
        int wage;
        double ratio;

        Worker(int quality, int wage) {
            this.quality = quality;
            this.wage = wage;
            this.ratio = (double) wage / quality;
        }
    }

    public static double minCost(
            int[] quality, int[] wage, int k) {

        int n = quality.length;
        Worker[] workers = new Worker[n];

        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(quality[i], wage[i]);
        }

        Arrays.sort(workers,
            (a, b) -> Double.compare(a.ratio, b.ratio));

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        long qualitySum = 0;
        double answer = Double.POSITIVE_INFINITY;

        for (Worker worker : workers) {
            maxHeap.offer(worker.quality);
            qualitySum += worker.quality;

            if (maxHeap.size() > k) {
                qualitySum -= maxHeap.poll();
            }

            if (maxHeap.size() == k) {
                answer = Math.min(
                    answer, qualitySum * worker.ratio
                );
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] quality = {10, 20, 5};
        int[] wage = {70, 50, 30};

        System.out.printf(
            "Minimum hiring cost: %.5f%n",
            minCost(quality, wage, 2)
        );
    }
}



