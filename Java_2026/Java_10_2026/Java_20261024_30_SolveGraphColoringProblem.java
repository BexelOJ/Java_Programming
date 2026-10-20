import java.util.Arrays;

public class Java_20261024_30_SolveGraphColoringProblem {
    static boolean safe(int[][] g, int[] colors, int v, int color) {
        for (int i = 0; i < g.length; i++)
            if (g[v][i] == 1 && colors[i] == color) return false;

        return true;
    }

    static boolean solve(int[][] g, int[] colors, int v, int m) {
        if (v == g.length) return true;

        for (int color = 1; color <= m; color++) {
            if (safe(g, colors, v, color)) {
                colors[v] = color;

                if (solve(g, colors, v + 1, m)) return true;

                colors[v] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] g = {
            {0,1,1,1},
            {1,0,1,0},
            {1,1,0,1},
            {1,0,1,0}
        };

        int[] colors = new int[g.length];

        if (solve(g, colors, 0, 3))
            System.out.println(Arrays.toString(colors));
        else
            System.out.println("No solution");
    }
}


