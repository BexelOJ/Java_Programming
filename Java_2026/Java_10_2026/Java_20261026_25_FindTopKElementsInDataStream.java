import java.util.*;

public class Java_20261026_25_FindTopKElementsInDataStream {
    public static void main(String[] args) {
        int[] stream = {5, 1, 9, 3, 12, 7, 10};
        int k = 3;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : stream) {
            minHeap.offer(n);
            if (minHeap.size() > k)
                minHeap.poll();
        }

        List<Integer> result = new ArrayList<>(minHeap);
        result.sort(Collections.reverseOrder());
        System.out.println(result);
    }
}


