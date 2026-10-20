import java.util.*;

public class Java_20261024_33_FindAllTopologicalSorts {
    static void solve(int[][] g, boolean[] used,
                      int[] indegree, List<Integer> path) {
        if (path.size() == g.length) {
            System.out.println(path);
            return;
        }

        for (int v = 0; v < g.length; v++) {
            if (used[v] || indegree[v] != 0) continue;

            used[v] = true;
            path.add(v);

            for (int next = 0; next < g.length; next++)
                if (g[v][next] == 1) indegree[next]--;

            solve(g, used, indegree, path);

            for (int next = 0; next < g.length; next++)
                if (g[v][next] == 1) indegree[next]++;

            path.remove(path.size() - 1);
            used[v] = false;
        }
    }

    public static void main(String[] args) {
        int[][] g = {
            {0,1,1,0},
            {0,0,0,1},
            {0,0,0,1},
            {0,0,0,0}
        };

        int[] indegree = new int[g.length];
        for (int[] row : g)
            for (int v = 0; v < g.length; v++)
                indegree[v] += row[v];

        solve(g, new boolean[g.length], indegree, new ArrayList<>());
    }
}


