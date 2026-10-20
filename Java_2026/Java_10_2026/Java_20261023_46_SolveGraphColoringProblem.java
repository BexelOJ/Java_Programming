public class Java_20261023_46_SolveGraphColoringProblem {
    static boolean safe(int[][] graph, int[] colors,
                        int vertex, int color) {
        for (int i = 0; i < graph.length; i++)
            if (graph[vertex][i] == 1 && colors[i] == color)
                return false;

        return true;
    }

    static boolean solve(int[][] graph, int[] colors,
                         int vertex, int m) {
        if (vertex == graph.length) return true;

        for (int color = 1; color <= m; color++) {
            if (safe(graph, colors, vertex, color)) {
                colors[vertex] = color;

                if (solve(graph, colors, vertex + 1, m))
                    return true;

                colors[vertex] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0,1,1,1},
            {1,0,1,0},
            {1,1,0,1},
            {1,0,1,0}
        };

        int[] colors = new int[graph.length];

        if (solve(graph, colors, 0, 3))
            System.out.println(java.util.Arrays.toString(colors));
        else
            System.out.println("No coloring possible");
    }
}


