
import java.util.*;

public class Java_20261022_37_OptimizeWaterDistributionInAVillage {

    static class Edge {
        int u, v, cost;

        Edge(int u, int v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }

    static class DSU {
        int[] parent, rank;

        DSU(int n) {
            parent = new int[n];
            rank = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean union(int a, int b) {
            int x = find(a);
            int y = find(b);

            if (x == y) {
                return false;
            }

            if (rank[x] < rank[y]) {
                parent[x] = y;
            } else if (rank[x] > rank[y]) {
                parent[y] = x;
            } else {
                parent[y] = x;
                rank[x]++;
            }

            return true;
        }
    }

    public static long minCost(
            int n, int[] wells, int[][] pipes) {

        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            edges.add(new Edge(0, i + 1, wells[i]));
        }

        for (int[] pipe : pipes) {
            edges.add(new Edge(pipe[0], pipe[1], pipe[2]));
        }

        edges.sort(Comparator.comparingInt(e -> e.cost));

        DSU dsu = new DSU(n + 1);
        long total = 0;
        int selected = 0;

        for (Edge edge : edges) {
            if (dsu.union(edge.u, edge.v)) {
                total += edge.cost;
                selected++;

                if (selected == n) {
                    break;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] wells = {1, 2, 2};

        int[][] pipes = {
            {1, 2, 1},
            {2, 3, 1}
        };

        System.out.println(
            "Minimum water distribution cost: " +
            minCost(n, wells, pipes)
        );
    }
}



