import java.util.*;

public class Java_20261026_13_FindKthLargestUsingMinHeap {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : arr) {
            minHeap.offer(n);
            if (minHeap.size() > k)
                minHeap.poll();
        }

        System.out.println(minHeap.peek());
    }
}


