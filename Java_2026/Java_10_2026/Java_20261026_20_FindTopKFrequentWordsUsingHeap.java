import java.util.*;

public class Java_20261026_20_FindTopKFrequentWordsUsingHeap {
    public static void main(String[] args) {
        String[] words = {
            "i", "love", "leetcode", "i", "love", "coding"
        };
        int k = 2;

        Map<String, Integer> freq = new HashMap<>();
        for (String word : words)
            freq.merge(word, 1, Integer::sum);

        PriorityQueue<String> heap = new PriorityQueue<>((a, b) -> {
            int cmp = Integer.compare(freq.get(a), freq.get(b));
            return cmp != 0 ? cmp : b.compareTo(a);
        });

        for (String word : freq.keySet()) {
            heap.offer(word);
            if (heap.size() > k)
                heap.poll();
        }

        List<String> result = new ArrayList<>(heap);
        result.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : a.compareTo(b);
        });

        System.out.println(result);
    }
}

