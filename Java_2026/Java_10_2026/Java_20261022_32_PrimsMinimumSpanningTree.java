
import java.util.*;

public class Java_20261022_32_PrimsMinimumSpanningTree {

    static class Edge {
        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node {
        int vertex, weight;

        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    public static long prim(
            List<List<Edge>> graph, int source) {

        int n = graph.size();
        boolean[] visited = new boolean[n];

        PriorityQueue<Node> pq = new PriorityQueue<>(
            Comparator.comparingInt(node -> node.weight)
        );

        pq.offer(new Node(source, 0));
        long totalCost = 0;
        int visitedCount = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (visited[current.vertex]) {
                continue;
            }

            visited[current.vertex] = true;
            visitedCount++;
            totalCost += current.weight;

            for (Edge edge : graph.get(current.vertex)) {
                if (!visited[edge.to]) {
                    pq.offer(new Node(edge.to, edge.weight));
                }
            }
        }

        if (visitedCount != n) {
            throw new IllegalArgumentException(
                "Graph is disconnected; no spanning tree exists."
            );
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 2, 6);
        addEdge(graph, 0, 3, 5);
        addEdge(graph, 1, 3, 15);
        addEdge(graph, 2, 3, 4);

        System.out.println("MST cost: " + prim(graph, 0));
    }

    static void addEdge(
            List<List<Edge>> graph, int u, int v, int weight) {
        graph.get(u).add(new Edge(v, weight));
        graph.get(v).add(new Edge(u, weight));
    }
}



