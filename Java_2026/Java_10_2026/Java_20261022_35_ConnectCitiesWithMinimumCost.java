
import java.util.Arrays;

public class Java_20261022_35_ConnectCitiesWithMinimumCost {

    public static int minimumCost(int[][] cost) {
        int n = cost.length;
        boolean[] visited = new boolean[n];
        int[] minEdge = new int[n];

        Arrays.fill(minEdge, Integer.MAX_VALUE);
        minEdge[0] = 0;

        int total = 0;

        for (int count = 0; count < n; count++) {
            int u = -1;

            for (int i = 0; i < n; i++) {
                if (!visited[i] &&
                        (u == -1 || minEdge[i] < minEdge[u])) {
                    u = i;
                }
            }

            if (u == -1 || minEdge[u] == Integer.MAX_VALUE) {
                throw new IllegalArgumentException(
                    "Cities cannot all be connected."
                );
            }

            visited[u] = true;
            total += minEdge[u];

            for (int v = 0; v < n; v++) {
                if (!visited[v] && cost[u][v] > 0 &&
                        cost[u][v] < minEdge[v]) {
                    minEdge[v] = cost[u][v];
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[][] cost = {
            {0, 1, 3, 0},
            {1, 0, 2, 4},
            {3, 2, 0, 5},
            {0, 4, 5, 0}
        };

        System.out.println(
            "Minimum connection cost: " + minimumCost(cost)
        );
    }
}



