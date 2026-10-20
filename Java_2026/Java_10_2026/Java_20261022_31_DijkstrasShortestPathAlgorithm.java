
import java.util.*;

public class Java_20261022_31_DijkstrasShortestPathAlgorithm {

    static class Edge {
        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node {
        int vertex;
        long distance;

        Node(int vertex, long distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }

    public static long[] dijkstra(
            List<List<Edge>> graph, int source) {

        int n = graph.size();
        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(
            Comparator.comparingLong(node -> node.distance)
        );
        pq.offer(new Node(source, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();

            if (current.distance != distance[current.vertex]) {
                continue;
            }

            for (Edge edge : graph.get(current.vertex)) {
                long nextDistance =
                    current.distance + edge.weight;

                if (nextDistance < distance[edge.to]) {
                    distance[edge.to] = nextDistance;
                    pq.offer(new Node(edge.to, nextDistance));
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));
        graph.get(2).add(new Edge(1, 2));
        graph.get(1).add(new Edge(3, 1));
        graph.get(2).add(new Edge(3, 5));
        graph.get(3).add(new Edge(4, 3));

        long[] distances = dijkstra(graph, 0);

        for (int i = 0; i < n; i++) {
            System.out.println(
                "Distance to " + i + ": " +
                (distances[i] == Long.MAX_VALUE
                    ? "unreachable" : distances[i])
            );
        }
    }
}



