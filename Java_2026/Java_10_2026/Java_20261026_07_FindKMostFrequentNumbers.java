import java.util.*;

public class Java_20261026_07_FindKMostFrequentNumbers {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 2, 2, 2, 3, 3};
        int k = 2;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : arr)
            freq.merge(n, 1, Integer::sum);

        List<Integer> result = new ArrayList<>(freq.keySet());
        result.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        System.out.println(result.subList(0, Math.min(k, result.size())));
    }
}

	
