import java.util.*;

public class Java_20261026_19_FindTopKFrequentElementsUsingHeap {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : arr)
            freq.merge(n, 1, Integer::sum);

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {
            int cmp = Integer.compare(freq.get(a), freq.get(b));
            return cmp != 0 ? cmp : Integer.compare(b, a);
        });

        for (int n : freq.keySet()) {
            heap.offer(n);
            if (heap.size() > k)
                heap.poll();
        }

        List<Integer> result = new ArrayList<>();
        while (!heap.isEmpty())
            result.add(heap.poll());

        result.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        System.out.println(result);
    }
}


