public class Java_20261024_29_FindAllHamiltonianPaths {
    static void solve(int[][] g, boolean[] used, int current,
                      int count, String path) {
        if (count == g.length) {
            System.out.println(path);
            return;
        }

        for (int next = 0; next < g.length; next++) {
            if (g[current][next] == 1 && !used[next]) {
                used[next] = true;
                solve(g, used, next, count + 1, path + " -> " + next);
                used[next] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] g = {
            {0,1,1,0},
            {1,0,1,1},
            {1,1,0,1},
            {0,1,1,0}
        };

        for (int start = 0; start < g.length; start++) {
            boolean[] used = new boolean[g.length];
            used[start] = true;
            solve(g, used, start, 1, "" + start);
        }
    }
}


