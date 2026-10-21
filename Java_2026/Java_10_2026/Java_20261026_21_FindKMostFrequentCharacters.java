import java.util.*;

public class Java_20261026_21_FindKMostFrequentCharacters {
    public static void main(String[] args) {
        String input = "mississippi";
        int k = 3;

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : input.toCharArray())
            freq.merge(c, 1, Integer::sum);

        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(b), freq.get(a));
            return cmp != 0 ? cmp : Character.compare(a, b);
        });

        for (int i = 0; i < Math.min(k, chars.size()); i++) {
            char c = chars.get(i);
            System.out.println(c + " -> " + freq.get(c));
        }
    }
}


