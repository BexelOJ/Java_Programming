import java.util.*;

public class Java_20261026_41_FindKMaximumSumCombinations {
    static class Node {
        int i, j, sum;

        Node(int i, int j, int sum) {
            this.i = i;
            this.j = j;
            this.sum = sum;
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 1};
        int[] b = {5, 3, 1};
        int k = 4;

        Arrays.sort(a);
        Arrays.sort(b);

        PriorityQueue<Node> pq =
            new PriorityQueue<>((x, y) -> Integer.compare(y.sum, x.sum));

        Set<String> visited = new HashSet<>();
        int i = a.length - 1;
        int j = b.length - 1;

        pq.offer(new Node(i, j, a[i] + b[j]));
        visited.add(i + "," + j);

        List<Integer> result = new ArrayList<>();

        while (result.size() < k && !pq.isEmpty()) {
            Node node = pq.poll();
            result.add(node.sum);

            int[][] next = {
                {node.i - 1, node.j},
                {node.i, node.j - 1}
            };

            for (int[] p : next) {
                int x = p[0], y = p[1];
                String key = x + "," + y;

                if (x >= 0 && y >= 0 && visited.add(key)) {
                    pq.offer(new Node(x, y, a[x] + b[y]));
                }
            }
        }

        System.out.println(result);
    }
}


