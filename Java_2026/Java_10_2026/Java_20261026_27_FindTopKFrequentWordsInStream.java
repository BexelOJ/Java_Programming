import java.util.*;

public class Java_20261026_27_FindTopKFrequentWordsInStream {
    public static void main(String[] args) {
        String[] stream = {
            "java", "python", "java", "c", "python", "java"
        };
        int k = 2;

        Map<String, Integer> freq = new HashMap<>();

        for (String word : stream) {
            freq.merge(word, 1, Integer::sum);

            List<String> result = new ArrayList<>(freq.keySet());
            result.sort((a, b) -> {
                int cmp = Integer.compare(freq.get(b), freq.get(a));
                return cmp != 0 ? cmp : a.compareTo(b);
            });

            System.out.println(
                result.subList(0, Math.min(k, result.size()))
            );
        }
    }
}


