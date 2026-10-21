import java.util.*;

public class Java_20261026_34_FindKthLargestInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;

        if (k < 1 || k > arr.length)
            throw new IllegalArgumentException("Invalid k");

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : arr) {
            minHeap.offer(n);
            if (minHeap.size() > k)
                minHeap.poll();
        }

        System.out.println(minHeap.peek());
    }
}


