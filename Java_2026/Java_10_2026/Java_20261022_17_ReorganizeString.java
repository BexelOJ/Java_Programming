
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class Java_20261022_17_ReorganizeString {

    static class Entry {
        char character;
        int count;

        Entry(char character, int count) {
            this.character = character;
            this.count = count;
        }
    }

    public static String reorganize(String input) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char c : input.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Entry> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.count, a.count)
        );

        for (Map.Entry<Character, Integer> entry
                : frequency.entrySet()) {
            maxHeap.offer(
                new Entry(entry.getKey(), entry.getValue())
            );
        }

        StringBuilder result = new StringBuilder();
        Entry previous = null;

        while (!maxHeap.isEmpty()) {
            Entry current = maxHeap.poll();
            result.append(current.character);
            current.count--;

            if (previous != null && previous.count > 0) {
                maxHeap.offer(previous);
            }

            previous = current;
        }

        return result.length() == input.length()
            ? result.toString()
            : "";
    }

    public static void main(String[] args) {
        String input = "aaabbc";
        String result = reorganize(input);

        if (result.isEmpty() && !input.isEmpty()) {
            System.out.println("Reorganization is impossible.");
        } else {
            System.out.println("Reorganized string: " + result);
        }
    }
}



