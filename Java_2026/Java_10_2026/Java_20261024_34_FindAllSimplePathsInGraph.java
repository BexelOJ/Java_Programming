import java.util.*;

public class Java_20261024_34_FindAllSimplePathsInGraph {
    static void solve(int[][] g, int current, int target,
                      boolean[] used, List<Integer> path) {
        if (current == target) {
            System.out.println(path);
            return;
        }

        for (int next = 0; next < g.length; next++) {
            if (g[current][next] == 1 && !used[next]) {
                used[next] = true;
                path.add(next);

                solve(g, next, target, used, path);

                path.remove(path.size() - 1);
                used[next] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] g = {
            {0,1,1,0},
            {0,0,1,1},
            {0,0,0,1},
            {0,0,0,0}
        };

        boolean[] used = new boolean[g.length];
        used[0] = true;

        List<Integer> path = new ArrayList<>();
        path.add(0);

        solve(g, 0, 3, used, path);
    }
}


