import java.util.*;

public class Java_20261026_28_FindKthSmallestElementInStream {
    public static void main(String[] args) {
        int[] stream = {7, 10, 4, 3, 20, 15};
        int k = 3;

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int n : stream) {
            maxHeap.offer(n);

            if (maxHeap.size() > k)
                maxHeap.poll();

            System.out.println(
                maxHeap.size() < k ? "Not enough elements" : maxHeap.peek()
            );
        }
    }
}



