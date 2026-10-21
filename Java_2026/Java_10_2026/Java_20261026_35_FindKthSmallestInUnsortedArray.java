import java.util.*;

public class Java_20261026_35_FindKthSmallestInUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        if (k < 1 || k > arr.length)
            throw new IllegalArgumentException("Invalid k");

        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int n : arr) {
            maxHeap.offer(n);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }

        System.out.println(maxHeap.peek());
    }
}


