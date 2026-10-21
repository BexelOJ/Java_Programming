import java.util.*;

public class Java_20261026_29_FindKMostFrequentIDs {
    public static void main(String[] args) {
        int[] ids = {101, 102, 101, 103, 102, 101, 104};
        int k = 2;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int id : ids)
            freq.merge(id, 1, Integer::sum);

        List<Integer> result = new ArrayList<>(freq.keySet());
        result.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : Integer.compare(a, b);
        });

        System.out.println(result.subList(0, Math.min(k, result.size())));
    }
}


