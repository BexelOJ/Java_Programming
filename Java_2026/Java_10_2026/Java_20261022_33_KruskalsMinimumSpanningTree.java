
import java.util.*;

public class Java_20261022_33_KruskalsMinimumSpanningTree {

    static class Edge {
        int u, v, weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
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
            int rootA = find(a);
            int rootB = find(b);

            if (rootA == rootB) {
                return false;
            }

            if (rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            } else if (rank[rootA] > rank[rootB]) {
                parent[rootB] = rootA;
            } else {
                parent[rootB] = rootA;
                rank[rootA]++;
            }

            return true;
        }
    }

    public static long kruskal(int n, Edge[] edges) {
        Arrays.sort(edges,
            Comparator.comparingInt(edge -> edge.weight));

        DSU dsu = new DSU(n);
        long total = 0;
        int selected = 0;

        for (Edge edge : edges) {
            if (dsu.union(edge.u, edge.v)) {
                total += edge.weight;
                selected++;

                System.out.println(
                    edge.u + " - " + edge.v +
                    " : " + edge.weight
                );

                if (selected == n - 1) {
                    break;
                }
            }
        }

        if (selected != n - 1) {
            throw new IllegalArgumentException(
                "Graph is disconnected."
            );
        }

        return total;
    }

    public static void main(String[] args) {
        Edge[] edges = {
            new Edge(0, 1, 10),
            new Edge(0, 2, 6),
            new Edge(0, 3, 5),
            new Edge(1, 3, 15),
            new Edge(2, 3, 4)
        };

        System.out.println("MST edges:");
        System.out.println("MST cost: " + kruskal(4, edges));
    }
}



