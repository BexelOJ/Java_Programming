public class Java_20261023_43_SolveRatInMaze {
    static int[][] maze = {
        {1, 1, 0, 1},
        {0, 1, 1, 1},
        {1, 1, 0, 1},
        {0, 1, 1, 1}
    };

    static boolean solve(int r, int c, boolean[][] visited,
                         String path) {
        int n = maze.length;

        if (r < 0 || c < 0 || r >= n || c >= n ||
            maze[r][c] == 0 || visited[r][c]) return false;

        if (r == n - 1 && c == n - 1) {
            System.out.println(path);
            return true;
        }

        visited[r][c] = true;

        solve(r + 1, c, visited, path + "D");
        solve(r, c + 1, visited, path + "R");
        solve(r - 1, c, visited, path + "U");
        solve(r, c - 1, visited, path + "L");

        visited[r][c] = false;
        return true;
    }

    public static void main(String[] args) {
        solve(0, 0, new boolean[4][4], "");
    }
}


