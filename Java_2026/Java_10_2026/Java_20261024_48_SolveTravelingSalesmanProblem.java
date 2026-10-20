public class Java_20261024_48_SolveTravelingSalesmanProblem {
    static int[][] cost = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };

    static int best = Integer.MAX_VALUE;

    static void solve(int current, int count, int total,
                      boolean[] visited) {
        if (total >= best) return;

        if (count == cost.length) {
            best = Math.min(best, total + cost[current][0]);
            return;
        }

        for (int next = 0; next < cost.length; next++) {
            if (!visited[next]) {
                visited[next] = true;

                solve(next, count + 1,
                      total + cost[current][next], visited);

                visited[next] = false;
            }
        }
    }

    public static void main(String[] args) {
        boolean[] visited = new boolean[cost.length];
        visited[0] = true;

        solve(0, 1, 0, visited);

        System.out.println("Minimum tour cost: " + best);
    }
}


