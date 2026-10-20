public class Java_20261023_47_FindHamiltonianPaths {
    static void find(int[][] graph, boolean[] visited,
                     int current, int count, String path) {
        if (count == graph.length) {
            System.out.println(path);
            return;
        }

        for (int next = 0; next < graph.length; next++) {
            if (graph[current][next] == 1 && !visited[next]) {
                visited[next] = true;

                find(graph, visited, next, count + 1,
                     path + " -> " + next);

                visited[next] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0,1,1,0},
            {1,0,1,1},
            {1,1,0,1},
            {0,1,1,0}
        };

        for (int start = 0; start < graph.length; start++) {
            boolean[] visited = new boolean[graph.length];
            visited[start] = true;
            find(graph, visited, start, 1, "" + start);
        }
    }
}


