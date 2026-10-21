import java.util.*;

public class Java_20261026_48_FindKMostCommonWordsInDocuments {
    public static void main(String[] args) {
        String[] documents = {
            "Java is powerful",
            "Java is popular",
            "Python is popular",
            "Java and Python"
        };

        int k = 3;
        Map<String, Integer> freq = new HashMap<>();

        for (String document : documents) {
            String normalized = document.toLowerCase()
                .replaceAll("[^a-z0-9\\s]", " ");

            for (String word : normalized.trim().split("\\s+")) {
                if (!word.isEmpty())
                    freq.merge(word, 1, Integer::sum);
            }
        }

        List<String> words = new ArrayList<>(freq.keySet());

        words.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : a.compareTo(b);
        });

        for (int i = 0; i < Math.min(k, words.size()); i++) {
            String word = words.get(i);
            System.out.println(word + " -> " + freq.get(word));
        }
    }
}


