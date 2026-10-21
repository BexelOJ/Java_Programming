import java.util.*;

public class Java_20261026_49_FindKBestItemsByCustomScore {
    static class Item {
        String name;
        int rating;
        int popularity;

        Item(String name, int rating, int popularity) {
            this.name = name;
            this.rating = rating;
            this.popularity = popularity;
        }

        long score() {
            return (long) rating * popularity;
        }

        @Override
        public String toString() {
            return name + " (score=" + score() + ")";
        }
    }

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
            new Item("Laptop", 5, 90),
            new Item("Phone", 4, 100),
            new Item("Tablet", 5, 60),
            new Item("Monitor", 4, 80)
        );

        int k = 3;

        PriorityQueue<Item> minHeap = new PriorityQueue<>((a, b) -> {
            int cmp = Long.compare(a.score(), b.score());
            return cmp != 0 ? cmp : b.name.compareTo(a.name);
        });

        for (Item item : items) {
            minHeap.offer(item);
            if (minHeap.size() > k)
                minHeap.poll();
        }

        List<Item> result = new ArrayList<>(minHeap);
        result.sort((a, b) -> {
            int cmp = Long.compare(b.score(), a.score());
            return cmp != 0 ? cmp : a.name.compareTo(b.name);
        });

        result.forEach(System.out::println);
    }
}


