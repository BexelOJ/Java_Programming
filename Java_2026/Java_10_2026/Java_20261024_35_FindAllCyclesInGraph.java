import java.util.*;

public class Java_20261024_35_FindAllCyclesInGraph {
    static void solve(int[][] g, int start, int current,
                      boolean[] used, List<Integer> path) {
        for (int next = start; next < g.length; next++) {
            if (g[current][next] == 0) continue;

            if (next == start && path.size() >= 3) {
                System.out.println(path + " -> " + start);
            } else if (!used[next]) {
                used[next] = true;
                path.add(next);

                solve(g, start, next, used, path);

                path.remove(path.size() - 1);
                used[next] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] g = {
            {0,1,1,1},
            {1,0,1,0},
            {1,1,0,1},
            {1,0,1,0}
        };

        for (int start = 0; start < g.length; start++) {
            boolean[] used = new boolean[g.length];
            used[start] = true;

            List<Integer> path = new ArrayList<>();
            path.add(start);

            solve(g, start, start, used, path);
        }
    }
}


