import java.util.*;

public class Java_20261026_17_FindKPairsWithSmallestSums {
    static class Pair {
        int i, j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 7, 11};
        int[] b = {2, 4, 6};
        int k = 3;

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            Comparator.comparingLong(p -> (long) a[p.i] + b[p.j])
        );

        for (int i = 0; i < Math.min(k, a.length); i++)
            pq.offer(new Pair(i, 0));

        List<List<Integer>> result = new ArrayList<>();

        while (k-- > 0 && !pq.isEmpty()) {
            Pair p = pq.poll();
            result.add(Arrays.asList(a[p.i], b[p.j]));

            if (p.j + 1 < b.length)
                pq.offer(new Pair(p.i, p.j + 1));
        }

        System.out.println(result);
    }
}


