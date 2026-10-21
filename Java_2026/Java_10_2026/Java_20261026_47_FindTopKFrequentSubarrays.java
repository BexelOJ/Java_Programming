import java.util.*;

public class Java_20261026_47_FindTopKFrequentSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 3};
        int windowSize = 2;
        int k = 2;

        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i + windowSize <= arr.length; i++) {
            StringBuilder key = new StringBuilder();

            for (int j = i; j < i + windowSize; j++) {
                if (j > i) key.append(",");
                key.append(arr[j]);
            }

            freq.merge(key.toString(), 1, Integer::sum);
        }

        List<String> result = new ArrayList<>(freq.keySet());

        result.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : a.compareTo(b);
        });

        for (int i = 0; i < Math.min(k, result.size()); i++) {
            String subarray = result.get(i);
            System.out.println(subarray + " -> " + freq.get(subarray));
        }
    }
}


