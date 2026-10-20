
import java.util.PriorityQueue;

public class Java_20261022_09_MinimumCostToConnectRopes {

    public static long minimumCost(int[] ropes) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for (int rope : ropes) {
            minHeap.offer((long) rope);
        }

        long totalCost = 0;

        while (minHeap.size() > 1) {
            long first = minHeap.poll();
            long second = minHeap.poll();

            long combined = first + second;
            totalCost += combined;

            minHeap.offer(combined);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};

        System.out.println(
            "Minimum connection cost: " + minimumCost(ropes)
        );
    }
}



