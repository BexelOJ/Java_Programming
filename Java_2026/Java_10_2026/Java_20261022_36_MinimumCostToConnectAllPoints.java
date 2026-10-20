
import java.util.Arrays;

public class Java_20261022_36_MinimumCostToConnectAllPoints {

    public static long minCostConnectPoints(int[][] points) {
        int n = points.length;

        if (n <= 1) {
            return 0;
        }

        int[] minDistance = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(minDistance, Integer.MAX_VALUE);
        minDistance[0] = 0;

        long totalCost = 0;

        for (int count = 0; count < n; count++) {
            int u = -1;

            for (int i = 0; i < n; i++) {
                if (!visited[i] &&
                        (u == -1 ||
                         minDistance[i] < minDistance[u])) {
                    u = i;
                }
            }

            visited[u] = true;
            totalCost += minDistance[u];

            for (int v = 0; v < n; v++) {
                if (!visited[v]) {
                    int distance =
                        Math.abs(points[u][0] - points[v][0]) +
                        Math.abs(points[u][1] - points[v][1]);

                    minDistance[v] = Math.min(
                        minDistance[v], distance
                    );
                }
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[][] points = {
            {0, 0},
            {2, 2},
            {3, 10},
            {5, 2},
            {7, 0}
        };

        System.out.println(
            "Minimum connection cost: " +
            minCostConnectPoints(points)
        );
    }
}



