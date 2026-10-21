import java.util.*;

public class Java_20261026_42_FindKPairsWithLargestSums {
    static class Pair {
        int i, j, sum;

        Pair(int i, int j, int sum) {
            this.i = i;
            this.j = j;
            this.sum = sum;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 7, 11};
        int[] b = {2, 4, 6};
        int k = 3;

        Arrays.sort(a);
        Arrays.sort(b);

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((x, y) -> Integer.compare(y.sum, x.sum));

        Set<String> visited = new HashSet<>();
        int i = a.length - 1;
        int j = b.length - 1;

        pq.offer(new Pair(i, j, a[i] + b[j]));
        visited.add(i + "," + j);

        List<List<Integer>> result = new ArrayList<>();

        while (result.size() < k && !pq.isEmpty()) {
            Pair p = pq.poll();
            result.add(Arrays.asList(a[p.i], b[p.j]));

            int[][] next = {
                {p.i - 1, p.j},
                {p.i, p.j - 1}
            };

            for (int[] pos : next) {
                int x = pos[0], y = pos[1];
                String key = x + "," + y;

                if (x >= 0 && y >= 0 && visited.add(key))
                    pq.offer(new Pair(x, y, a[x] + b[y]));
            }
        }

        System.out.println(result);
    }
}


