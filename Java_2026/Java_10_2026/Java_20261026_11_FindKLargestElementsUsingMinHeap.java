import java.util.*;

public class Java_20261026_11_FindKLargestElementsUsingMinHeap {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : arr) {
            minHeap.offer(n);
            if (minHeap.size() > k)
                minHeap.poll();
        }

        List<Integer> result = new ArrayList<>(minHeap);
        Collections.sort(result);
        System.out.println(result);
    }
}


