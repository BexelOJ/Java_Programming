import java.util.*;

public class Java_20261026_23_FindKthLargestElementInAStream {
    public static void main(String[] args) {
        int k = 3;
        int[] stream = {4, 5, 8, 2, 10, 9, 1};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : stream) {
            minHeap.offer(n);

            if (minHeap.size() > k)
                minHeap.poll();

            System.out.println(
                minHeap.size() < k ? "Not enough elements" : minHeap.peek()
            );
        }
    }
}


