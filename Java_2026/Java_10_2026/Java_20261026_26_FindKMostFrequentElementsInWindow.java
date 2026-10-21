import java.util.*;

public class Java_20261026_26_FindKMostFrequentElementsInWindow {
    static void printTopK(Map<Integer, Integer> freq, int k) {
        List<Integer> result = new ArrayList<>(freq.keySet());

        result.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        System.out.println(
            result.subList(0, Math.min(k, result.size()))
        );
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 1, 2, 4};
        int windowSize = 4;
        int k = 2;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            freq.merge(arr[i], 1, Integer::sum);

            if (i >= windowSize) {
                int outgoing = arr[i - windowSize];
                freq.compute(outgoing, (key, count) ->
                    count == 1 ? null : count - 1
                );
            }

            if (i >= windowSize - 1) {
                System.out.print("Window ending at index " + i + ": ");
                printTopK(freq, k);
            }
        }
    }
}


